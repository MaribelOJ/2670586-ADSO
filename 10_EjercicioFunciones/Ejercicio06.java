public class Ejercicio06{
    public static void main(String [] args){

        int a = (int) (Math.random()*10)+ 1;
        int b = (int) (Math.random()*10)+ 1;
        int c = (int) (Math.random()*10)+ 1;

        if(a == b && a == c){
            System.out.println("los numeros son iguales");
        }else{
            System.out.println("El valor maximo entre "+ a +", "+ b + ", "+ c + " es: " + obtenerMayor(a,b,c));
        }

        
    }

    public static int obtenerMayor (int a, int b, int c){

        if(a > b && a > c){
            return a;
        }else if( b > a && a > c){
            return b;
        }else{
            return c;
        }
    }
}