import java.util.Scanner;

public class Ejercicio12{
    public static void main(String [] args){

        Scanner dato = new Scanner(System.in);

        System.out.print("Ingrese un numero entero: ");
        int num = dato.nextInt();

        if(verificarPrimo(num) == true){
            System.out.print("El numero ingresado ES Primo");
        }else{
            System.out.print("El numero ingresado NO es Primo");
        }

    }

    public static Boolean verificarPrimo(int a){
        int cont = 0;
        for(int i = 1 ; i <= a; i++){
            if(a % i == 0){
                cont++;
            }
        }

        if(cont > 2){
            return false;
        }else{
            return true;
        }
    }
}