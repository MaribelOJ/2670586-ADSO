import java.util.Scanner;
public class Ejercicio10{
    public static void main(String[] args){

        Scanner numero = new Scanner(System.in);

        System.out.print("Ingrese un numero entero: ");
        int num = numero.nextInt();
        int pri = 2;
        int cant = 0;
        int cont = 0;
        int i=1;
        String ceros = "";
        int times = 0;
        int num2 = num;

        
        
        while(cant < num * num){
			
            if( pri % i == 0){
                cont = cont + 1;
                i = i + 1;
                if(cont>2){
                    pri = pri + 1;
                    i = 1;
                    cont = 0;
                }              
            }else{
                i = i + 1;

                if( pri < i){
                    cant = cant + 1;
                    if(pri <= 9){
                        while(times < num-1){
                            ceros = ceros +"0";
                            times=times + 1;
                        }

                        if(cant == num || cant == num2){
                            System.out.println("["+ ceros + pri + "]");
                            num2 = num2 + num;
                        }else{
                            System.out.print("["+ ceros + pri + "]"); 
                        }

                                               
                    }else if(pri > 9 && pri < 100){
                        
                        while(times < num-2){
                            ceros = ceros +"0";
                            times=times + 1;
                        }
                        if(cant == num || cant == num2){
                            System.out.println("["+ ceros + pri + "]");
                            num2 = num2 + num;
                        }else{
                            System.out.print("["+ ceros + pri + "]");
                        }
                        
                    }else if(pri >99 && pri < 1000){
                        
                        while(times < num-3){
                            ceros = ceros +"0";
                            times=times + 1;
                        }
                        if(cant == num || cant == num2){
                            System.out.println("["+ ceros + pri + "]");
                            num2 = num2 + num;
                        }else{
                            System.out.print("["+ ceros + pri + "]");
                        }
                        
                    }else if(pri >999 && pri < 10000){
                        
                        while(times < num-4){
                            ceros = ceros +"0";
                            times=times + 1;
                        }

                        if(cant == num || cant == num2){
                            System.out.println("["+ ceros + pri + "]");
                            num2 = num2 + num;
                        }else{
                            System.out.print("["+ ceros + pri + "]");
                        }                        
                        
                    }
                    
                    pri = pri + 1;
                    i = 1;
                    cont = 0;
                    ceros = "";
                    times = 0;
     

                }
           
            }

        
        }

        
    }
}