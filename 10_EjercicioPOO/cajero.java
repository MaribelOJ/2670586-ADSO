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

    public void abastecerCajero(int cant_10, int cant_20, int cant_50, int cant_100){

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

            registrarTransaccion("ABASTECER", "0000 0000 0000 0000", total, "OK");
            
        }else{
            registrarTransaccion("ABASTECER", "0000 0000 0000 0000", total, "Error");
            
        }
    }

    public void registrarTransaccion(String tipo, String numeroTarjeta, int monto, String estado){  
        Date fecha = new Date();
        String texto = fecha.toString() + " - " + tipo + " - " + numeroTarjeta + " - " + monto + " - " + estado;

        // Buscar un indice donde este vacio

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

    public void verHistorialCajero(String user, String pass){

        if(user.equals(usuarioAdmin) && pass.equals(claveAdmin)){

            registrarTransaccion("HISTORIAL", "0000 0000 0000 0000", 0, "OK");
            System.out.println("--------------------------------------");
            System.out.println("|       HISTORIAL DEL CAJERO         |");
            System.out.println("--------------------------------------");
            for(int i = 0; i < transacciones.length; i++){
                if(transacciones[i] != null){
                    System.out.println(transacciones[i]);
                }
            }
            
            
        }else{
            System.out.println(" ===> ACESSO DENEGADO <===");
            registrarTransaccion("HISTORIAL", "0000 0000 0000 0000", 0, "ERROR");
        }

    }

    public void consignarTarjeta(tarjetaDebito  tarjeta, String clave, int cant_10, int cant_20, int cant_50, int cant_100){

        int monto = (10000 * cant_10) + (20000 * cant_20) + (50000 * cant_50) + (100000 * cant_100);

        if(tarjeta.validarClave(clave)){
            if(tarjeta.validarEstadoActivo()){
                if (monto > 0){
                    if((cantAvailable + monto) <= capacidadTotal){

                        tarjeta.aumentarSaldo(monto, clave);
                        cantAvailable += monto;
                        this.cant_10 += cant_10;
                        this.cant_20 += cant_20;
                        this.cant_50 += cant_50;
                        this.cant_100 += cant_100;

                        System.out.println("   ===> CONSIGNACION EXITOSA <===");
                        registrarTransaccion("CONSIGNACION", tarjeta.getNumero(), monto,  "OK");

                    }else{
                        System.out.println("   ===> ERROR MONTO SUPERIOR - CONSIGNAR DINERO <===");
                        registrarTransaccion("CONSIGNACION", tarjeta.getNumero(), monto,  "ERROR ");
                    }

                }else{
                    System.out.println("   ===> ERROR MONTO INFERIOR - CONSIGNAR DINERO <===");
                    registrarTransaccion("CONSIGNACION", tarjeta.getNumero(), monto,  "ERROR MONTO");
                }
            }else{
                System.out.println("   ===> ERROR ESTADO - CONSIGNAR DINERO <===");
                registrarTransaccion("CONSIGNACION", tarjeta.getNumero(), monto,  "ERROR ESTADO");
            }

        }else{
            System.out.println("   ===> ERROR PASSWORD - CONSIGNAR DINERO <===");
            registrarTransaccion("CONSIGNACION", tarjeta.getNumero(), monto,  "ERROR PASSWORD");
        }
    }


    public void retirarDineroTarjeta(tarjetaDebito tarjeta, String clave, int cant_10, int cant_20, int cant_50, int cant_100){
        
        if(tarjeta.validarClave(clave)){

            if(tarjeta.validarEstadoActivo()){


                int monto = 0;

                if(this.cant_10 < cant_10){

                    System.out.println("   ===> ERROR CANT BILLETES - EL MONTO DE BILLETES DE 10 MIL NO DISPONIBLE <===");
                    registrarTransaccion("RETIRO", tarjeta.getNumero(), monto,  "ERROR CANT BILLETES");

                } else if(this.cant_20 < cant_20){

                    System.out.println("   ===> ERROR CANT BILLETES - EL MONTO DE BILLETES DE 20 MIL NO DISPONIBLE <===");
                    registrarTransaccion("RETIRO", tarjeta.getNumero(), monto,  "ERROR CANT BILLETES");
                    
                } else if(this.cant_50 < cant_50){

                    System.out.println("   ===> ERROR CANT BILLETES - EL MONTO DE BILLETES DE 50 MIL NO DISPONIBLE <===");
                    registrarTransaccion("RETIRO", tarjeta.getNumero(), monto,  "ERROR CANT BILLETES");
                    
                }else if(this.cant_100 < cant_100){

                    System.out.println("   ===> ERROR CANT BILLETES - EL MONTO DE BILLETES DE 100 MIL NO DISPONIBLES <===");
                    registrarTransaccion("RETIRO", tarjeta.getNumero(), monto,  "ERROR CANT BILLETES");
                    
                }else{
                    monto = (10000 * cant_10) + (20000 * cant_20) + (50000 * cant_50) + (100000 * cant_100);

                    if(tarjeta.validarDineroDisponible(monto)){

                        if(tarjeta.validarMontoMax(monto)){

                            tarjeta.disminuirSaldo(monto,clave);

                            this.cant_10 -= cant_10;
                            this.cant_20 -= cant_20;
                            this.cant_50 -= cant_50;
                            this.cant_100 -= cant_100;

                            System.out.println("   ===> RETIRO EXITOSO <===");
                            registrarTransaccion("RETIRO", tarjeta.getNumero(), monto,  "OK");

                        }else{
                            System.out.println("   ===> ERROR MONTO MAXIMO- RETIRAR DINERO <===");
                            registrarTransaccion("RETIRO", tarjeta.getNumero(), monto,  "ERROR MONTO MAXIMO");
                        }

                    }else{
                        System.out.println("   ===> ERROR MONTO NO DISPONIBLE - RETIRAR DINERO <===");
                        registrarTransaccion("RETIRO", tarjeta.getNumero(), monto,  "ERROR MONTO NO DISPONIBLE");
                    }


                }


            }else{

                System.out.println("   ===> ERROR ESTADO - RETIRAR DINERO <===");
                registrarTransaccion("RETIRO", tarjeta.getNumero(), 0, "ERROR ESTADO");
            }


        }else{
            System.out.println("   ===> ERROR PASSWORD - RETIRAR DINERO <===");
            registrarTransaccion("RETIRO", tarjeta.getNumero(), 0, "ERROR PASSWORD");
        }         
        
    }

    public void verHistorialTarjeta(tarjetaDebito tarjeta , String clave){

        if(tarjeta.validarClave(clave)){

            tarjeta.verHistorial(clave);
            
            registrarTransaccion("VERHISTORIAL", tarjeta.getNumero(), 0, "OK");
        }else {
            registrarTransaccion("VERHISTORIAL", tarjeta.getNumero(), 0, "ERROR PASSWORD");
        }
        
    }

    public void consultarSaldoTarjeta(tarjetaDebito tarjeta, String clave){

        if(tarjeta.validarClave(clave)){
            int saldo = tarjeta.getSaldo(clave);

            System.out.println("----------SALDO ACTUAL:-------------");
            System.out.println("|        "+ saldo + "        |");
            System.out.println("------------------------------------");

            registrarTransaccion("CONSULTARSALDO", tarjeta.getNumero(), 0, "OK");
        }else{

            System.out.println("   ===> ERROR PASSWORD - CONSULTAR SALDO <===");
            registrarTransaccion("CONSULTARSALDO", tarjeta.getNumero(), 0, "ERROR PASSWORD");
        }
    }

    public void cambiarClave(tarjetaDebito tarjeta , String clave, String newPass){
        if(tarjeta.validarClave(clave)){

            tarjeta.setClave(newPass);

            registrarTransaccion("CAMBIARCLAVE", tarjeta.getNumero(), 0, "OK");
        }else{

            System.out.println("   ===> ERROR PASSWORD - CAMBIAR CLAVE <===");
            registrarTransaccion("CAMBIARCLAVE", tarjeta.getNumero(), 0, "ERROR PASSWORD");

        }    
    }

}


