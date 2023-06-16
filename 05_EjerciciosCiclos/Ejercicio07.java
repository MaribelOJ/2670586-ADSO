import java.util.Scanner;
public class Ejercicio07{
    public static void main(String[] args){

        Scanner numeros= new Scanner(System.in);

        System.out.print("Ingrese el primer numero entero: ");
        int num1 = numeros.nextInt();
        System.out.print("Ingrese el segundo numero entero: ");
        int num2 = numeros.nextInt();
        System.out.print("Ingrese el tercer numero entero: ");
        int num3 = numeros.nextInt();

        String multiplos1 = "";
        String multiplos2 = "";
        String multiplos3 = "";

        for( int i=0; i<=10; i++ ){
			int resultado1 = num1 * i;
            int resultado2 = num1 * i;
            int resultado3 = num1 * i;

            multiplos1 = multiplos1 + Integer.toString(resultado1)+ ", ";
            multiplos2 = multiplos2 + Integer.toString(resultado2)+ ", ";
            multiplos3 = multiplos3 + Integer.toString(resultado3)+ ", ";
		}        

    }
}