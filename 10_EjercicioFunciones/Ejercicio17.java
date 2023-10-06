import java.util.Scanner;

public class Ejercicio17{
    public static void main (String [] args){
        Scanner num = new Scanner(System.in);

        System.out.println("Ingrese un numero entero: ");
        long number = num.nextLong();

        long suma = sumarDigitos(number);
        System.out.println("La suma de los digitos " + number + " es igual a: "+ suma);
    }

    public static long sumarDigitos(long number){
        long suma= 0;
        
        while(number >= 10){
            suma = suma + (number % 10);
            number = number / 10;
        }

        suma = suma + number;
        return suma;
    }
}