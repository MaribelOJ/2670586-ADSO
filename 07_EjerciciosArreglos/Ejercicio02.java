import java.util.Scanner;

public class Ejercicio02{
    public static void main(String [] args){
        Scanner entrada = new Scanner(System.in);

        System.out.print("Ingrese el tamano del arreglo: ");
        int size = entrada.nextInt();

        int primos [] = new int [size];
        int nums = 1;
        int p = 0;
        int cont = 0;
        int cant = 0;

        System.out.print("el conjunto de numeros primos es [ ");
        while(cont < size){
            
            for(int i = 1 ; i <= nums; i++){
                if( nums % i == 0){
                    cant = cant + 1;
                }    
            }

            if(cant <= 2){
                    
                cont = cont + 1;
                cant = 0;
                primos[p] = nums;
                if (p == size-1){
                    System.out.print( primos[p]);
                }else{
                    System.out.print( primos[p] + ", ");
                } 
                p = p + 1;
                nums = nums + 1;
            }else{
                cant = 0;
                nums = nums + 1;

            } 
            
        }
        
        System.out.print(" ]");
        
    }
}