import java.util.Scanner;
public class Ejercicio07{
    public static void main(String[] args){

        Scanner numeros= new Scanner(System.in);

        System.out.print("Ingrese el primer numero entero: ");
        int num1 = numeros.nextInt();
        System.out.print("Ingrese el segundo numero entero: ");
        int num2 = numeros.nextInt();
        System.out.print("Ingrese el tercer numero entero: ");
        int num3 = numeros.nextInt();

        int mcm = 0;
        int pri = 2;
        int resultado1;
        int resultado2;
        int resultado3;
        int mult= 1;
        int cont = 0;
        
        while(mcm == 0){
            
            if(num1 %  pri == 0 || num2 %  pri == 0 || num3 %  pri == 0){
                do{
                    if(num1 %  pri == 0){
                        resultado1= num1/pri;
                        num1 = resultado1;
                    }
                    if(num2 %  pri == 0){
                        resultado2= num2/pri;
                        num2 = resultado2;
                    }
                    if(num3 %  pri == 0){
                        resultado3= num3/pri;
                        num3 = resultado3;
                    }

                    mult= mult * pri;
                }while(num1 %  pri == 0 || num2 %  pri == 0 || num3 %  pri == 0);

                pri = pri + 1;

                if(num1 == 1 & num2 == 1 & num3 == 1){
                    mcm = mult;
                    System.out.print("el MCM de esos numeros es: "+ mcm);
                }
            }else{
                pri = pri + 1;
            }

            for( int i = 1; i <= 100; i++){
			
                if(pri % i == 0){
                    cont = cont + 1;
                    if(cont>2){
                        pri = pri + 1;
                        cont = 0;
                        break;
                    } 
                }else{
                    pri = pri;
                }
            }
        }             

    }
}