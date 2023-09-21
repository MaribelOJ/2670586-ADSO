public class Ejercicio09{
    public static void main(String [] args){

        int numerosRandom [] = new int [10];
                
        for(int i = 0; i < numerosRandom.length; i++){

            int aleatorio = (int) (Math.random() * 100);
            numerosRandom[i] = aleatorio;
        }

        printArray(numerosRandom);
        System.out.print( "El numero menor es: " + obtenerMenor(numerosRandom));
                
       
    }


    public static int obtenerMenor( int [] array){
        int menor = 101;

        for(int i = 0; i < array.length; i++){
            if(array[i] < menor){
                menor = array[i];
            }
        }

        return menor;

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