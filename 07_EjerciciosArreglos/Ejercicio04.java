import java.util.Scanner;

public class Ejercicio04{
    public static void main(String[] args){
        Scanner entrada = new Scanner(System.in);

        System.out.print("Ingrese el tamano del arreglo: ");
        int size = entrada.nextInt();

        int enteros [] = new int [size];
        int num;
        int cont = 0, r = 0;

        for(int i = 1 ; i <= size; i++){
            System.out.print("Ingrese numero entero " + i + " : ");
            num = entrada.nextInt();
            enteros[i-1] = num;
        }

        System.out.print("El arreglo original es : [ ");
        for(int i = 0; i < size; i++){
            if(i == size -1){
                System.out.print(enteros[i]);
            }else{
                System.out.print(enteros[i] + ", ");
            }
        }
        System.out.print(" ]");

        System.out.println(" ");
        System.out.print("Arreglo descendente: [ ");
        for(int i = 0; i < size; i++){
            
            for(int p = cont; p < size; p++){
                
                if(enteros[i] > enteros[p]){
                    num = enteros[i];
                }else{
                    i = p;
                    num = enteros[i];
                }

                if(p == size-1){
                    if(enteros[cont] != num){
                        enteros[i] = enteros[cont];
                        enteros[cont] = num;

                        i=cont;
                    }   
                }
            }

            if(i == size-1){
                System.out.print(enteros[cont]);
            }else{
                System.out.print(enteros[cont] + ", ");
            }
            
            cont = cont + 1;
            
        }

        System.out.print(" ]");
    }
}