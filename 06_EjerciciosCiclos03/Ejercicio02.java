import java.util.Scanner;

public class Ejercicio02{
    public static void main(String[] args){
        Scanner datos = new Scanner(System.in);

        System.out.print("Ingrese la cantidad total financiada: ");
        long capital = datos.nextLong();

        System.out.print("Ingrese la cantidad de cuotas pagadas: ");
        int cuotas = datos.nextInt();
        long cuotaI = 0, calculo, interesT = 0;

        for(int i = 1; i <= cuotas; i++){
            
            System.out.print(" ");
            System.out.print("Ingrese el valor de la cuota " + i + " : " );
            long valor = datos.nextLong();

            calculo = valor - capital;
            interesT = interesT + ((calculo * 100)/capital);
            capital = valor;
            
        }

        System.out.print("El total del interes pagado es de: " + interesT + "%");
    }
}