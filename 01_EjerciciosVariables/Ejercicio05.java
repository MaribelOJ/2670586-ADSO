import java.util.Scanner;
public class Ejercicio05{
    public static void main (String [] args){
        
        Scanner dato = new Scanner(System.in);

        float base, altura, area;

        System.out.println("OPERACION: Area de un triangulo");
        System.out.println(" ");
        System.out.println("Ingrese la base: ");
        base = dato.nextFloat();

        System.out.println("Ingrese la altura: ");
        altura = dato.nextFloat();

        area = (base * altura) / 2;

        System.out.println("EL RESULTADO ES: ");
        System.out.println(" ");
        System.out.println( " area = " + area);


    }
}