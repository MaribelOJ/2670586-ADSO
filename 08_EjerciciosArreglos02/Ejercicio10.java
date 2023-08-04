import java.util.Scanner;

public class Ejercicio10{
    public static void main(String [] args){

        Scanner dato = new Scanner(System.in);

        System.out.print("Ingrese el tamano del arreglo: ");
        int size = dato.nextInt();
        int t = size;
        int cont = 0;
        int num = 0;

        int arr[]= new int[size];
        
        System.out.println(t);
    
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
        

        for(int i = 0; i < size-1; i++){
            
            for(int p = 0; p < size; p++){
                
                if(p > i && arr[p] != num){
                    if(arr[i] == arr[p]){
                        t = t - 1;
                        num = arr[p];
                        cont = cont + 1;
                    }
                } 
            }
        }

        System.out.println(t);
        int posiciones[] = new int[cont];
        int arr2[]= new int[t];
        cont = 0;

        System.out.print("las posiciones son: {");

        for(int i = 0; i < size-1; i++){
            
            for(int p = 0; p < size; p++){
                
                if(p > i && arr[p] != num){
                    if(arr[i] == arr[p]){
                        posiciones[cont] = p;
                        num = arr[p];
                        cont= cont + 1;
                        System.out.print(posiciones[cont] + ", ");
                    }
                } 
            }
        }
        System.out.println(" }");

        cont = 0;
        int p=0;
        System.out.print("Arreglo nuevo: { ");

        for(int i = 0; i < size; i++){
            if(posiciones[p] != i){
                arr2[cont] = arr[i];
                if(cont == t-1){
                    System.out.print(arr2[cont]);
                }else{
                    System.out.print(arr2[cont] + ", ");
                }

                cont = cont + 1;
            }else{
                p=p+1;
            }
            
        }
        System.out.println(" }");
    }
}