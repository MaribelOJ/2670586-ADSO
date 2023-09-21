
public class Ejercicio07{
    public static void main(String [] args){

        int numerosRandom [] = new int [10];
        numerosRandom = fillArray(numerosRandom);

        System.out.print("Array Aleatorio = { ");
        for(int i=0; i < numerosRandom.length; i++){
            if(i == 0){
                System.out.print(numerosRandom[i]);
            }else{
                System.out.print(", " +numerosRandom[i]);
            }
            
        }
        System.out.print(" }");
                
       
    }

    public static int [] fillArray( int [] array){

        for(int i = 0; i < array.length; i++){

            int aleatorio = (int) (Math.random() * 100);
            array[i] = aleatorio;
        }

        return array;
    }
}