import java.util.Scanner;

public class Ejercicio03{

    public static void main (String[] args){
        Scanner var =  new Scanner(System.in);

        int var1, var2, varA;
        System.out.println("OPERACION: Intercambio de valores: ");
        System.out.println(" ");
        System.out.println("ingrese un entero para VALOR1: ");
        var1 = var.nextInt();

        System.out.println("ingrese otro entero para VALOR2: ");
        var2 = var.nextInt();

        varA = var1;
        var1 = var2;
        var2 = varA;

        System.out.println("lOS VALORES FUERON INTERCAMBIADOS DE LA SIGUIENTE FORMA: ");
        System.out.println(" ");
        System.out.println("VALOR1 = " + var1);
        System.out.println(" ");
        System.out.println("VALOR2 = " + var2);


    }
}