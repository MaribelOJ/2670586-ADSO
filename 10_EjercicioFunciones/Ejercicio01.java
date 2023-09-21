public class Ejercicio01{
    public static void main(String [] args){

        int a = (int) (Math.random()*100 )+ 1;
        int b = (int) (Math.random()*100 )+ 1;

        System.out.println("la suma entre "+ a +" y "+ b + " da " + sumar(a,b));
    }

    public static int sumar (int a, int b){

        int resultado = (a + b); 
        return resultado;
             
    }
}