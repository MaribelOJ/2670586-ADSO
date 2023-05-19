import java.util.Scanner;

public class Ejercicio01{
    public static void main(String[] args){
        Scanner edad = new Scanner(System.in);

        System.out.println("Ingrese su edad: ");
        int anos = edad.nextInt();

        if (anos< 18){
            System.out.println("Recibe un auxilio de $800.000");
        }else{
            System.out.println("Recibe un auxilio de $200.000");
        }
    }
}