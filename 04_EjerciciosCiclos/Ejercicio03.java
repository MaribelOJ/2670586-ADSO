import java.util.Scanner;
public class Ejercicio03{
    public static void main(String[] args){

        Scanner altura = new Scanner(System.in);

        System.out.print("Ingrese la altura de la piramide: ");
        int height = altura.nextInt();
        String x = " x ";
        String spc = "   ";
        int i = 2;
        if (height == 1){
            System.out.println(x);
        }else if (height == 2){
            System.out.println(spc + x);
            System.out.println(x + x + x);
        }else{
            while(i<height){
                spc = spc + "   ";    
                i = i + 1;             
            }

            System.out.println(spc + x);
            int indiceSPC = ((height-1) * 3) - 1;

            for(int a = 1; a < height-1; a++){
                                
                spc = spc.substring(2, indiceSPC);
                System.out.println(spc +" x " + x + " x ");
                x = x + " x " + " x ";
                indiceSPC = indiceSPC-3;
                
            }

            System.out.println(" x " + x + " x ");
        }
    }
}