import java.util.Date;
public class tarjetaDebito{
    String titular;
    String numeroTarjeta;
    String banco;
    int dineroTotal;
    int montoMax;
    String [] transacciones;
    String clave;
    String estado;

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

    public String disminuirSaldo(int monto){

        if(monto <= montoMax && estado.equals("ACTIVA")){
            this.dineroTotal = dineroTotal - monto;

            System.out.println("la transaccion fue Exitosa!");
            int indice = registrarTransaccion("RETIRO", monto, estado);
            imprimirDetalle();
                        
            return transacciones[indice];  

        }else{

            System.out.println("El monto pasa el limite permitido");
            int indice = registrarTransaccion("RETIRO DENEGADO", monto, estado);
            imprimirDetalle();
            return transacciones[indice];
        }    
    }

    public String aumentarSaldo(int monto){
        System.out.println("la transaccion fue Exitosa!");
        this.dineroTotal = dineroTotal + monto;
        int indice = registrarTransaccion("DEPOSITO", monto, estado);
        imprimirDetalle();
        return transacciones[indice];
    }

    public int registrarTransaccion(String tipo, int monto, String estado){

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
            return indice;
        }else{
            for(int i = 0; i < transacciones.length - 1 ; i++){
                transacciones[i] = transacciones[i+1];
            }

            transacciones[transacciones.length -1] = texto;
            return 9;
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




}