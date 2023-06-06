import java.util.Scanner;
public class Ejercicio07{
    public static void main(String[]args){

        Scanner numero = new Scanner(System.in);

        System.out.print("Ingrese un numero de minimo 3 digitos y maximo 5 digitos: ");
        int num = numero.nextInt();

        int ultimo= num % 10;
        int penultimo= (num % 100 )/ 10;
        int antepenultimo =(num % 1000)/100;
        int trasantepenultimo =(num % 10000)/1000;
        int siguiente = num / 10000;

        if (num >= 100 && num <= 999){
            antepenultimo = num / 100;
            if (ultimo == antepenultimo)
                System.out.print("El numero es palindromo");
            else{
                System.out.print("El numero no es palindromo");
            }
        }else if(num > 999 && num <= 9999){
            trasantepenultimo = num /1000; 
            if (ultimo == trasantepenultimo && penultimo == antepenultimo){
                System.out.print("El numero es palindromo");
            }else{
                System.out.print("El numero no es palindromo");
            }    
        }else if (num > 9999 && num <= 99999 ){
            if(ultimo == siguiente && penultimo == trasantepenultimo){
                System.out.print("El numero es palindromo");
            }else{
                System.out.print("El numero no es palindromo");
            }
        }else{
           System.out.print("El numero ingresado no es valido, intentelo de nuevo!"); 
        }

    }
}