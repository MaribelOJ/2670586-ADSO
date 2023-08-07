import java.util.Scanner;
import java.util.Arrays;

public class Ejercicio11{
    public static void main(String [] args){
        Scanner entrada = new Scanner(System.in);

        System.out.print("Ingrese el tamano del primer arreglo: ");
        int n = entrada.nextInt();

        System.out.print("Ingrese el tamano del segundo arreglo: ");
        int m = entrada.nextInt();

        int arr1 [] = new int[n];
        int arr2 [] = new int[m];

        System.out.print("Arreglo 1: { ");
        for(int i= 0; i < arr1.length; i++){
            arr1[i] = (int) (Math.random()* 100 + 1);
            if(i == 0){
                System.out.print(arr1[i]);
            }else{
                System.out.print(", " + arr1[i]);
            }    
        }
        System.out.println(" }");


        System.out.print("Arreglo 2: { ");
        for(int i= 0; i < arr2.length; i++){
            arr2[i] = (int) (Math.random()* 100 + 1);
            if(i == 0){
                System.out.print(arr2[i]);
            }else{
                System.out.print(", " + arr2[i]);
            }
        }
        System.out.println(" }");

        int arr3[] = new int[n+m];
        int p = 0;

        for(int i= 0; i < arr3.length; i++){
            if(i <= n-1){
                arr3[i] = arr1[i];
            }else{
                arr3[i] = arr2[p];
                p = p + 1;
            }
        }

        Arrays.sort(arr3);
        System.out.print("Arreglo 3: { ");
        for(int i= 0; i < arr3.length; i++){
            if(i == 0){
                System.out.print(arr3[i]);
            }else{
                System.out.print(", " + arr3[i]);
            }
        }
        System.out.println(" }");
    }
}