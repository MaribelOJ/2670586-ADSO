import java.util.Scanner;

public class Ejercicio02{
    public static void main(String[]args){
       Scanner dato = new Scanner(System.in);
       Scanner dato2 = new Scanner(System.in);
       
       System.out.print("Ingrese el tamano del arreglo: ");
       int size = dato.nextInt();
       String info = "";

       String arr2 [] = new String[size];

       

       for(int i = 0; i < size;i++){

           System.out.print(" Ingrese un nombre: ");
           info = dato2.nextLine();
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

       System.out.print("Ingrese el nombre que desea ubicar: ");
       String nombre = dato2.nextLine();
       int p = -1;

       for( int i = 0; i< size; i++){
            if(arr2[i].equalsIgnoreCase(nombre)){
                p = i;
            }
       }

       if(p == -1){
        
            System.out.print("El nombre no se encuentra en el arreglo, vuelva a ingresarlo");        
       }else{
            System.out.print("El indice del nombre es " + p);
       }
       
    }
}