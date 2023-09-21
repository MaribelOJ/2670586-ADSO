public class Ejercicio08{
    public static void main(String [] args){

        int numerosRandom [] = new int [10];
                
        for(int i = 0; i < numerosRandom.length; i++){

            int aleatorio = (int) (Math.random() * 100);
            numerosRandom[i] = aleatorio;
        }

        printArray(numerosRandom);
                
       
    }

    public static void printArray( int [] array){

        System.out.print("Array Aleatorio = { ");
        for(int i=0; i < array.length; i++){
            if(i == 0){
                System.out.print(array[i]);
            }else{
                System.out.print(", " +array[i]);
            }
            
        }
        System.out.print(" }");
    }
}