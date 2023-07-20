import java.util.Scanner;

public class Ejercicio03{
    public static void main(String [] args){

        Scanner datos = new Scanner(System.in);

        System.out.print("Ingrese el valor total a financiar: ");
        int capital = datos.nextInt();

        System.out.print("Ingrese la tasa de interes: ");
        float interes = datos.nextInt();

        System.out.print("Ingrese la cantidad de cuotas: ");
        int cantidadC = datos.nextInt();

        int valorI, abono;
        String linea = "_______________________________________________________________________";
        interes = interes/100;
        int Vcuota = (int) (capital * interes/(1- Math.pow(1 + interes, -cantidadC)));
        int saldo = capital;
        System.out.println(Vcuota);

        for(int i = 0; i <= cantidadC; i++){

            System.out.println(linea);
            System.out.println(" ");
            if(i == 0){
                System.out.println("|   Cuota #   |     Pago    |Valor Interes|    Abono    | Deuda Total |");
                System.out.println(linea);
                System.out.println("       0                                                    " + capital );
            }else{
                       
                valorI = (int)(saldo * (1 + interes)) - saldo;
                abono = (int)Vcuota - valorI;
                saldo = saldo -abono;
                System.out.println("       " + i + "           " + Vcuota +"        " + valorI +"        " + abono + "        " + saldo );

            }

        }



    }
}