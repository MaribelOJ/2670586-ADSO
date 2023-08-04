import java.util.Scanner;

public class Ejercicio07{
    public static void main(String [] args){

        Scanner dato = new Scanner(System.in);

        System.out.print("Ingrese el tamano del arreglo: ");
        int size = dato.nextInt();

        int arr[]= new int[size];

        System.out.print("Arreglo Original: { ");

        for(int i = 0; i < size;i++){

            arr[i] = (int) ((Math.random() * 100)+1);

            if(i== size-1){
                System.out.print(arr[i]);
            }else{
                System.out.print(arr[i] + ", ");
            }    
        }
        System.out.println(" }");

        System.out.print("Arreglo Inverso: { ");

        for(int i = size-1; i >= 0;i = i-1){
            if(i== 0){
                System.out.print(arr[i]);
            }else{
                System.out.print(arr[i] + ", ");
            }
        }
        System.out.println(" }");

    }
}