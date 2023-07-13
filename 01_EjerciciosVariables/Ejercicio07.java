import java.util.Scanner;
public class Ejercicio07{
    public static void main (String [] args){
        
        Scanner numero = new Scanner(System.in);

        float precio, descuento, precioFinal;
      

        System.out.println("OPERACION: Aplicacion de descuento");
        System.out.println(" ");
        System.out.println("Ingrese el precio del producto: ");
        precio = numero.nextFloat();

        System.out.println("Ingrese el descuento sin el simbolo (%): ");
        descuento = numero.nextFloat();

        descuento = precio * (descuento / 100);
        precioFinal = precio - descuento;

        System.out.println("EL PRECIO FINAL DEL PRODUCTO ES: ");
        System.out.println(" ");
        System.out.println(precioFinal);


    }
}