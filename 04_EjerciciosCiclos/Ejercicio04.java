import java.util.Scanner;
public class Ejercicio04{
    public static void main(String[] args){

        Scanner num = new Scanner(System.in);
        int opc;

        do{
            System.out.println(" ");
            System.out.println("Ingrese una opcion del diguiente menu");
            System.out.println(" ");
            System.out.println("|-------------BIENVENIDO------------|");
            System.out.println("|  1. Estudiante                    |");
            System.out.println("|  2. Salir                         |");
            System.out.println("|  3. Docente                       |");
            System.out.println("|-----------------------------------|");
            System.out.print("    Opcion => ");
            opc = num.nextInt();

            if(opc == 1){

                System.out.print("Ingrese la cantidad de notas obtenidas en la materia: ");
                int cant = num.nextInt();
                float suma = 0;

                for(int i = 1; i <= cant; i++){
                    System.out.print("Ingrese la nota " + i + " : ");
                    float nota = num.nextFloat();
                    suma = suma + nota;
                }

                float promedio = suma / cant;
                System.out.println("El promedio de la materia es: " + promedio);


            }else if (opc == 2){
                System.out.print("Ingrese la cantidad de notas obtenidas en la materia: ");
                int cant = num.nextInt();
                float sumaN = 0;
                float sumaC = 0;


                for(int i = 1; i <= cant; i++){
                    System.out.print("Ingrese la nota " + i + " : ");
                    float nota = num.nextFloat();
                    System.out.print("Ingrese los creditos de la materia "+ i + " : ");
                    float creditos = num.nextFloat();
                    sumaN = sumaN + (nota * creditos);
                    sumaC = sumaC +creditos;
                }

                float promedio = sumaN / sumaC;
                System.out.println("El promedio de la materia es: " + promedio);

            }else if (opc != 3){
                System.out.println("Ingrese una opcion valida!!!");
            }
        }while(opc != 3);
    }
}