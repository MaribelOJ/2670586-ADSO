import java.util.Scanner;

public class Principal{
    public static void main(String[] args){
        Scanner entradaInt = new Scanner(System.in);
        Scanner entradaStr = new Scanner(System.in);
        int cont = 100;

        Curso courses [] = new Curso[100];
        
        while(cont > 0){
            System.out.println("+----------------------------------------+");
            System.out.println("|            MENU DE CURSOS              |");
            System.out.println("+----------------------------------------+");
            System.out.println("|                        Memoria: "+ cont +   "    |");
            System.out.println("|  1. Crear curso.                       |");
            System.out.println("|  2. Listar todos los cursos.           |");
            System.out.println("|  3. Ver detalle de un curso.           |");
            System.out.println("|  4. Editar informacion de un curso.    |");
            System.out.println("|  5. Agregar tema a curso.              |");
            System.out.println("|  6. Eliminar curso.                    |");
            System.out.println("|  7. Salir.                             |");
            System.out.println("+----------------------------------------+");

            System.out.println("Ingrese la opcion de lo que desea hacer: ");
            int option = entradaInt.nextInt();
            

            if(option == 1){
                System.out.println("Codigo: ");
                int code = entradaInt.nextInt();


                for(int i = 0; i < courses.length; i++){
                    if(courses[i] != null){
                        if(courses[i].getCodigo() == code){
                            System.out.println("ERROR: El codigo ingresado ya esta asignado");
  
                            break;
                        }
                    }else{
                        System.out.println("Nombre Materia: ");
                        String name = entradaStr.nextLine();

                        System.out.println("Area: ");
                        String field = entradaStr.nextLine();

                        System.out.println("Duracion Horas: ");
                        int time = entradaInt.nextInt();
                        cont--;

                        courses[i] = new Curso(code, name, field, time);

                        System.out.println("Cuantos temas se veran: ");
                        int cant = entradaInt.nextInt();

                        for(int j=0; j < cant; j++){

                            System.out.println("Tema "+ (j+1) + " :");
                            String tema = entradaStr.nextLine();

                            courses[i].agregarTema(tema);     
                        }

                        break;

                    }
                }
                  
            }else if(option == 2){
                System.out.println("Codigo   -   Nombre   -   Duracion");
                for(int i = 0; i < courses.length; i++){
                    if(courses[i] != null){
                        System.out.println(" "+courses[i].getCodigo() + "    -   "+courses[i].getNombre() + "   -   "+courses[i].getDuracion());
                    }else if(i == 0){
                        System.out.println("No se encontraron cursos registrados");
                        break;
                    }
                }
            }else if(option == 3){
                System.out.println("Codigo curso: ");
                int code = entradaInt.nextInt();
                boolean validCode = false;

                for(int i = 0; i < courses.length; i++){
                    if(courses[i] != null){
                        if(courses[i].getCodigo() == code){
                            courses[i].imprimirDetalleCurso();
                            validCode = true;
                            break;
                        }
                    }
                }

                if(validCode == false){
                    System.out.println("El codigo ingresado no se encuentra asignado a ningun curso");
                }
            }else if(option == 4){
                System.out.println("Codigo curso: ");
                int code = entradaInt.nextInt();
                boolean validCode = false;

                for(int i = 0; i < courses.length; i++){
                    if(courses[i] != null){
                        if(courses[i].getCodigo() == code){
                            System.out.println("Nombre Materia: ");
                            String name = entradaStr.nextLine();

                            System.out.println("Area: ");
                            String field = entradaStr.nextLine();

                            System.out.println("Duracion Horas: ");
                            int time = entradaInt.nextInt();

                            courses[i].editarInformacionCurso(name,field,time);
                            validCode = true;
                            break;
                        }
                    }
                }
                if(validCode == false){
                    System.out.println("El codigo ingresado no se encuentra asignado a ningun curso");
                }

            }else if(option == 5){
                System.out.println("Codigo curso: ");
                int code = entradaInt.nextInt();
                boolean validCode = false;

                for(int i = 0; i < courses.length; i++){
                    if(courses[i] != null){
                        if(courses[i].getCodigo() == code){
                            System.out.println("Tema: ");
                            String topic = entradaStr.nextLine();

                            courses[i].agregarTema(topic);
                            validCode = true;
                            break;
                        }
                    }
                }

                if(validCode == false){
                    System.out.println("El codigo ingresado no se encuentra asignado a ningun curso");
                }

            }else if(option == 6){
                System.out.println("Codigo curso: ");
                int code = entradaInt.nextInt();
                boolean validCode = false;

                for(int i = 0; i < courses.length; i++){
                    if(courses[i] != null){
                        if(courses[i].getCodigo() == code){
                            if(i != 99){
                                courses[i] = courses[i+1];
                                validCode = true;
                            }else{
                                courses[i] = null;
                            }         
                        }else if(validCode == true){
                            courses[i] = courses[i+1];
                        }
                    }
                }

                if(validCode == false){
                    System.out.println("El codigo ingresado no se encuentra asignado a ningun curso");
                }else{
                    cont++;
                }
            }else if(option == 7){
                cont = 0;
            }else{
                System.out.println("La opcion ingresada no se encuentra en la lista");
            }
        }
    }
}