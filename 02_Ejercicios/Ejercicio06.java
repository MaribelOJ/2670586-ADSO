import java.util.Scanner;
public class Ejercicio06{
    public static void main (String [] args){
        
        Scanner notas = new Scanner(System.in);

        float nota1, nota2, nota3 , promedio;

        System.out.println("OPERACION: promedio de notas");
        System.out.println(" ");
        System.out.println("Ingrese la nota1: ");
        nota1 = notas.nextFloat();

        System.out.println("Ingrese la nota2: ");
        nota2 = notas.nextFloat();

        System.out.println("Ingrese la nota3: ");
        nota3 = notas.nextFloat();

        promedio = (nota1 + nota2 + nota3)/3 ;

        System.out.println("EL PROMEDIO DE LAS NOTAS ES: ");
        System.out.println(" ");
        System.out.println( promedio);

    }
}