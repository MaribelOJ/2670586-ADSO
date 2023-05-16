import java.util.Scanner;
public class Ejercicio10{
    public static void main (String [] args){
        
        Scanner numero = new Scanner(System.in);

        int num1, num2, division, resto;

        System.out.println("OPERACION: Division y Mod de dos numeros");
        System.out.println(" ");
        System.out.println("Ingrese el primer numero: ");
        num1 = numero.nextInt();

        System.out.println("Ingrese el segundo numero: ");
        num2 = numero.nextInt();

        division = num1 / num2;
        resto = num1 % 2;

        System.out.println(" El RESULTADO DE LA DIVISION SERIA: ");
        System.out.println(" ");
        System.out.println( num1 + " / " + num2 + " = " + division );
        System.out.println(" ");
        System.out.println(" LA RESTO DE LA DIVISION ES: ");
        System.out.println(" ");
        System.out.println( resto );

    }
}