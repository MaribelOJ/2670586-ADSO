import java.util.Date;

public class cajero{

    int capacidadTotal;
    int cantAvailable;
    int cant_10;
    int cant_20;
    int cant_50;
    int cant_100;
    String nombreBanco;
    String [] transacciones;
    String usuarioAdmin;
    String claveAdmin;


    public cajero(int cantTotal, int cantAvailable, int cant_10, int cant_20, int cant_50, int cant_100, String nombreBanco, String usuarioAdmin, String claveAdmin ){
        this.capacidadTotal = cantTotal;
        this.cantAvailable = cantAvailable;
        this.cant_10 = cant_10;
        this.cant_20 = cant_20;
        this.cant_50 = cant_50;
        this.cant_100 = cant_100;
        this.nombreBanco = nombreBanco;
        this.usuarioAdmin = usuarioAdmin;
        this.claveAdmin = claveAdmin;
        this.transacciones = new String[100];
    }

    public cajero(int cantTotal, String nombreBanco, String usuarioAdmin, String claveAdmin){
        this.capacidadTotal = cantTotal;
        this.nombreBanco = nombreBanco;
        this.usuarioAdmin = usuarioAdmin;
        this.claveAdmin = claveAdmin;
        this.cantAvailable = 0;
         this.cant_10 = 0;
        this.cant_20 = 0;
        this.cant_50 = 0;
        this.cant_100 = 0;
        this.transacciones = new String[100];
    }



    public void imprimirDetalle(){
        System.out.println("-----------------------------------------");
        System.out.println("capacidadTotal: " + capacidadTotal);
        System.out.println("cantAvailable: " + cantAvailable);
        System.out.println("cant_10: " + cant_10);
        System.out.println("cant_20: " + cant_20);
        System.out.println("cant_50: " + cant_50);
        System.out.println("cant_100: " + cant_100);
        System.out.println("nombreBanco: " + nombreBanco);
        System.out.println("usuarioAdmin: " + usuarioAdmin);
        System.out.println("claveAdmin: " + claveAdmin);
        System.out.println("Historial Transacciones: ");

        for(int i= 0; i < transacciones.length; i++){
            if(transacciones[i] != null){
                System.out.println("        =>" + transacciones[i]);
            }
        }

        System.out.println("-----------------------------------------");

    }

    public String abastecerCajero(int cant_10, int cant_20, int cant_50, int cant_100){

        //calcular total ingresado

        int total = (cant_10 *10000) + (cant_20 * 20000) + (cant_50 * 50000) + (cant_100 * 100000);


        //validar que no exceda el limite

        if(total <= capacidadTotal){
            // Si. Almacenar los datos en los atributos
            cantAvailable = total;
            this.cant_10 = cant_10;
            this.cant_20 = cant_20;
            this.cant_50 = cant_50;
            this.cant_100 = cant_100;

            int indice = registrarTransaccion("ABASTECER", "0000 0000 0000 0000", total, "OK");
            return transacciones[indice];
        }else{
            int indice = registrarTransaccion("ABASTECER", "0000 0000 0000 0000", total, "Error");
            return transacciones[indice];
        }
    }

    public int registrarTransaccion(String tipo, String numeroTarjeta, int monto, String estado){  
        Date fecha = new Date();
        String texto = fecha.toString() + " - " + tipo + " - " + numeroTarjeta + " - " + monto + " - " + estado;

        // Buscar un indice donde este vacio

        int indice = -1;
        
        for(int i = 0; i < transacciones.length; i++){
            if(transacciones[i] == null){
                indice = i;
                break;
            }else{
                
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
            return 99;
        }
    }

    public void verHistorialCajero(String trans1, String trans2, String trans3, String trans4){

        System.out.println("----------HISTORIAL DEL CAJERO--------");
        System.out.println("1. " + trans1);
        System.out.println("2. " + trans2);
        System.out.println("3. " + trans3);
        System.out.println("4. " + trans4);

    }
}


