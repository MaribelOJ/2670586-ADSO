import java.util.Scanner;

public class Ejercicio18{
    public static void main (String [] args){
        Scanner num = new Scanner(System.in);

        System.out.println("Ingrese un numero entero: ");
        String number = num.nextLine();

        String invertir = invertirNum(number);
        System.out.println("el numero " + number + " invertido quedaria asi: "+ invertir);
    }

    public static String invertirNum(String number){
        long digits= 0;
        char firstDigit = number.charAt(0);
        long num = Long.parseLong(number);
        String invertir =""; 
        char zero = '0';    

        while(num >= 10){
            digits = num % 10;
            num = num / 10;
            invertir = invertir + digits;
        }

        if(firstDigit == zero){
            invertir = invertir + num + "0";
        }else{
            invertir = invertir + num;
        }
 
        return invertir;

    }
}