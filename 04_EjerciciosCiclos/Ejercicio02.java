import java.util.Scanner;
public class Ejercicio02{
    public static void main(String[] args){

        Scanner notas = new Scanner(System.in);

        System.out.print("Ingrese la cantidad de notas obtenidas en la materia: ");
        int cant = notas.nextInt();
        float sumaN = 0;
        float sumaC = 0;


        for(int i = 1; i <= cant; i++){
            System.out.print("Ingrese la nota " + i + " : ");
            float nota = notas.nextFloat();
            System.out.print("Ingrese los creditos de la materia "+ i + " : ");
            float creditos = notas.nextFloat();
            sumaN = sumaN + (nota * creditos);
            sumaC = sumaC +creditos;
        }

        float promedio = sumaN / sumaC;
        System.out.print("El promedio de la materia es: " + promedio);

    }
}