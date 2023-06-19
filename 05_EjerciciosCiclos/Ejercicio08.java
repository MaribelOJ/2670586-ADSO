import java.util.Scanner;
public class Ejercicio08{
    public static void main(String[] args){

        Scanner numero = new Scanner(System.in);

        System.out.print("Ingrese un numero de maximo 6 digitos: ");
        int num = numero.nextInt();


        int cont = 0;
        int resultado = num;
        int dig;
        int cant= 1;

        if(num < 10){
            System.out.println("El unico digito es: " +  num);
        } else{
            while(resultado >= 10){
                resultado = resultado / 10;
                cont = cont + 1; 
            }

            cont = cont + 1;

            while(cont > 0){

                dig = num % (int) Math.pow(10,cont) / (int) Math.pow(10,cont-1);
                System.out.println("El digito 0"+ cant + " es: " + dig);
                cant= cant + 1;
                cont = cont-1;

            }            
        }
    }
}