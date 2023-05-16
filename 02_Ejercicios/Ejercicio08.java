import java.util.Scanner;
public class Ejercicio08{
    public static void main (String [] args){
        
        Scanner numero = new Scanner(System.in);

        String cadena1, cadena2, union;
      

        System.out.println("OPERACION: Concatenacion de dos cadenas");
        System.out.println(" ");
        System.out.println("Ingrese un frase corta: ");
        cadena1 = numero.nextLine();

        System.out.println("Ingrese otra frase corta: ");
        cadena2 = numero.nextLine();

        union = cadena1 + " " + cadena2;

        System.out.println("LA UNION DE LAS FRASES DICE: ");
        System.out.println(" ");
        System.out.println(union);


    }
}