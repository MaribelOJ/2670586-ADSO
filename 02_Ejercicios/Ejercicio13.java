import java.util.Scanner;
public class Ejercicio13{
    public static void main (String [] args){
        Scanner tiempo = new Scanner(System.in);

        int segundos, x, conversion;

        x = 60;

        System.out.println("OPERACION: Conversion de segundos a horas, minutos y segundos");
        System.out.println(" ");
        System.out.println("Ingrese el tiempo en segundos hasta 3.600 seg: ");
        segundos = tiempo.nextInt();
        
        conversion= segundos/60;

        
        
        System.out.println(" ");
        System.out.println( " LA CONVERSIÓN A MINUTOS SERIA: ");
        System.out.println(" ");
        System.out.println( segundos + " = " + conversion + "min");
       
    }
}