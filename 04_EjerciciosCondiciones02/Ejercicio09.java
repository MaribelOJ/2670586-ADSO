import java.util.Scanner;
public class Ejercicio09{
    public static void main(String[]args){

        Scanner datos = new Scanner(System.in);
        
        int extras;
        double salario, pagoExtras;
        System.out.print("Ingrese la cantidad de horas trabajadas en la semana: ");
        int horas = datos.nextInt();

        System.out.print("Ingrese la tarifa por hora: ");
        int tarifa = datos.nextInt();        

        if (horas <= 40){
            
            salario = horas * tarifa;
            System.out.print("salario semanal= " + salario);
        }else{
            extras = horas - 40;
            salario = 40 * tarifa;
            pagoExtras = extras * (tarifa + (tarifa * 0.50));
            salario = salario + pagoExtras;
            System.out.print("salario semanal= " + salario);
        }

    }
}