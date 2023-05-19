import java.util.Scanner;

public class Ejercicio18{
    public static void main (String [] args){

        Scanner dato = new Scanner(System.in);

       float IMC, peso, altura;

       System.out.println("OPERACION: Calcular IMC");
       System.out.println(" ");
       System.out.println("Ingrese su peso: ");
       peso = dato.nextFloat();

       System.out.println(" ");
       System.out.println("Ingrese su altura: ");
       altura = dato.nextFloat();

      
       IMC = peso / (float)Math.pow(altura, 2);
        
        System.out.println(" ");
        System.out.println( " SU IMC ES DE: ");
        System.out.println(" ");
        System.out.println( IMC);

    }
}