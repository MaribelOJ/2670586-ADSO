import java.util.Scanner;

public class Ejercicio14{
    public static void main(String [] args){
        Scanner entrada = new Scanner(System.in);

        System.out.print("Ingrese el tamano del arreglo: ");
        int n = entrada.nextInt();

        System.out.print("Ingrese un numero entero: ");
        int m = entrada.nextInt();

        float arr1 [] = new float[n];
        float arr2 [] = new float[n];
        int p=0;

        System.out.print("Arreglo: { ");
        for(int i= 0; i < arr1.length; i++){
            arr1[i] = (float) Math.random()* 100 ;
            if(i == 0){
                System.out.print(arr1[i]);
            }else{
                System.out.print(", " + arr1[i]);
            }    
        }
        System.out.println(" }");

        for(int i = 0; i < n; i++){
            if(arr1[i] > m){
                arr2[i] = arr1[i] - m;
            }else{
                arr2[i] = m - arr1[i];
            }
        }

        for(int i = 1; i < n; i++){
            if(arr2[p] > arr2[i]){
                p = i;
            }
        }

        System.out.print("El numero mas cercano a " + m + " es : " + arr1[p]);
    }
}