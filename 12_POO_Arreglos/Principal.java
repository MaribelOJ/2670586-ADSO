import java.util.Scanner;

public class Principal{
    public static void main(String [] args){
      

        Scanner entrada = new Scanner(System.in);
        Scanner input = new Scanner(System.in);

        Perro ArrPerro [] = new Perro[15];

        // ArrPerro[0] = new Perro("Toby", "Maribel", 108, "pomerania", 3.50, 60);
        // ArrPerro[1] = new Perro("Mini", "Valeria", 90, "chihuahua", 2.50, 100);
        // ArrPerro[2] = new Perro("Kiki", "Karen", 100, "Dalmata", 20.5, 80);
        // ArrPerro[3] = new Perro("Cupcake", "Luisa", 120, "Corgi", 10.5, 50);
        // ArrPerro[4] = new Perro("Candy", "Laura", 50, "Beagle", 9.0, 50);

        // System.out.println("Nombre Mascota: ");
        // String name = entrada.nextLine();

        // System.out.println("Nombre Proprietario: ");
        // String owner = entrada.nextLine();

        // System.out.println("Edad Mascota: ");
        // int age = input.nextInt();

        // System.out.println("Raza Mascota: ");
        // String breed = entrada.nextLine();

        // System.out.println("Peso Mascota: ");
        // double weight = input.nextDouble();

        // System.out.println("Energia Mascota: ");
        // int energy = input.nextInt();

        // ArrPerro[5] = new Perro(name, owner, age, breed, weight, energy);


        // for(int i = 0; i < ArrPerro.length; i++){

        //     if(ArrPerro[i] != null){
        //         ArrPerro[i].imprimirDetalle();
        //     }
            
        // }

        Perro masPesado = ArrPerro[0];

        for(int i = 1; i < ArrPerro.length; i++){
          if(ArrPerro[i] != null){
            if(ArrPerro[i].getPeso() >= masPesado.getPeso()){
                masPesado = ArrPerro[i];
            }
          }   
        }

        if(masPesado != null){
            masPesado.imprimirDetalle();
        }else{
            System.out.println("No hay ningun perro registrado");
        }
       
        //Arreglo de perros
        //ciclos imprimiendo arreglo[i]
    }
}