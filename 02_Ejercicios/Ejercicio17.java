import java.util.Scanner;

public class Ejercicio17{
    public static void main (String [] args){

        Scanner moneda = new Scanner(System.in);

       float USD, EUR, JPY, GBP, cantidad1, cantidad2, cantidad3, cantidad4;
      

       System.out.println("OPERACION: Conversion a otras monedas");
       System.out.println(" ");
       System.out.println("Ingrese la cantidad de COP para convertir a USD, si no escriba (0): ");
       cantidad1 = moneda.nextFloat();

       System.out.println(" ");
       System.out.println("Ingrese la cantidad de COP para convertir a EUR, si no escriba (0): ");
       cantidad2 = moneda.nextFloat();

       System.out.println(" ");
       System.out.println("Ingrese la cantidad de COP para convertir a JPY, si no escriba (0): ");
       cantidad3= moneda.nextFloat();

       System.out.println(" ");
       System.out.println("Ingrese la cantidad de COP para convertir a GBP, si no escriba (0): ");
       cantidad4= moneda.nextFloat();


       USD = cantidad1 /4515 ;

       EUR = cantidad2 /4862;

       JPY = cantidad3 /3269;

       GBP = cantidad4 / 5617;


        System.out.println(" ");
        System.out.println( " LA CONVERSIÓN A USD ES: ");
        System.out.println(" ");
        System.out.println( cantidad1 + " COP " + " = " + USD + " USD");

        System.out.println(" ");
        System.out.println( " LA CONVERSIÓN A EUR ES: ");
        System.out.println(" ");
        System.out.println( cantidad2 + " COP " + " = " + EUR + " EUR");

        System.out.println(" ");
        System.out.println( " LA CONVERSIÓN A JPY ES: ");
        System.out.println(" ");
        System.out.println( cantidad3 + " COP " + " = " + JPY + " JPY");

        System.out.println(" ");
        System.out.println( " LA CONVERSIÓN A GBP ES: ");
        System.out.println(" ");
        System.out.println( cantidad4 + "  COP" + " = " + GBP+ " GBP");

    }
}