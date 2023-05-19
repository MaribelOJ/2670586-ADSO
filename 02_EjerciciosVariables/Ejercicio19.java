import java.util.Scanner;

public class Ejercicio19{
    public static void main (String [] args){

       Scanner datos = new Scanner(System.in);

       String nombre, edad, salario;

       System.out.println("OPERACION: Mostrar información personal");
       System.out.println(" ");
       System.out.println("Ingrese su nombre completo: ");
       nombre = datos.nextLine();

       System.out.println(" ");
       System.out.println("Ingrese su edad: ");
       edad = datos.nextLine();

       System.out.println(" ");
       System.out.println("Ingrese su salario: ");
       salario = datos.nextLine();

        
        System.out.println(" ");
        System.out.println( " NOMBRE: " + nombre);
        System.out.println(" ");
        System.out.println( " EDAD: " + edad);
        System.out.println(" ");
        System.out.println( " SALARIO: " + salario);
    }
}