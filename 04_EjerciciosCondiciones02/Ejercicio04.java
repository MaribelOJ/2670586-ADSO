import java.util.Scanner;
public class Ejercicio04{
    public static void main(String[]args){

        Scanner notas = new Scanner(System.in);

        System.out.print("ingrese la primera nota: ");
        float nota1 = notas.nextFloat();

        System.out.print("ingrese la segunda nota: ");
        float nota2 = notas.nextFloat();

        System.out.print("ingrese la tercera nota: ");
        float nota3 = notas.nextFloat();

        float promedio = (nota1 + nota2 + nota3) / 3;

        if (promedio >= 7){
            System.out.print("La materia fue aprobada");
        }else{
            System.out.print("La materia fue reprobada");
        }

    }
}