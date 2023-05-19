import java.util.Scanner;

public class Ejercicio02{
    public static void main(String[] args){
        Scanner numero = new Scanner(System.in);

        System.out.println("Ingrese un numero de tres digitos: ");
        int num = numero.nextInt();

        if (num % 2 == 0){
            System.out.println("Es par");
        }else{
            System.out.println("Es impar");
        }
    }
}