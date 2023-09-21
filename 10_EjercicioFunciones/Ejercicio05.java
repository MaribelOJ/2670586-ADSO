public class Ejercicio05{
    public static void main(String [] args){

        int a = (int) (Math.random()*10)+ 1;
        int b = (int) (Math.random()*10)+ 1;

        System.out.println("la potenciacion de "+ a +" por "+ b + " da " + potenciar(a,b));
    }

    public static int potenciar (int a, int b){

        int resultado = (int) Math.pow(a,b); 
        return resultado;
             
    }
}