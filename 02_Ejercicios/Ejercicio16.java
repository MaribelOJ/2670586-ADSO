import java.util.Scanner;

public class Ejercicio16{
    public static void main (String [] args){

        Scanner dato = new Scanner(System.in);

       float vf, vi, cuotas, interes;

       System.out.println("OPERACION: Calculo de interes compuesto");
       System.out.println(" ");
       System.out.println("Ingrese el valor inicial: ");
       vi = dato.nextFloat();

       System.out.println(" ");
       System.out.println("Ingrese la tasa de interes: ");
       interes = dato.nextFloat();

       System.out.println(" ");
       System.out.println("Ingrese las cuotas: ");
       cuotas= dato.nextFloat();

       vf = vi * (float)Math.pow((1 + (interes/100)), cuotas);

        
        System.out.println(" ");
        System.out.println( " El VALOR FINAL O TOTAL ES DE: ");
        System.out.println(" ");
        System.out.println( vf);

    }
}