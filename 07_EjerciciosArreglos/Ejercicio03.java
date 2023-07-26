import java.util.Scanner;

public class Ejercicio03{
    public static void main(String[] args){
        Scanner entrada = new Scanner(System.in);

        int enteros [] = new int [10];
        int num;

        for(int i = 1 ; i <= 10; i++){
            System.out.print("Ingrese numero entero " + i + " : ");
            num = entrada.nextInt();
            enteros[i-1] = num;
        }

        for(int i = 0; i < 10; i++){
            if(i != 0){
                if(i == 9){
                    System.out.print(enteros[i] + " ]");
                }else{
                    System.out.print(enteros[i] + ", ");
                }
            }else{
                System.out.print("Arreglo: [ " + enteros[i]+ ", " );
            }
        }

        System.out.println(" ");
        System.out.print("Posicion: ");
        int p = entrada.nextInt();
        System.out.print("Anti horario: ");

        for(int i = p ; i >= 0 ; i = i - 1){
            System.out.print(enteros[i] + " - ");
        }

        for(int i = p + 1 ; i < 10 ; i++){
            if(i == 9){
                System.out.print(enteros[i]);
            }else{
                System.out.print(enteros[i] + " - ");
            }
        }
    }
}