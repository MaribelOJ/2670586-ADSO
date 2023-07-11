import java.util.Scanner;

public class Ejercicio09{
    public static void main(String[] args){
        Scanner numero = new Scanner(System.in);

        System.out.print("Ingrese un numero entero para hayar la raiz diital de maximo 6 digitos: ");
        int num = numero.nextInt();
        int copia = num;
        int cont = 0;
        int suma = 0;
    
        if(num/10 < 1){
            System.out.print("Ingrese un numero que no empiece en 0: ");
            num = numero.nextInt();
        }

        while(copia > 9){
            copia = copia/10;
            cont = cont + 1;
        }

        copia = num;
        int expo = cont;
        System.out.println(" Raiz Digital: ");

        while(num > 9){

            for(int i = 0; i <= cont; i++){
                int digs = num % (int) Math.pow(10,expo + 1) / (int) Math.pow(10,expo);
                expo = expo - 1;
                suma = suma + digs;
                
                if (i != cont){
                    System.out.print(digs + " + ");
                }else{
                    System.out.print(digs);
                }
            }

            System.out.println(" = " + suma);
            num = suma;
            cont = 0; 

            while (suma > 9){
                suma = suma/10;
                cont = cont + 1;

                if(suma < 9){
                    suma = 0;
                }
            }
            expo = cont;
        }

        System.out.print("la Raiz Digital de " + copia +" es: " + suma);

    }
}