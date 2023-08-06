import java.util.Scanner;
import java.util.Arrays;

public class Ejercicio10{
    public static void main(String [] args){

        Scanner dato = new Scanner(System.in);

        System.out.print("Ingrese el tamano del arreglo: ");
        int size = dato.nextInt();
        int t = size;
        int cont = 0;
        int num = 0;

        int arr[]= new int[size];
    
        System.out.print("Arreglo Original: { ");

        for(int i = 0; i < size;i++){

            arr[i] = (int) ((Math.random() * 10)+1);
            
            if(i== size-1){
                System.out.print(arr[i]);
            }else{
                System.out.print(arr[i] + ", ");
            }    
        }

        System.out.println(" }");
        

        for(int i = 0; i < size; i++){
            
            for(int p = 0; p < i; p++){
                
                if(i!= 0){
                    if(arr[i] == arr[p]){
                        t = t - 1;
                        cont = cont + 1;
                        p = i;
                    }
                } 
            }
        }

        if(cont != 0){
            int posiciones[] = new int[cont];
            int arr2[]= new int[t];
            cont = 0;
            num = 0;
            for(int i = 0; i < size; i++){
                
                for(int p = 0; p < i; p++){
                    
                    if(i!= 0){
                        if(arr[i] == arr[p]){
                            posiciones[cont] = i;                           
                            cont= cont + 1;
                            p = i;    
                        }
                    } 
                }
            }

            cont = 0;
            boolean seRepite = false;

            Arrays.sort(posiciones);
            
            for(int i = 0; i < size; i++){

                for(int p = 0; p < posiciones.length; p++){

                    if( posiciones[p] == i){
                        seRepite = true;   
                    }
                }

                if(seRepite == false){
                    arr2[cont] = arr[i];
                    cont = cont + 1;
                }else{
                    seRepite = false;
                }

            }

            System.out.print("Arreglo nuevo: { ");
            
            for(int i = 0; i < arr2.length ; i++){
                if(i == 0){
                    System.out.print(arr2[i]);
                }else{
                    System.out.print(", " + arr2[i]);
                }
            }
            System.out.println(" }");

        }    
    }
}