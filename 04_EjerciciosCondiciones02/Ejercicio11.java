import java.util.Scanner;
public class Ejercicio11{
    public static void main(String[]args){

        Scanner numero = new Scanner(System.in);

        System.out.print("ingrese un numero: ");
        String num = numero.nextLine();

        int conversion = Integer.parseInt(num);

        if (conversion % 2 == 0){
            System.out.print("El numero es par");
        }else{
            System.out.print("El numero es impar");
        }

    }
}