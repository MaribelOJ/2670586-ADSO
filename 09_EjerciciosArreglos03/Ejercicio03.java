import java.util.Scanner;

public class Ejercicio03{
    public static void main(String[] args){
        int memoria = 100;
        int num =0;
        String nombre;
        int indice = 0;
        int spot = -1;
        

        String arr [] = new String[memoria];

        Scanner opc = new Scanner(System.in);
        Scanner opt = new Scanner(System.in);

        while(num != 5){


            System.out.println("                                  Memoria Disponible: " + memoria + " Registros");
            System.out.println("1: Registrar Cliente");
            System.out.println("2: Ver Lista de Clientes");
            System.out.println("3: Editar Cliente");
            System.out.println("4: Eliminar Cliente");
            System.out.println("5: salir");

            System.out.print(" Ingrese una opcion: ");
            num = opc.nextInt();
                
            
            if(num == 1){
                System.out.print(" Ingrese su nombre completo: ");
                nombre = opt.nextLine();


                if(indice > 0 && indice < 100){
                    boolean invalido = false;

                    for(int p = 0; p < indice; p++){
                        if(arr[p].equalsIgnoreCase(nombre)){
                            System.out.print(" Ya se encuentra registrado, intente con otro nombre");
                            invalido=true;
                            
                        }
                    }

                    if(invalido == false){
                        arr[indice] = nombre;
                        indice = indice + 1;
                        memoria = memoria - 1;
                    }

                }else{
                    arr[indice] = nombre;
                    indice = indice + 1;
                    memoria = memoria - 1;
                }
    
            }else if(num == 2){
                System.out.print(" List Clientes: {");

                for(int e = 0; e < memoria; e++){
                    if(e == 0){
                        System.out.print(arr[e]);
                    }else{
                        System.out.print(", " + arr[e]);
                    }
                }

                 System.out.println(" }");

    
            }else if(num == 3){

                System.out.print("Ingrese el nombre que desea ubicar: ");
                nombre = opc.next();
                
                for( int l = 0; l< indice; l++){
                        if(arr[l].equalsIgnoreCase(nombre)){
                            spot = l;
                        }
                }

                System.out.print("Ingrese el nuevo nombre: ");
                nombre = opc.next();
                arr[spot] = nombre;
    
            }else if(num == 4){
                System.out.print("Ingrese el nombre que desea eliminar: ");
                nombre = opc.next();
                for( int l = 0; l< indice; l++){
                        if(arr[l].equalsIgnoreCase(nombre)){
                            spot = l;
                        }
                }

                for(int p = spot; p < indice; p++){

                    if(p != memoria - 1){
                        arr[p] = arr[p + 1];
                    }else{
                        arr[p] = "";
                    }
                    

                }
                memoria = memoria + 1;

                System.out.print(" Lista Clientes: {");

                for(int e = 0; e < indice; e++){
                    if(e == 0){
                        System.out.print(arr[e]);
                    }else{
                        System.out.print(", " + arr[e]);
                    }
                }

                System.out.println(" }");
    
            }     
        }      
    }    
}