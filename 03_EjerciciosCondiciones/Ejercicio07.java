import java.util.Scanner;
public class Ejercicio07{
    public static void main( String[] args){

        Scanner numero = new Scanner(System.in);

        System.out.print("Ingrese un numero máximo de 10 digitos y que sea menor a 2.000.000.000: ");
        int num = numero.nextInt();

        if (num > 2000000000){
            System.out.print("El numero se pasa del limite, escriba otro numero hasta el 2.000.000.000: ");
            num = numero.nextInt();
        }

        int digs1 = num % 1000;
        int digs2 = (num % 1000000)/1000;
        int digs3 = (num % 1000000000)/1000000;
        int digs4 = num / 1000000000;

        String digs03 = Integer.toString(digs3);
        String digs02 = Integer.toString(digs2);
        String digs01 = Integer.toString(digs1);

        if (digs3 == 0 ){
            
            digs03 = "000";
        }else if(digs3 > 9 && digs3 <= 99){

            digs03 = "0" + digs03;
            
        }else if(digs3 > 0 && digs3 <=9){
            digs03 = "00" + digs03;            
        }

        if (digs2 == 0 ){
            
            digs02 = "000";
        }else if(digs2 > 9 && digs2 <= 99){

            digs02 = "0" + digs02;
            
        }else if(digs2 > 0 && digs2 <=9){
            digs02 = "00" + digs02;            
        }

        if (digs1 == 0 ){
            
            digs01 = "000";
        }else if(digs1 > 9 && digs1 <= 99){

            digs01 = "0" + digs01;
            
        }else if(digs1 > 0 && digs1 <=9){
            digs01 = "00" + digs01;            
        }

        
        if (num > 999999999){
                                    
            System.out.println("Moneda : $ " + digs4 + "." + digs03 + "." + digs02 + "." + digs01);
        }else{

            if (num > 99999999){
                
                System.out.println("Moneda : $ " + digs03 + "." + digs02 + "." + digs01);
            }else{
                if (num > 9999999){
                    

                    System.out.println("Moneda : $ " + digs03 + "." + digs02 + "." + digs01);
                }else{
                    if (num > 999999){
                        
                        System.out.println("Moneda : $ " + digs03 + "." + digs02 + "." + digs01);
                    }else{
                        if (num > 99999){
                            
                            System.out.println("Moneda : $ " + digs02 + "." + digs01);
                        }else{
                            if (num > 9999){
                                System.out.println("Moneda : $ " + digs02 + "." + digs01);
                            }else{
                                if (num > 999){
                                    System.out.println("Moneda : $ " + digs02 + "." + digs01);
                                }else{

                                    System.out.println("Moneda : $ " + num);
                                }

                            }

                        }
                    }
                }

            }

        }



    }

}