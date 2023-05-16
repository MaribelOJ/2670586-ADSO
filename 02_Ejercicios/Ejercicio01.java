import java.util.Scanner;
public class Ejercicio01{
    public static void main (String [] args){
        
        Scanner numero = new Scanner(System.in);

        int num1, num2, resultado;

        System.out.println("OPERACION: Suma de dos numeros");
        System.out.println(" ");
        System.out.println("Ingrese el primer numero: ");
        num1 = numero.nextInt();

        System.out.println("Ingrese el segundo numero: ");
        num2 = numero.nextInt();

        resultado = num1 + num2;

        System.out.println("EL RESULTADO ES: ");
        System.out.println(" ");
        System.out.println( num1 + " + " + num2 + " = " + resultado );


    }
}