import java.util.Scanner;
public class Ejercicio06{
    public static void main(String[]args){

        Scanner edad = new Scanner(System.in);

        System.out.print("ingrese su edad: ");
        int age = edad.nextInt();

        if (age <= 0 || age > 120){
            System.out.print("ingrese una edad valida: ");
            age = edad.nextInt();
        }

        if (age >= 18 && age < 120){
            System.out.print("La persona con esta edad si puede votar");
        }else{
            System.out.print("La persona con esta edad no puede votar");
        }

    }
}