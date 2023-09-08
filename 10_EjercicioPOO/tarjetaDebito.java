import java.util.Date;
public class tarjetaDebito{
    private String titular;
    private String numeroTarjeta;
    private String banco;
    private int dineroTotal;
    private int montoMax;
    private String [] transacciones;
    private String clave;
    private String estado;

    public tarjetaDebito(String titular, String numeroTarjeta, String banco, int dineroTotal, int montoMax, String clave, String estado){
        this.titular = titular;
        this.numeroTarjeta = numeroTarjeta;
        this.banco = banco;
        this.dineroTotal = dineroTotal;
        this.montoMax = montoMax;
        this.transacciones = new String[10];
        this.clave = clave;
        this.estado = estado;
    }

    public boolean disminuirSaldo(int monto, String pass){

        if(pass.equals(clave)){
            if(monto > 0 &&  monto <= montoMax && estado.equals("ACTIVA")){
                this.dineroTotal = dineroTotal - monto;

                System.out.println("   ===> TRANSACCION EXITOSA EN TARJETA <===");
                registrarTransaccion("RETIRO", monto, estado);
                imprimirDetalle();
                            
                return true;

            }else{

                System.out.println("   ===> ERROR EN MONTO INGRESADO <===");
                registrarTransaccion("RETIRO DENEGADO", monto, estado);
                imprimirDetalle();
                return false;
            } 

        }else{
            System.out.println("   ===> ERROR EN DISMINUIR SALDO <===");
            registrarTransaccion("DISMINUIRSALDO", monto, "ERROR");
            return false;
        }

              
    }

    public boolean aumentarSaldo(int monto, String pass){
        if(pass.equals(clave)){
            if(monto > 0){
                this.dineroTotal = dineroTotal + monto;
                System.out.println("   ===> TRANSACCION EXITOSA EN TARJETA");
                registrarTransaccion("DEPOSITO", monto, estado);
                imprimirDetalle();
                return true;
            }else{
                System.out.println("   ===> ERROR EN MONTO INGRESADO <===");
                registrarTransaccion("AUMENTOSALDO", monto, "ERROR");
                return false;
            }
        }else{
            System.out.println("   ===> ERROR EN AUMENTO DE SALDO <===");
            registrarTransaccion("AUMENTOSALDO", monto, "ERROR");
            return false;
        }
        
    }

    public void registrarTransaccion(String tipo, int monto, String estado){

        Date fecha = new Date();
        String texto = fecha.toString() + " - " + tipo + " - " + monto + " - " + estado;

        int indice = -1;
        
        for(int i = 0; i < transacciones.length; i++){
            if(transacciones[i] == null){
                indice = i;
                break;
            }
        }
        
        if(indice != -1){
            transacciones[indice] = texto;
        }else{
            for(int i = 0; i < transacciones.length - 1 ; i++){
                transacciones[i] = transacciones[i+1];
            }

            transacciones[transacciones.length -1] = texto;
        }

    }

    public void imprimirDetalle(){
        System.out.println("-----------------------------------------");
        System.out.println("Titular: " + titular);
        System.out.println("Numero Tarjeta: " + numeroTarjeta);
        System.out.println("Banco: " + banco);
        System.out.println("Dinero Total: " + dineroTotal);
        System.out.println("Monto Maximo: " + montoMax);
        System.out.println("Clave: " + clave);
        System.out.println("Estado " + estado);
        System.out.println("Historial Transacciones: ");

        for(int i= 0; i < transacciones.length; i++){
            if(transacciones[i] != null){
                System.out.println("        =>" + transacciones[i]);
            }
        }

        System.out.println("-----------------------------------------");
    }

    public void verHistorial(String pass){
        if(pass.equals(clave)){
            registrarTransaccion("HISTORIAL", 0, "OK");
            for(int i = 0; i < transacciones.length; i++){
                if(transacciones[i] != null){
                    System.out.println(" => " + transacciones[i]);
                }        
            }

        }else{
            
            System.out.println(" ===> ACCESO DENEGADO DESDE LA TARJETA");
            registrarTransaccion("HISTORIAL", 0, "ERROR");
        }
    }

    public int getSaldo(String pass){
        if(pass.equals(clave)){
            registrarTransaccion("CONSULTASALDO", 0, "OK");
            return dineroTotal;

        }else{
            registrarTransaccion("CONSULTASALDO", 0, "ERROR");
            return -1;
        }
    }

  
    public boolean validarClave(String password){
        if( password.equals(clave)){
            registrarTransaccion("VALIDARCLAVE", 0, "OK");
            return true;
        }else{
            registrarTransaccion("VALIDARCLAVE", 0, "ERROR");
            return false;
        }
    }

    public boolean validarEstadoActivo(){
        if( estado.equals("ACTIVA")){
            return true;
        }else{
            return false;
        }
    }

    public String getNumero(){
        return numeroTarjeta;
    }

}