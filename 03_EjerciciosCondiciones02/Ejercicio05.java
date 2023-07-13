import java.util.Scanner;
public class Ejercicio05{
    public static void main(String[]args){

        Scanner ano = new Scanner(System.in);

        System.out.print("ingrese un año: ");
        int year = ano.nextInt();

        if (year <= 999){
            System.out.print("ingrese los 4 digitos del año: ");
            year = ano.nextInt();

        }

        if (year % 4 == 0){
            System.out.print("El año es bisiesto");
        }else if (year % 100 == 0 && year % 400 == 0){
            System.out.print("El amo es bisiesto");
        }else{
            System.out.print("El año no es bisiesto");
        }

    }
}