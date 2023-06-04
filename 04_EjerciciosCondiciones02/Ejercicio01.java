import java.util.Scanner;
public class Ejercicio01{
    public static void main(String[]args){

        Scanner numero = new Scanner(System.in);

        System.out.print("ingrese un numero: ");
        float num = numero.nextFloat();

        if (num >= 0){
            System.out.print("El numero es positivo");
        }else{
            System.out.print("El numero es negativo");
        }

    }
}