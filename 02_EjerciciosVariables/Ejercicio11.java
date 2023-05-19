import java.util.Scanner;
public class Ejercicio11{
    public static void main (String [] args){
        Scanner radio = new Scanner(System.in);

        double perimetro, R, area;

        System.out.println("OPERACION: Hayar perimetro y radio de un circulo");
        System.out.println(" ");
        System.out.println("Ingrese el radio del circulo: ");
        R = radio.nextDouble();

        perimetro = (2 * 3.14 * R);
        area = (3.14 * Math.pow(R , 2));
        
        System.out.println(" ");
        System.out.println( " El PERIMETRO DEL CIRCULO ES: ");
        System.out.println(" ");
        System.out.println( perimetro);
        System.out.println(" ");
        System.out.println( " El AREA DEL CIRCULO ES: ");
        System.out.println(" ");
        System.out.println( area);
    }
}