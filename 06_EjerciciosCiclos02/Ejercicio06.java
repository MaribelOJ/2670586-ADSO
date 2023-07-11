import java.util.Scanner;

public class Ejercicio06{

    public static void main(String[] args){
        Scanner rango = new Scanner(System.in);

        System.out.print("Ingrese el primer factorial: ");
        int N = rango.nextInt();

        System.out.print("Ingrese el ultimo factorial: ");
        int M = rango.nextInt();

        int resultado = 1;
        String factorial = "1 ";

        if ( N > M){
            System.out.println(" los factoriales se imprimen de forma ascendente, ingrese nuevamente los numeros de menor a mayor: ");
            System.out.print("Primer factorial: ");
            N = rango.nextInt();
            System.out.print("Ultimo factorial: ");
            M = rango.nextInt();
        }

        for(int i = 1; i <= N; i++){
            
            resultado = resultado * i;

            if(i > 1){
                
                factorial = factorial + "x " + i;
            }

        }

        System.out.println("Factorial de " + N + " ( " + N + "! ): ");
        System.out.println(factorial + " = " + resultado);       
    
        while(N < M){
            N = N +1;
            resultado = resultado * N;
            System.out.println(" Factorial de " + N + " ( " + N + "! ) : ");
            System.out.println(factorial + " x " + N + " = " + resultado);
        }

    }
}