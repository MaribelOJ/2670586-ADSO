import java.util.Scanner;

public class Ejercicio15{
    public static void main (String [] args){

        Scanner metros = new Scanner(System.in);

       double cm, medida1, medida2, medida3;
       double inches, pies;

       System.out.println("OPERACION: Conversion a otras medidas");
       System.out.println(" ");
       System.out.println("Ingrese los metros para convertir a PIES, si no escriba (0): ");
       medida1 = metros.nextDouble();

       System.out.println(" ");
       System.out.println("Ingrese los metros para convertir a PULGADAS, si no escriba (0): ");
       medida2 = metros.nextDouble();

       System.out.println(" ");
       System.out.println("Ingrese los metros para convertir a CENTIMETROS, si no escriba (0): ");
       medida3= metros.nextDouble();

       pies = 3.28084 * medida1 ;

       inches = 39.37008 * medida2;

       cm = 100 * medida3;

        System.out.println(" ");
        System.out.println( " LA CONVERSIÓN A PIES ES: ");
        System.out.println(" ");
        System.out.println( medida1 + " = " + pies + " pies");

        System.out.println(" ");
        System.out.println( " LA CONVERSIÓN A PULGADAS ES: ");
        System.out.println(" ");
        System.out.println( medida2 + " = " + inches + " pulgadas");

        System.out.println(" ");
        System.out.println( " LA CONVERSIÓN A CENTIMETROS ES: ");
        System.out.println(" ");
        System.out.println( medida3 + " = " + cm + "cm");

    }
}