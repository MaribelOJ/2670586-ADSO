import java.util.Scanner;
public class Ejercicio03{
    public static void main(String[]args){

        Scanner numero = new Scanner(System.in);

        System.out.print("ingrese un numero entero: ");
        int num = numero.nextInt();

        if (num % 2 == 0){
            System.out.print("El numero es par");
        }else{
            System.out.print("El numero es impar");
        }

    }
}