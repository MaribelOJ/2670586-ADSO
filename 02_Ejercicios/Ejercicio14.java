import java.util.Scanner;
public class Ejercicio14{
    public static void main (String [] args){
        
        Scanner datos = new Scanner(System.in);

        float nota1, nota2, nota3 , promedio, porcentaje1, porcentaje2, porcentaje3;

        System.out.println("OPERACION: Promedio de notas con diferentes porcentajes");
        System.out.println(" ");
        System.out.println("Ingrese la nota1: ");
        nota1 = datos.nextFloat();

        System.out.println("Ingrese la nota2: ");
        nota2 = datos.nextFloat();

        System.out.println("Ingrese la nota3: ");
        nota3 = datos.nextFloat();

        System.out.println("Ingrese el porcentaje de la nota1: ");
        porcentaje1 = datos.nextInt();

        System.out.println("Ingrese el porcentaje de la nota2: ");
        porcentaje2 = datos.nextInt();

        System.out.println("Ingrese el porcentaje de la nota3: ");
        porcentaje3 = datos.nextInt();

        promedio = nota1 * (porcentaje1 / 100) + nota2 * (porcentaje2 / 100) + nota3 * (porcentaje3 / 100);

        System.out.println("EL PROMEDIO DE LAS datos ES: ");
        System.out.println(" ");
        System.out.println( promedio);

    }
}