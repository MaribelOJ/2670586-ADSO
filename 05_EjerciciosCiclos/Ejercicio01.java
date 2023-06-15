import java.util.Scanner;
public class Ejercicio01{
    public static void main(String[] args){

        Scanner notas = new Scanner(System.in);

        System.out.print("Ingrese la cantidad de notas obtenidas en la materia: ");
        int cant = notas.nextInt();
        float suma = 0;

        for(int i = 1; i <= cant; i++){
            System.out.print("Ingrese la nota " + i + " : ");
            float nota = notas.nextFloat();
            suma = suma + nota;
        }

        float promedio = suma / cant;
        System.out.print("El promedio de la materia es: " + promedio);

    }
}