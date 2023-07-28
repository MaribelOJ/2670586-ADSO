import java.util.Scanner;

public class Ejercicio02{
    public static void main(String[] args){
        Scanner entrada = new Scanner(System.in);

        System.out.print("Ingrese el tamano del arreglo: ");
        int size = entrada.nextInt();

        int enteros [] = new int[size];
        int multi = 1;
        System.out.print("Arreglo: { ");
        for(int i = 0; i < size; i++){

            enteros[i] = (int) ((Math.random()* 100)+1);
            if(i == size-1){
                System.out.print(enteros[i]);
            }else{
                System.out.print(enteros[i] + ", ");
            }
        }
        System.out.println(" }");
    
        for(int i=0; i < size; i++){
            multi = multi * enteros[i];
        }

        System.out.print("El producto de todos los enteros es: " + multi);
    }
}