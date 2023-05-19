import java.util.Scanner;

public class Ejercicio20{

    public static void main (String[] args){

        Scanner entrada = new Scanner(System.in);

        System.out.print("=> Ingrese numero (maximo 5 digitos): ");
        int numero = entrada.nextInt();

        int digito_5 = numero%10;
        int digito_4 = (numero%100)/10;
        int digito_3 = (numero%1000)/100;
        int digito_2 = (numero%10000)/1000;
        int digito_1 = (numero%100000)/10000;

        System.out.println( "Digito 01:" + digito_1);
        System.out.println( "Digito 01:" + digito_2);
        System.out.println( "Digito 01:" + digito_3);
        System.out.println( "Digito 01:" + digito_4);
        System.out.println( "Digito 01:" + digito_5);

        int resultado = digito_1 + digito_2 + digito_3 + digito_4 + digito_5;
        System.out.println("=> La suma de los digitos es: " + resultado);

    }
}