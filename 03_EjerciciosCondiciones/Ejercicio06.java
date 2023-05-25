import java.util.Scanner;
public class Ejercicio06{
    public static void main (String[] args){
        Scanner numero = new Scanner(System.in);
        
        System.out.print("Ingrese un numero de 6 digitos: ");
        int num = numero.nextInt();

        if (num<100000 || num > 999999){
            System.out.print("El numero no es de 6 digitos, Ingrese un numero que tenga seis digitos: ");
            num = numero.nextInt();
        }

        System.out.println(" ");
        System.out.println("Menu de opciones");
        System.out.println("_________________");
        System.out.println(" ");
        System.out.println(" Escoja el digito que desea imprimir, tenga en cuenta que el orden es de atras hacia delante: ");
        System.out.println(" ");
        System.out.println(" 1. Primer Digito");
        System.out.println(" 2. Segundo Digito");
        System.out.println(" 3. Tercer Digito");
        System.out.println(" 4. Cuarto Digito");
        System.out.println(" 5. Quinto Digito");
        System.out.println(" 6. Sexto Digito");

        int opc = numero.nextInt();

        if (opc == 1){
            int digito = (num % 10);
            System.out.println("El primer digito es: " + digito);
        }else{
            if (opc == 2){
                int digito = (num % 100)/10;
                System.out.println("El segundo digito es: " + digito);
            }else{
                if (opc == 3){
                    int digito = (num % 1000)/100;
                    System.out.println("El tercer digito es: " + digito);
                }else{
                    if (opc == 4){
                        int digito = (num % 10000)/1000;
                        System.out.println("El cuarto digito es: " + digito);
                    }else{
                        if (opc == 5){
                            int digito = (num % 100000)/10000;
                            System.out.println("El quinto digito es: " + digito);
                        }else{
                            if (opc == 6){
                                int digito = (num % 1000000)/100000;
                                System.out.println("El sexto digito es: " + digito);
                            }else{
                                System.out.println("Ingrese una opcion valida!");
                            }
                        }
                    }
                }

            }
        }

    }
}