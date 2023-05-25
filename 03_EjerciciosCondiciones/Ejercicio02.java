import java.util.Scanner;

public class Ejercicio02{
    public static void main(String[] args){
        Scanner numero = new Scanner(System.in);

        System.out.println("Ingrese un numero de tres digitos: ");
        int num = numero.nextInt();

        if (num < 100 || num >= 1000){
            System.out.println("El numero no es de tres digitos, ingrese un numero que tenga 3 digitos: ");
            num = numero.nextInt();
            if (num % 2 == 0){
                System.out.println("El numero es par");
            }else{
                System.out.println("El numero es impar");
            }
        }else{
            if (num % 2 == 0){
                System.out.println("El numero es par");
            }else{
                System.out.println("El numero es impar");
            }
        }
        
    }
}