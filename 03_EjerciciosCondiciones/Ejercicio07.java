import java.util.Scanner;
public class Ejercicio07{
    public static void main( String[] args){

        Scanner numero = new Scanner(System.in);

        System.out.print("Ingrese un numero máximo de 10 digitos y que sea menor a 2.000.000.000: ");
        int num = numero.nextInt();

        if (num > 2000000000){
            System.out.print("El numero se pasa del limite, escriba otro numero de 10 digitos: ");
            num = numero.nextInt();
        }

        if (num > 999999999){
            int digs1 = num % 1000;
            int digs2 = (num % 1000000)/1000;
            int digs3 = (num % 1000000000)/1000000;
            int digs4 = num / 1000000000;

            System.out.println("Moneda : $ " + digs4 + "." + digs3 + "." + digs2 + "." + digs1);
        }else{

            if (num > 99999999){
                int digs1 = num % 1000;
                int digs2 = (num % 1000000)/1000;
                int digs3 = (num % 1000000000)/1000000;

                System.out.println("Moneda : $ " + digs3 + "." + digs2 + "." + digs1);
            }else{
                if (num > 9999999){
                    int digs1 = num % 1000;
                    int digs2 = (num % 1000000)/1000;
                    int digs3 = (num % 100000000)/1000000;

                    System.out.println("Moneda : $ " + digs3 + "." + digs2 + "." + digs1);
                }else{
                    if (num > 999999){
                        int digs1 = num % 1000;
                        int digs2 = (num % 1000000)/1000;
                        int digs3 = num / 1000000;

                        System.out.println("Moneda : $ " + digs3 + "." + digs2 + "." + digs1);
                    }else{
                        if (num > 99999){
                            int digs1 = num % 1000;
                            int digs2 = (num % 1000000)/1000;

                            System.out.println("Moneda : $ " + digs2 + "." + digs1);
                        }else{
                            if (num > 9999){
                                int digs1 = num % 1000;
                                int digs2 = num / 1000;

                                System.out.println("Moneda : $ " + digs2 + "." + digs1);
                            }else{
                                if (num > 999){
                                    int digs1 = num % 1000;
                                    int digs2 = num / 1000;

                                    System.out.println("Moneda : $ " + digs2 + "." + digs1);
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