public class Ejercicio03{
    public static void main(String [] args){

        int a = (int) (Math.random()*100 )+ 1;
        int b = (int) (Math.random()*100 )+ 1;

        System.out.println("la multiplicacion entre "+ a +" y "+ b + " da " + multiplicar(a,b));
    }

    public static int multiplicar (int a, int b){

        int resultado = (a * b); 
        return resultado;
             
    }
}