public class Ejercicio02{
    public static void main(String[] args){
        
        String wholenum = "";

        for(int i = 1; i <= 8; i++){

            int numeros = (int) ( Math.random() * 9);
            wholenum = wholenum + numeros;
        }       

        System.out.println("La fecha generada es: " + wholenum);
    }
}