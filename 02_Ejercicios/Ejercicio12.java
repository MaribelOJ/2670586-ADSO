import java.util.Scanner;
public class Ejercicio12{
    public static void main (String [] args){
        
        Scanner dato = new Scanner(System.in);

        int ancho, altura, area;

        System.out.println("OPERACION: Hayar el area del rectangulo");
        System.out.println(" ");
        System.out.println("Ingrese el ancho: ");
        ancho = dato.nextInt();

        System.out.println("Ingrese la altura: ");
        altura = dato.nextInt();

        area = ancho * altura;

        System.out.println("EL AREA ES: ");
        System.out.println(" ");
        System.out.println( ancho + " * " + altura + " = " + area );


    }
}