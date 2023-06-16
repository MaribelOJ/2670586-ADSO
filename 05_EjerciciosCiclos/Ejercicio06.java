import java.util.Scanner;
public class Ejercicio06{
    public static void main(String[] args){

        Scanner posicion= new Scanner(System.in);

        System.out.print("Ingrese la posicion del numero que desea ver de la sucesion fibonacci: ");
        int num = posicion.nextInt();
        int rounds = 1;
        int suma = 1;
        int numA = 1;        
        String sucesion = "0";

        if(num ==1){
            System.out.print(sucesion);

        } if (num == 2){

            System.out.print(suma);

        }else{
        
            sucesion = "0, 1";
            while(rounds <= num-3){
                    
                sucesion = sucesion + ", " + Integer.toString(suma);
                suma= numA + suma;
                numA = suma - numA;
                rounds = rounds +1;
        
            }
            System.out.print(suma);

        }
    }
}