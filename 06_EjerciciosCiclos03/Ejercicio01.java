import java.util.Scanner;

public class Ejercicio01{
    public static void main(String [] args){

        Scanner pago = new Scanner(System.in);

        System.out.print("Ingrese un sueldo Total: ");
        long sueldo = pago.nextLong();
        long pagos = sueldo;
        double porcentage;

        System.out.print("Ingrese la cantidad de pagos: ");
        int cant = pago.nextInt();
        

        System.out.print(" ");
        System.out.println("-------------- FORMAS DE PAGO --------------");
        System.out.println("          1. Pagos de igual valor ");
        System.out.println("          2. Primer pago diferente ");
        System.out.println("          3. Ultimo pago diferente");
        System.out.println("          4. Primer y ultimo pago diferente ");
        System.out.print(" ");
        
        System.out.print("Ingrese forma de pago: ");
        int opt = pago.nextInt();

        System.out.print(" ");
        System.out.println("-------------- SUS PAGOS SERAN --------------");

        if(opt < 1 || opt > 4){
            System.out.print("Opción invalida, vuelva a reiniciar el programa y ingrese solo una opcion del menu");
    
        }else{
            for(int i = 1; i <= cant; i++){
                if(opt == 1){
                    sueldo = sueldo/cant;
                }else if(opt == 2){

                    if(cant >= 3){
                        if(i == 1){
                            porcentage = sueldo * 0.4;
                            sueldo = sueldo - (long) porcentage;
                        }else{
                            porcentage = sueldo * ((1 - 0.4) / (cant-1));
                            sueldo = sueldo - (long) porcentage;
                        }
                    }else{
                        if(i == 1){
                            porcentage = sueldo * 0.6;
                            sueldo = sueldo - (long) porcentage;
                        }else{
                            porcentage = sueldo * 0.4;
                            sueldo = sueldo - (long) porcentage;
                        }
                    }
                            
                }else if(opt == 3){
                    if(cant >= 3){
                        if(i == cant){
                            porcentage = sueldo * 0.4;
                            sueldo = sueldo - (long) porcentage;
                        }else{
                            porcentage = sueldo * ((1 - 0.4) / (cant-1));
                            sueldo = sueldo - (long) porcentage;
                        }
                    }else{
                        if(i == cant){
                            porcentage = sueldo * 0.6;
                            sueldo = sueldo - (long) porcentage;
                        }else{
                            porcentage = sueldo * 0.4;
                            sueldo = sueldo - (long) porcentage;
                        }
                    }
                }else if(opt == 4){
                    if(cant >= 3){
                        if(i == 1 || i == cant){
                            porcentage = sueldo * 0.3;
                            sueldo = sueldo - (long) porcentage;
                        }else{
                            porcentage = sueldo * ((1 - 0.3) / (cant-2));
                            sueldo = sueldo - (long) porcentage;
                        }
                    }else{
                        if(i == 1){
                            porcentage = sueldo * 0.4;
                            sueldo = sueldo - (long) porcentage;
                        }else{
                            porcentage = sueldo * 0.6;
                            sueldo = sueldo - (long) porcentage;
                        }
                    }
                }

                long millones = sueldo / 1000000;
                long miles = (sueldo % 1000000)/1000;
                long centenas = (sueldo % 1000000) % 1000;

                String millions = Long.toString(millones);
                String thousands = Long.toString(miles);
                String hundreds = Long.toString(centenas);

                
                if (miles == 0 ){
                    
                    thousands = "000";
                }else if(miles > 9 && miles <= 99){

                    thousands = "0" + thousands;
                    
                }else if(miles > 0 && miles <=9){
                    thousands = "00" + thousands;            
                }

                if (centenas == 0 ){
                    
                    hundreds = "000";
                }else if(centenas > 9 && centenas <= 99){

                    hundreds = "0" + hundreds;
                    
                }else if(centenas > 0 && centenas <=9){
                    hundreds = "00" + hundreds;            
                }

                if (sueldo > 999999){
                    long digs = millones % 100;
                    if(millones > 99 && digs == 0){
                        System.out.println("Mes 0"+ i + " : $" + millions + "00." + thousands + "." + hundreds);
                    }else{                                                        
                        System.out.println("Mes 0"+ i + " : $" + millions + "." + thousands + "." + hundreds);
                    }
                }else if (sueldo > 999){
                    System.out.println("Mes 0"+ i + " : $" + thousands + "." + hundreds);
                }

                sueldo = pagos;
            }
        }


    }
}