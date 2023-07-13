import java.util.Scanner;

public class Ejercicio03{
    public static void main(String[] args){
        Scanner cantidad= new Scanner(System.in);

        System.out.print("Ingrese un numero entero: ");
        int num = cantidad.nextInt();
        int cont = 0;
        int cant = 0;
        int x = 0;
        String numbers = "";
        long conver;
        long resto = 0;



     

        for(int r=1; r < 2  ;r++){

            long pri = (int) ( Math.random()*1000);

            numbers= numbers + pri;
        

            conver = Long.parseLong(numbers);
            cant = 0;
        
            while(cant < num){
          
                if(conver >= 10000){
                    resto = conver % 100;
                    conver = conver/100;
                }else if(conver > 0 && conver <= 9999){ 
                    resto = conver / 10;
                    conver = conver / 10;
                }        
                        
                for( int i = 1; i <= resto; i++){
                    if(resto % i == 0){
                        cont = cont + 1;
                    }
                }

                if(cont<=2){
                    cant = 4;
                    System.out.println("Primo " + cant + " Generado -> " + resto);
                    x = x +1;
                }

                if (x == num){
                    break;

                }
            }	    
        }
    }
}