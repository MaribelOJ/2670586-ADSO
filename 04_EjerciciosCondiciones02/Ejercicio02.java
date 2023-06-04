import java.util.Scanner;
public class Ejercicio02{
    public static void main(String[]args){

        Scanner numeros = new Scanner(System.in);

        System.out.print("ingrese el primer numero : ");
        int num1 = numeros.nextInt();

        System.out.print("ingrese el segundo numero: ");
        int num2 = numeros.nextInt();

        System.out.print("ingrese el tercer numero: ");
        int num3 = numeros.nextInt();

        System.out.print("ingrese el cuarto numero: ");
        int num4 = numeros.nextInt();

        if (num1 > num2 & num1 > num3 & num1 > num4){
            System.out.print("El maximo numero es: " + num1);
        }else if (num1 > num2 & num1 < num3 & num3 > num4){
            System.out.print("El maximo numero es: " + num3);
        }else if (num1 > num2 & num1 < num3 & num3 < num4){
            System.out.print("El maximo numero es: " + num4);
        }else if (num1 > num2 & num1 > num3 & num1 < num4){
            System.out.print("El maximo numero es: " + num4);
        }else if (num1 < num2 & num2 < num3 & num3 < num4){ 
            System.out.print("El maximo numero es: " + num4);
        }else if (num1 < num2 & num2 > num3 & num2 > num4){ 
            System.out.print("El maximo numero es: " + num2);
        }else if (num1 < num2 & num2 < num3 & num3 > num4){
            System.out.print("El maximo numero es: " + num3);
        }else if (num1 < num2 & num2 > num3 & num2 < num4){
            System.out.print("El maximo numero es: " + num4);
        }

    }
}