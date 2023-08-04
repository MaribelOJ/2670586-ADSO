import java.util.Scanner;

public class Ejercicio09{
    public static void main(String [] args){

        Scanner entrada = new Scanner(System.in);

        System.out.print("Ingrese el tamano del arreglo: ");
        int size = entrada.nextInt();

        System.out.print("Ingrese el numero que desea encontrar: ");
        int num = entrada.nextInt();

        int enteros [] = new int[size];
        int posicion = -1;
        int cont = 0;
        

        System.out.print("Arreglo: { ");
        for(int i = 0; i < size; i++){

            enteros[i] = (int) ((Math.random()* 10)+1);
            if(i == size-1){
                System.out.print(enteros[i]);
            }else{
                System.out.print(enteros[i] + ", ");
            }    
        }

        System.out.println(" }");

        for( int i = 0; i < size; i++){

            if(enteros[i] == num){
                posicion = i;
                cont = cont + 1;
            }
        }

        if(cont != 0){
            System.out.print("Se encontro el numero " + num + " en la posicion " + posicion);
        }else{
            System.out.print("Como no se encontro el numero " + num + ", la posicion es igual a " + posicion);
        }
    }
}