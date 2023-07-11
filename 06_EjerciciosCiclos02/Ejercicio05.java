import java.util.Scanner;

public class Ejercicio05{
    public static void main(String[] args){
        Scanner numero = new Scanner(System.in);

        System.out.print("Ingrese un numero entero: ");
        int num = numero.nextInt();
        int resultado = 1;

        for(int i = 1; i <= num; i++){
            
            resultado = resultado * i;

            if(i < num){

                System.out.print(i + " x ");
            }else{
                System.out.print(i + " = " + resultado);
            }
        }
    }
}