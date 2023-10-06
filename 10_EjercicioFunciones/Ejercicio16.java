import java.util.Scanner;

public class Ejercicio16{
    public static void main(String [] args){
        Scanner num = new Scanner(System.in);
        System.out.println("Ingrese un numero entero: ");
        long number = num.nextLong();

        int digitos = contarDigitos(number);
        System.out.print("El numero "+ number + " tiene " + digitos + " digitos.");
    }

    public static int contarDigitos(long number){
        int cont = 17;
        long max=100000000000000000L;
        long min=10000000000000000L;

        while(number != 0){
            
            if(number >= min && number < max){
                number = 0;
                
            }else{
                cont--;
                max= max/10;
                min = min/10;
            }            
        }
        return cont;
    }
}