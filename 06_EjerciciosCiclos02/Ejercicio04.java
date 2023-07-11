import java.util.Scanner;

public class Ejercicio04{
    public static void main(String[] args){
        Scanner numero= new Scanner(System.in);

        System.out.print("Ingrese un numero de entre 3 y 6 digitos: ");
        int num = numero.nextInt();
        int cont = 0;
        int x = 1;
        int num1 = num;
        int dig1 =0, dig2 = 0, dig3 = 0, dig4 = 0, penultimo = 0, ultimo = 0;
        
        if (num < 100){
            System.out.print("Ingrese un numero mayor a 3 digitos y menor o igual a 6 digitos: ");
            num = numero.nextInt();
        }else{
            while (num > 9 ){
                num = num / 10;
                x = x + 1;
            }
        }
        int r = x;
        int n = x;
                
        while( cont < r){
            int dig = num1 % (int) Math.pow(10,x)/ (int) Math.pow(10, n-1);
                    
            x = x - 1;
            n = n - 1;
        
            if (cont == 0){
                dig1 = dig;
                System.out.println(" dig1 = " + dig1);
                                      
            }
                
            if (cont == 1){
                dig2 = dig;
                System.out.println(" dig2 = " + dig2);
                                      
            }
            if (cont == 2){
                dig3 = dig;
                System.out.println(" dig3 = " + dig3);                       
            }
            if (cont == 3){
                dig4 = dig;
                System.out.println(" dig4 = " + dig4);                       
            }
            if(cont == 4){
                penultimo = dig;
                System.out.println(" penu = " + penultimo);                       
            } 

            if(cont == r-2){

                ultimo = num1 % 10;

                System.out.println(" ultimo = " + ultimo);  

                if (r == 6){
                    if(dig1 == ultimo && dig2 == penultimo && dig3 == dig4){
                        System.out.println("El numero SI es PALINDROMO ");
                    }else{
                        System.out.println("El numero NO es PALINDROMO ");
                    }
                }else if(r == 5){
                    if(dig1 == ultimo && dig2 == dig4){
                        System.out.println("El numero SI es PALINDROMO ");
                    }else{
                        System.out.println("El numero NO es PALINDROMO ");
                    }
                }else if(r == 4){
                    if(dig1 == ultimo && dig2 == dig3){
                        System.out.println("El numero SI es PALINDROMO ");
                    }else{
                        System.out.println("El numero NO es PALINDROMO ");
                    }
                }else if(r == 3){
                    if(dig1 == ultimo){
                        System.out.println("El numero SI es PALINDROMO ");
                    }else{
                        System.out.println("El numero NO es PALINDROMO ");
                    }
                }

                cont = cont + 1;    
            }                 
      
            cont = cont + 1;
        }                
    }
}