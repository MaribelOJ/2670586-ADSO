import java.util.Scanner;

public class Ejercicio05{
    public static void main(String[] args){
        Scanner numero = new Scanner(System.in);

        System.out.print("Ingrese el primer numero entero: ");
        int num1 = numero.nextInt();
        System.out.print("Ingrese el segundo numero entero: ");
        int num2 = numero.nextInt();
        System.out.print("Ingrese el tercer numero entero: ");
        int num3 = numero.nextInt();

        if (num1 > num2){
            if (num1 > num3 && num3 < num2){
                System.out.println("Los numeros se ingresaron en Orden Descendente");
            }else{   
                System.out.println("Los numeros se ingresaron en desorden");
            }  
        }else{
            if (num1 < num2){
                if (num2 < num3){
                    System.out.println("Los numeros se ingresaron en Orden Ascendente");
                }else{
                    System.out.println("Los numeros se ingresaron en desorden");
                }
            }else{
                if (num1 < num3){
                    System.out.println("Los numeros se ingresaron en Orden Ascendente");
                }else{
                    if (num1 > num3){
                        System.out.println("Los numeros se ingresaron en Orden Descendente");
                    }else{
                        System.out.println("Todos los numeros son iguales");
                    }
                }   
            }
        }
    }
}