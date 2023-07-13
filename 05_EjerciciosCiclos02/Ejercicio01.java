import java.util.Scanner;

public class Ejercicio01{
    public static void main(String[] args){
        Scanner cantidad= new Scanner(System.in);

        System.out.print("Ingrese un numero entero ente 1 y 6: ");
        int num = cantidad.nextInt();
        String wholenum = "";

        for(int i = 1; i <= num; i++){

            int numeros = (int) ( Math.random() * 9);
            wholenum = wholenum + numeros;
        }       

        System.out.println("El numero construido es: " + wholenum);
        int mult = Integer.parseInt(wholenum)* 2;
        System.out.println("Resultado de la multiplicacion por 2 es: " + mult);

    }
}