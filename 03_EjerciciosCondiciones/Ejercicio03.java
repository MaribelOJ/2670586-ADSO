import java.util.Scanner;

public class Ejercicio03{
    public static void main(String[] args){
        Scanner numero = new Scanner(System.in);

        System.out.print("Ingrese valor de x: ");
        int x = numero.nextInt();

        System.out.print("Ingrese valor de y: ");
        int y = numero.nextInt();

        if (x < 0 && y < 0){
            System.out.println("La coordenada ingresada se encuentra en el tercer cuadrante");
        }else{
            if (x > 0 && y < 0 ){
                System.out.println("La coordenada ingresada se encuentra en el cuarto cuadrante");
            }else{
                if (x > 0 && y > 0 ){

                    System.out.println("La coordenada ingresada se encuentra en el primer cuadrante");
                }else{
                    if (x < 0 && y > 0){
                        System.out.println("La coordenada ingresada se encuentra en el segundo cuadrante");
                    }else{
                        System.out.println("La coordenada ingresada se encuentra en el origen");
                    }
                }
            }
        }
    }
}