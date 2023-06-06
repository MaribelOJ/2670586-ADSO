import java.util.Scanner;
public class Ejercicio08{
    public static void main(String[]args){

        Scanner datos = new Scanner(System.in);

        System.out.print("Ingrese la base del triangulo: ");
        float base = datos.nextFloat();

        System.out.print("Ingrese la altura del triangulo: ");
        float altura = datos.nextFloat();

        if (base < 0 || altura < 0){
            System.out.println("No se aceptan numeros negativos, vuelva a ingresar los datos");
            System.out.print(" ");
            System.out.print("Ingrese la base del triangulo: ");
            base = datos.nextFloat();
            System.out.print("Ingrese la altura del triangulo: ");
            altura = datos.nextFloat();

            float area = (base * altura) / 2 ;
            System.out.print("area = " + area);
            

        }else{
            float area = (base * altura) / 2 ;
            System.out.print("area = " + area);
        }

        


    }
}