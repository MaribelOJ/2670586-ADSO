import java.util.Scanner;

public class Ejercicio08{
    public static void main (String[] args){
        Scanner numero = new Scanner(System.in);

        System.out.print("Ingrese un numero entero: ");
        int num = numero.nextInt();
        int colsP, colsN, cont = 0;
        int x = 2;
        int n = x;
        String dash = " ___ ";
        String lines = "|___|";
        String nums = " 1 ";        

        for(int r = 1; r < num; r++){
            dash = dash + "___ ";
            lines = lines + "___|";
        }
        System.out.println(dash);

        if(num % 2 == 0){
            colsP =  num/2;
            colsN= colsP;              
        }else{
            colsP = ((num - 1)/2) + 1;
            colsN = colsP - 1;
        }
        int columnsP = colsP;
        int columnsN = colsN;
        int cantP = num * colsP;
        int cantN = num * colsN;
        int totalI2 = cantN * 3;
   
        cantN = cantN - 1;
        while(cantN > 0){
            for(int i = 1; i <= n; i++){

                if(n % i == 0){
                    cont=cont + 1;
                }   
            }

            if(cont >= 3){
                cantN = cantN - 1;
                if(n <= 9){
                    nums = nums + " " + n + " ";
                }else if(n <= 99){
                    nums = nums + " " + n ; 
                }else{
                    nums = nums + n;
                }                   
   
            }
            n = n + 1;
            cont = 0;
        }

        while (cantP > 0){
            
            for(int i = 1; i <= x; i++){

                if(x % i == 0){
                    cont=cont + 1;
                }   
            }
                
            if(cont == 2 && columnsP == 1){
                cantP = cantP - 1; 
                columnsP = columnsP - 1;          

                if(num % 2 != 0){
                    cont = 0;
                    if(x <= 9){
                        System.out.println("| " + x + " |");
                        System.out.println(lines);
                    }else if(x <= 99){
                        System.out.println("| " + x + "|");
                        System.out.println(lines);
                    }else{
                        System.out.println("|" + x + "|");
                        System.out.println(lines);
                    }
                }else{
                    if(x <= 9){
                        System.out.println("| " + x + " |" + nums.substring(totalI2 - 3, totalI2) + "|");
                        System.out.println(lines);
                    }else if(x <= 99){
                        System.out.println("| " + x + "|" + nums.substring(totalI2 - 3, totalI2) + "|");
                        System.out.println(lines);
                    }else{
                        System.out.println("|" + x + "|" + nums.substring(totalI2 - 3, totalI2) + "|");
                        System.out.println(lines);
                    }
                }
            }

            if(cont == 2 && columnsP >= 1){
                cantP = cantP - 1;
                columnsP = columnsP - 1;

                if(x <= 9){
                    System.out.print("| " + x + " |" + nums.substring(totalI2 - 3, totalI2));    
                }else if (x <= 99){ 
                    System.out.print("| " + x + "|" + nums.substring(totalI2 - 3, totalI2));    
                }else{
                    System.out.print("|" + x + "|" + nums.substring(totalI2 - 3, totalI2));    
                }
            }

            if (totalI2 > 3 && cont == 2){
                totalI2 = totalI2 - 3; 
                nums = nums.substring(0, totalI2);
            }

            if( columnsP == 0){
                columnsP = colsP;
            }            

            cont = 0;
            x= x + 1;
            
        }
    }
}