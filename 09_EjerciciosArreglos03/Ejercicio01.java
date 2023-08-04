import java.util.Scanner;

public class Ejercicio01{
    public static void main(String[]args){
       Scanner dato = new Scanner(System.in);
       
       System.out.print("Ingrese el tamano del arreglo: ");
       int size = dato.nextInt();
       String info = "";

       String arr2 [] = new String[size];

       

       for(int i = 0; i < size;i++){

           System.out.print(" Ingrese un texto: ");
           info = dato.next();
           arr2[i] = info;    
       }

       System.out.print("Arreglo: { ");

       for(int i = 0 ; i < size; i++){
            if(i== size-1){
               System.out.print(arr2[i]);
            }else{
               System.out.print(arr2[i] + ", ");
            }
       }

       System.out.println(" }");
    }
}