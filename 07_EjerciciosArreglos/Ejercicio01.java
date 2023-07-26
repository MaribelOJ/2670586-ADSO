import java.util.Scanner;

public class Ejercicio01{
    public static void main(String [] args){
        Scanner entrada = new Scanner(System.in);

        System.out.print("Ingrese el tamano del arreglo: ");
        int size = entrada.nextInt();

        int impares [] = new int [size];
        int nums = 1;

        System.out.print("el conjunto de numeros impares es [ ");
        for(int i = 0 ; i < size ; i++){
            impares [i] = nums;
            nums = nums + 2;
            if(i == size-1){
                System.out.print( impares[i]);
            }else{
                System.out.print( impares[i] + ", ");
            }
            
        }
        
        System.out.print(" ]");
        
    }
}