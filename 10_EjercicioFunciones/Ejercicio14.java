import java.util.Scanner;
import java.util.Arrays;

public class Ejercicio14{
    public static void main(String [] args){
    
        int array1 [] = new int[10];

        int copiaArray [] = new int[10];

        array1 = llenarArreglo(array1);
        
        for(int i=0; i < array1.length; i++){
            copiaArray[i] = array1[i];
        }

        if(verificarOrden(array1,copiaArray) == true){
            System.out.print("El arreglo esta ordenado de forma ascendente");
        }else{
            System.out.print("El arreglo NO esta ordenado de forma ascendente");
        }
    }

    public static int [] llenarArreglo(int [] array1){
        Scanner num = new Scanner(System.in);

        for(int i = 0; i < array1.length; i++){
            System.out.println(" Ingrese el numero "+ (i+1) + ": ");
            int number = num.nextInt();
            array1[i] = number;
        }

        return array1;
    }

    public static boolean verificarOrden(int [] array1, int [] copia){     
        Arrays.sort(array1);

        for(int i = 0; i < array1.length; i++){

            if(array1[i] != copia[i]){
                return false;
            }
        }

        return true;     
    }
}