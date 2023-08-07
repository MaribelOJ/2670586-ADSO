import java.util.Scanner;

public class Ejercicio15{
    public static void main (String [] args){
        Scanner dato = new Scanner(System.in);

        System.out.print("Ingrese el tamano del arreglo: ");
        int size = dato.nextInt();
        int t = size - 1;
        boolean palindromo = true;

        int arr1 [] = new int[size];
        int arr2 [] = new int[size];
        
        for(int i = 0 ; i < size; i++){
            System.out.print("Ingrese el numero " + (i+1) + " : ");
            int num = dato.nextInt();
            arr1[i] = num; 
            arr2[t] = num;
            t= t - 1;   
        }
        

        System.out.print("Arreglo: { ");
        for(int i = 0 ; i < size; i++){
            if(i == 0){
                System.out.print(arr1[i]);
            }else{
                System.out.print(", " + arr1[i]);
            }

            if( arr1[i] != arr2[i]){
                palindromo = false;
            }
        }
        System.out.println(" }");

        if(palindromo == true){
            System.out.print("El arreglo SI es palindromo");
        }else{
            System.out.print("El arreglo NO es palindromo");
        }


    }
}