import java.util.Scanner;

public class Ejercicio04{
    public static void main(String[] args){
        Scanner entrada = new Scanner(System.in);

        System.out.print("Ingrese el tamano del arreglo: ");
        int size = entrada.nextInt();

        int enteros [] = new int[size];
        int menor = 0, p = 0;

        System.out.print("Arreglo: { ");
        for(int i = 0; i < size; i++){

            enteros[i] = (int) ((Math.random()* 1000)+1);
            if(i == size-1){
                System.out.print(enteros[i]);
            }else{
                System.out.print(enteros[i] + ", ");
            }
            
        }
        System.out.println(" }");
    
        for(int i = 1; i < size; i++){
               
            if(enteros[p] < enteros[i]){
                menor = enteros[p];
            }else{
                p = i;
                menor = enteros[p];
            }
    
        }

        System.out.print("El valor minimo de todos los enteros es: " + menor);
    }
}