public class Ejercicio10{
    public static void main(String [] args){

        int numerosRandom [] = new int [10];
                
        for(int i = 0; i < numerosRandom.length; i++){

            int aleatorio = (int) (Math.random() * 100);
            numerosRandom[i] = aleatorio;
        }

        printArray(numerosRandom);
        System.out.print( "El promedio del array es de: " + promedio(numerosRandom));
                
       
    }


    public static double promedio( int [] array){
        
        double promedio = 0;
        for(int i=0; i < array.length; i++){
            promedio = promedio + array[i];
        }
        promedio = promedio / array.length;

        return promedio;
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
        System.out.println(" }");
    }
}