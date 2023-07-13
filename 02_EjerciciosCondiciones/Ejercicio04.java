import java.util.Scanner;

public class Ejercicio04{
    public static void main(String[] args){
        Scanner numero = new Scanner(System.in);

        System.out.print("Ingrese el primer numero entero: ");
        int num1 = numero.nextInt();
        System.out.print("Ingrese el segundo numero entero: ");
        int num2 = numero.nextInt();
        System.out.print("Ingrese el tercer numero entero: ");
        int num3 = numero.nextInt();

        if (num1 > num2){
            if (num1 > num3){
                System.out.println("El numero mayor es: " + num1);
                if (num3 > num2){
                    System.out.println("el numero menor es: "+ num2);
                }else{
                    System.out.println("el numero menor es: "+ num3);
                }
            }else{
                if (num1 < num3){
                    System.out.println("El numero mayor es: " + num3);
                }else{
                    System.out.println("El numero menor es: " + num2);
                }
            }  
        }else{
            if (num1 < num2){
                if (num2 > num3){
                    System.out.println("El numero mayor es: " + num2);
                    if (num3 > num1){
                        System.out.println("el numero menor es: "+ num1);
                    }else{
                        System.out.println("el numero menor es: "+ num3);
                    }
                }else{
                    if (num2 < num3){
                        System.out.println("El numero mayor es: " + num3);
                    }else{
                        System.out.println("El numero menor es: " + num1);
                    }
                }
            }else{
                if (num1 > num3){
                    System.out.println("El numero mayor es: " + num1);
                    System.out.println("El numero menor es: " + num3);
                }else{
                    if (num1 < num3){
                        System.out.println("El numero mayor es: " + num3);
                        System.out.println("El numero menor es: " + num1);
                    }else{
                        System.out.println("todos los numeros son iguales");
                    }
                }
            }  
                 
        }
    }
}