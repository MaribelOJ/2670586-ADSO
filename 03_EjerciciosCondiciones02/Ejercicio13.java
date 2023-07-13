import java.util.Scanner;
public class Ejercicio13{
    public static void main(String[]args){

        Scanner numero = new Scanner(System.in);

        System.out.print("Ingrese un numero: ");
        int num = numero.nextInt();

        if (num % 2 == 0 && num % 3 == 0 && num % 5 == 0){
            System.out.print("El numero es divisible por 2, 3 y 5");
        }else{
            System.out.print("El numero no es divisible por 2, 3 y 5");
        }

    }
}