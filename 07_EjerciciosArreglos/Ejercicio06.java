import java.util.Scanner;

public class Ejercicio06{
    public static void main(String[] args){
        Scanner entrada = new Scanner(System.in);

        System.out.print("Ingrese el tamano del arreglo: ");
        int size = entrada.nextInt();
        int num = 0, pri= 0 , noPri = 0, cont = 0, cant = 0;

        int enteros [] = new int [size];

        for(int i = 1 ; i <= size; i++){
            System.out.print("Ingrese numero entero " + i + " : ");
            num = entrada.nextInt();
            enteros[i-1] = num;

            for(int p = 1; p <= num; p++){
                if(num % p == 0){
                    cont = cont + 1;
                }
            }

            if(cont <= 2){
                pri = pri + 1;
                
            }else{
                noPri = noPri + 1;
            }

            cont = 0;
        }

        System.out.print("Arreglo Original: { ");
        for(int i = 0; i < size; i++){
            if(i == size -1){
                System.out.print(enteros[i]);
            }else{
                System.out.print(enteros[i] + ", ");
            }
        }
        System.out.println(" }");

        int primos [] = new int [pri];
        int nPrimos [] = new int [noPri];
        pri= 0;
        noPri = 0;
       
        while (cont < size){

            num = enteros[cont];

            for(int i = 1 ; i <= num; i++){
                
                if(num % i == 0){
                    cant = cant + 1;
                }
            }

            if(cant <= 2){

                primos[pri] = num;
                pri = pri + 1;
                
            }else{
                nPrimos[noPri] = num;
                noPri = noPri + 1;
            }

            cont= cont + 1;
            cant = 0;

        }

        System.out.print("Arreglo Primos: { ");
        for(int i = 0; i < primos.length ; i++){
            if(i == primos.length -1){
                System.out.print(primos[i]);
            }else{
                System.out.print(primos[i] + ", ");
            }
        }
        System.out.println(" }");

        
        System.out.print("Arreglo No Primos: { ");
        for(int i = 0; i < nPrimos.length; i++){
            if(i == nPrimos.length - 1){
                System.out.print(nPrimos[i]);
            }else{
                System.out.print(nPrimos[i] + ", ");
            }
        }
        System.out.println(" }");
    }
}