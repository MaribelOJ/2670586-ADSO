import java.util.Arrays;

public class Ejercicio13{
    public static void main(String [] args){

        int array [] = new int[10];

        System.out.print("Array desordenado: { ");

        for(int i = 0; i < array.length; i++){
            int newNum = (int) (Math.random() * 100);
            array[i] = newNum;
            if(i == 0){
                System.out.print(array[i]);
            }else{
                System.out.print(", " + array[i]);
            }            
        }
        System.out.println(" }");

        array = arraySorted(array);

        System.out.print("Array ascendente: { ");

        for(int j=0; j < array.length; j++){
            if(j == 0){
                System.out.print(array[j]);
            }else{
                System.out.print(", " + array[j]);
            } 

        }

        System.out.println(" }");
    }

    public static int [] arraySorted(int [] array){

        Arrays.sort(array);
        return array;
    }
}