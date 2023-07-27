import java.util.Scanner;

public class Ejercicio05{
    public static void main(String[] args){
        Scanner entrada = new Scanner(System.in);

        System.out.print("Ingrese el tamano del arreglo: ");
        int size = entrada.nextInt();
        int num;

        int enteros [] = new int [size];

        for(int i = 1 ; i <= size; i++){
            System.out.print("Ingrese numero entero " + i + " : ");
            num = entrada.nextInt();
            enteros[i-1] = num;
        }

        System.out.print("Arreglo : { ");
        for(int i = 0; i < size; i++){
            if(i == size -1){
                System.out.print(enteros[i]);
            }else{
                System.out.print(enteros[i] + ", ");
            }
        }
        System.out.println(" }");

        System.out.print("Numero de movimientos: ");
        int p = entrada.nextInt();
        int cont = 1;

        while(p > 0){
            
            p = p - 1;
            num = enteros[0];
            for(int i = 0; i < p; i++){
                enteros[i] = enteros[i + 1];
            }
            
            for( int i = p; i < size-1 ; i++){    
                enteros[i] = enteros[i+1];
            }

            System.out.print("Movimiento 0" + cont + " : { " );
            cont = cont + 1;

            for(int i = 0; i < size - 1; i++){
                
                System.out.print(enteros[i] + ", ");
                
            }

            enteros[size - 1] = num;
            System.out.println(enteros[size-1] + " }" );

        }

    }
}