import java.util.Scanner;

public class Ejercicio12{
    public static void main(String [] args){
        Scanner entrada = new Scanner(System.in);

        System.out.print("Ingrese el tamano del arreglo: ");
        int size = entrada.nextInt();
        int cont = 0, primos = 0;
        

        int arr1 [] = new int[size];

        System.out.print("Arreglo: { ");
        for(int i= 0; i < size; i++){
            arr1[i] = (int) (Math.random()* 100 + 1);
            if(i == 0){
                System.out.print(arr1[i]);
            }else{
                System.out.print(", " + arr1[i]);
            }
        }
        System.out.println(" }");

        for(int i= 0; i < size; i++){
            for(int p = 1; p <= arr1[i]; p++){
                if(arr1[i] % p == 0){
                    cont ++;                   
                }
            }
            if(cont <= 2){
                primos = primos +1;
            }
            cont = 0;
        }

        System.out.print("En el arreglo hay " + primos + " numeros primos");
    }
}