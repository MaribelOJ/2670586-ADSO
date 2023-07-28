import java.util.Scanner;

public class Ejercicio06{
    public static void main(String [] args){

        Scanner entrada = new Scanner(System.in);

        System.out.print("Ingrese el tamano del arreglo: ");
        int size = entrada.nextInt();

        System.out.print("Ingrese el numero que desea encontrar: ");
        int num = entrada.nextInt();

        int enteros [] = new int[size];
        int cont = 0;
        

        System.out.print("Arreglo: { ");
        for(int i = 0; i < size; i++){

            enteros[i] = (int) ((Math.random()* 1000)+1);
            if(i == size-1){
                System.out.print(enteros[i]);
            }else{
                System.out.print(enteros[i] + ", ");
            }    
        }

        System.out.println(" }");

        for( int i = 0; i < size; i++){

            if(enteros[i] == num){
                cont = cont + 1;
            }
        }
        
        if(cont == 0){
            System.out.print("El numero " + num + " aparece " + cont + " veces");
        }else{ 
            System.out.print("El numero " + num + " aparece " + cont + " vez");
        }
        

        
    }
}