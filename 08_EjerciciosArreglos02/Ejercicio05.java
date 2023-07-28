import java.util.Scanner;

public class Ejercicio05{
    public static void main(String[] args){
        Scanner entrada = new Scanner(System.in);

        System.out.print("Ingrese el tamano del arreglo: ");
        int size = entrada.nextInt();

        float enteros [] = new float[size];
        float promedio = 0;
        System.out.print("Arreglo: { ");
        for(int i = 0; i < size; i++){

            enteros[i] = (float) ((Math.random()* 1000)+1);
            if(i == size-1){
                System.out.print(enteros[i]);
            }else{
                System.out.print(enteros[i] + ", ");
            }
        }

        System.out.println(" }");
    
        for(int i=0; i < size; i++){
            promedio = promedio + enteros[i];
        }

        promedio = promedio / size;

        System.out.print("El promedio de todos los enteros es: " + promedio);
    }
}