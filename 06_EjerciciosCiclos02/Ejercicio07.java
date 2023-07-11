import java.util.Scanner;

public class Ejercicio07{
    public static void main (String[] args){
        Scanner medida = new Scanner(System.in);

        System.out.print("Ingrese un numero impar: ");
        int measure = medida.nextInt();

        if(measure % 2 == 0){
            System.out.println("El numero ingresado es PAR, se necesita un numero IMPAR");
            System.out.print("Ingrese un numero nuevamente: ");
            measure = medida.nextInt();
        }

        String symbol = "x";
        String space = "   ";
        int mitad= (measure - 1)/2;
        
        
        for (int i = 1 ; i < mitad; i++){
            
            space = space + "  ";

        }

        System.out.println(space + "x");

        for(int t = 1; t < mitad; t++){
            
            space = space.substring(2);
            System.out.println(space + symbol + " x " + "x ");
            symbol = "x " + symbol + " x";
        }

        System.out.println(" x " + symbol + " x");
        space = "   ";
        System.out.println(space + symbol);
        
        for(int d = 1; d < mitad; d++){
            
            space = space + "  ";
            symbol = symbol.substring(4);
            System.out.println(space + symbol);            

        }
    }
}