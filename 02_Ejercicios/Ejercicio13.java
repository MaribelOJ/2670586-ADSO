import java.util.Scanner;
public class Ejercicio13{
    public static void main (String [] args){
        Scanner tiempo = new Scanner(System.in);

        int segundos, seconds, conversion1, conversion2, min, sec;


        System.out.println("OPERACION: Conversion de segundos a horas, minutos y segundos");
        System.out.println(" ");
        System.out.println("Ingrese el tiempo en segundos HASTA 3.600 seg, si son más ingrese (0): ");
        segundos = tiempo.nextInt();
        System.out.println("Ingrese el tiempo en segundos si son MAS de 3.600 seg:");
        seconds = tiempo.nextInt();
        
        conversion1= segundos/60;

        conversion2=seconds/3600;

        min = (seconds - (3600 * conversion2)) / 60;
        
        sec = (seconds - (3600 * conversion2)) - (min * 60);

        sec = (seconds - (3600 * conversion2)) - (min * 60);

        System.out.println(" ");
        System.out.println( " LA CONVERSIÓN A MINUTOS SERIA: ");
        System.out.println(" ");
        System.out.println( segundos + " = " + conversion1 + "min");
        System.out.println(" ");
        System.out.println( " LA CONVERSIÓN A HORAS , MINUTOS y SEGUNDOS SERIA: ");
        System.out.println(" ");
        System.out.println( seconds + "secs" +  " = " + conversion2 + " : " + min + " : " + sec);
       
    }
}
