import java.util.Scanner;

public class Ejercicio08{
    public static void main(String [] args){
        Scanner dato = new Scanner(System.in);

        System.out.print("Ingrese el tamano del arreglo: ");
        int size = dato.nextInt();

        int arr[] = new int[size];
        int par = 0;
        int impar = 0;
        

        System.out.print("Arreglo Original: { ");

        for(int i = 0 ; i < size; i++){

            arr[i] = (int) ((Math.random()*100)+1);

            if(arr[i] % 2 == 0){
                par = par + 1;
            }else{
                impar = impar + 1;
            }

            if(i== size-1){
                System.out.print(arr[i]);
            }else{
                System.out.print(arr[i] + ", ");
            } 
        }
        System.out.println(" }");

        int pares[] = new int[par];
        int impares[] = new int[impar];
        int p = 0;

        System.out.print("Arreglo pares: { ");

        for(int i = 0; i < size; i++){
            if(arr[i] % 2 == 0){
                pares[p] = arr[i];
                if(p == 0){
                    System.out.print(pares[p]);
                    
                }else{
                    System.out.print( ", " +pares[p]);
                }
                p = p + 1;
            }    
        }

        System.out.println(" }");
        p=0;
        System.out.print("Arreglo impares: { ");

        for(int i = 0; i < size; i++){
            if(arr[i] % 2 != 0){
                impares[p] = arr[i];
                if(p == 0){
                System.out.print(impares[p]);
                }else{
                    System.out.print(", " + impares[p]);
                }
                p = p + 1;
            }
        }
        System.out.println(" }");
    }
}