public class Ejercicio02{
    public static void main(String [] args){

        int a = (int) (Math.random()*100 )+ 1;
        int b = (int) (Math.random()*100 )+ 1;

        System.out.println("la resta entre "+ a +" y "+ b + " da " + restar(a,b));
    }

    public static int restar (int a, int b){

        int resultado = (a - b); 
        return resultado;
             
    }
}