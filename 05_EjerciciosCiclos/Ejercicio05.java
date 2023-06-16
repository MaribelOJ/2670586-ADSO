import java.util.Scanner;
public class Ejercicio05{
    public static void main(String[] args){

        Scanner numero = new Scanner(System.in);

        System.out.print("Ingrese la cantidad de numeros que desea ver de la sucesion fibonacci: ");
        int cant = numero.nextInt();
        int rounds = 0;
        int suma = 1;
        int numA = 1;
        String sucesion = "0";
        
        if(cant == 1 ){
            System.out.print(sucesion);
        }else if(cant ==2){

            sucesion = sucesion + ", " + Integer.toString(suma);
            System.out.print(sucesion);
        }else{
            sucesion = "0, 1";
            while(rounds <= cant-3){
                
                sucesion = sucesion + ", " + Integer.toString(suma);
                suma= numA + suma;
                numA = suma - numA;
                rounds = rounds +1;
    
            }
            System.out.print(sucesion);

        }


    }
}