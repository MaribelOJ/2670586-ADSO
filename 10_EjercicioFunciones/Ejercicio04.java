public class Ejercicio04{
    public static void main(String [] args){

        int a = (int) (Math.random()*100 )+ 1;
        int b = (int) (Math.random()*100 )+ 1;

        if(a > b){

            System.out.println("la division entre "+ a +" y "+ b + " da " + dividir(a,b));
        }else{
            System.out.println("la division entre "+ b +" y "+ a + " da " + dividir(b,a));
        }
    }

    public static int dividir (int a, int b){

        int resultado = (a / b); 
        return resultado;
         
    }
}