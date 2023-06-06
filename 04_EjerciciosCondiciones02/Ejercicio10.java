import java.util.Scanner;
public class Ejercicio10{
    public static void main(String[]args){

        Scanner fecha = new Scanner(System.in);

        System.out.println("Para saber si es mayor de edad");
        System.out.print("Ingrese su ano completo de nacimiento: ");
        int year = fecha.nextInt();
        System.out.print("Ingrese el numero del mes de nacimiento: ");
        int month = fecha.nextInt();
        System.out.print("Ingrese su dia de nacimiento: ");
        int day = fecha.nextInt();
        System.out.print("Ahora, ingrese el ano actual completo: ");
        int currentYear = fecha.nextInt();
        System.out.print("Ingrese el numero del mes actual: ");
        int currentMonth = fecha.nextInt();
        System.out.print("Ingrese el numero del dia actual: ");
        int currentDay = fecha.nextInt();

        int calculo = (currentYear-year);

     
        if (calculo >= 18  && currentMonth == month){
            if (currentDay >= day){
                System.out.print("Usted es mayor de edad");
            }else{
                System.out.print("Usted es menor de edad");
            }
        }else if (calculo >= 18  && currentMonth > month){
            System.out.print("Usted es mayor de edad");
        }else{
            System.out.print("Usted es menor de edad");
        }

    }
}