import java.util.Scanner;
public class Ejercicio12{
    public static void main(String[]args){

        Scanner datos = new Scanner(System.in);

        double precioFinal;

        System.out.print("Ingrese el precio del articulo: ");
        int precio = datos.nextInt();

        System.out.print("Ingrese el descuento del articulo: ");
        float descuento = datos.nextFloat();

        if (descuento < 0 || descuento > 100){
            System.out.print("El descuento no es valido, ingreselo correctamente entre 0 y 100: ");
            descuento = datos.nextInt();

            descuento= descuento/100;

            precioFinal = precio-(precio * descuento);
            System.out.print("Precio Final: " + precioFinal);
            
        }else{

            descuento= descuento/100;
            precioFinal = precio-(precio * descuento);
            System.out.print("Precio Final: " + precioFinal);
        }

    }
}