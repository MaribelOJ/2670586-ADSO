import java.util.Scanner;

public class Ejercicio13{
    public static void main(String [] args){
        Scanner entrada = new Scanner(System.in);

        System.out.print("Ingrese el tamano de los arreglos: ");
        int n = entrada.nextInt();

        int arr1 [] = new int[n];
        int arr2 [] = new int[n];
        int arr3 [] = new int[n];

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

        System.out.print("Arreglo 3: { ");
        for(int i= 0; i < arr3.length; i++){

            arr3[i]= arr1[i] + arr2[i];

            if(i == 0){
                System.out.print(arr3[i]);
            }else{
                System.out.print(", " + arr3[i]);
            }
        }
        System.out.println(" }");

    }
}