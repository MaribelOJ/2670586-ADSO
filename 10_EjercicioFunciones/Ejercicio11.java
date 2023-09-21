import java.util.Scanner;

public class Ejercicio11{
    public static void main(String [] args){

        System.out.println("Ingrese el numero del cual desea calcular el factorial: ");
        Scanner dato = new Scanner(System.in);
        int num = dato.nextInt();

        Ejercicio11 factorial = new Ejercicio11();
        factorial.printFactorial(num);
        System.out.print( "El resultado del factoria de "+ num + "! es: " + factorial(num));
                
       
    }


    public static int factorial(int a){
        int calculo = 1;
        for(int i = 1; i <= a; i++){

            calculo = calculo * i;
        }

        return calculo;
    }

    public void printFactorial(int a){

        System.out.print( a + "!: ");
        
        for(int i = 1; i <= a; i++){
            if(i == 1){
                System.out.print(i);
            }else{
                System.out.print(" * " + i); 
            }
        }
        System.out.println("");

    }
}