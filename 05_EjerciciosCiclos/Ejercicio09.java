import java.util.Scanner;
public class Ejercicio09{
    public static void main(String[] args){

        Scanner numero = new Scanner(System.in);

        System.out.print("Ingrese un numero entero: ");
        int num = numero.nextInt();
        int cont = 0;

        for( int i = 1; i <= num; i++){
		        if(num % i == 0){
                cont = cont + 1;
            }
        }

        if(cont>2){
            System.out.print("El numero ingresado NO es primo");
        }else{
            System.out.print("El numero ingresado ES primo");
        } 
        

    }
}