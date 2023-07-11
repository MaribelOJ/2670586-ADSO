import java.util.Scanner;

public class Ejercicio10{
    public static void main(String [] args){

        Scanner numero = new Scanner(System.in);

        System.out.print("Ingrese un numero entero: ");
        int num = numero.nextInt();
        String digs ="";
        int cont = 0;
        int indices = (num * 2);

        for(int i = 1 ; i<= num; i++){

            digs = digs + " " + i;

        }
                
        while(cont < num){
            System.out.println(digs);
            
            digs = digs.substring(indices - 2 , indices) + digs.substring(0, indices - 2);
            
            cont = cont + 1;
        }

    }
}