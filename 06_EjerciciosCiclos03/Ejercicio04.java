import java.util.Scanner;

public class Ejercicio04{
    public static void main (String [] args){

        Scanner info = new Scanner(System.in);

        System.out.print("Ingrese la cantidad de paradas que se haran: ");
        int paradas = info.nextInt();

        System.out.println("  ");
        System.out.println("Para ingresar la ruta, indique con el numero asignado a cada municipio");

        System.out.println("  ");
        System.out.println("1 - Apia            | 8 - Marsellla");
        System.out.println("2 - Balboa          | 9 - Mistrato");
        System.out.println("3 - Belen de Umbria | 10 - Pereira");
        System.out.println("4 - Dosquebradas    | 11 - Pueblo Rico");
        System.out.println("5 - Guatica         | 12 - Quinchia");
        System.out.println("6 - La celia        | 13 - Santa Rosa de cabal");
        System.out.println("7 - La Virginia     | 14 - Santuario");

        System.out.println("  ");
        System.out.print("Ingrese la ciudad de origen: ");
        int ciudadO = info.nextInt();

        
        double kilometros = 0; 
        int opt, codigo;
        

        for(int i = 1; i <= paradas; i++){
                       
            System.out.print("Ingrese la parada " + i + " : ");
            opt = info.nextInt();
            String ops = ""; 
            ops = ops + ciudadO + opt;
            codigo = Integer.parseInt(ops);

            if(ciudadO == opt){
                kilometros = kilometros + 5.0;
                ciudadO = opt;
            }else if(codigo == 12 || codigo == 21){
                ciudadO = opt;
                kilometros = kilometros + 39.8;
            }else if(codigo == 13 || codigo == 31){
                ciudadO = opt;
                kilometros = kilometros + 39.5;
            }else if(codigo == 14 || codigo == 41){
                ciudadO = opt;
                kilometros = kilometros + 68.9;
            }else if(codigo == 15 || codigo == 51){
                ciudadO = opt;
                kilometros = kilometros + 58.7;
            }else if(codigo == 16 || codigo == 61){
                ciudadO = opt;
                kilometros = kilometros + 24.1;
            }else if(codigo == 17 || codigo == 71){
                ciudadO = opt;
                kilometros = kilometros + 34.9;
            }else if(codigo == 18 || codigo == 81){
                ciudadO = opt;
                kilometros = kilometros + 88.1;
            }else if(codigo == 19 || codigo == 91){
                ciudadO = opt;
                kilometros = kilometros + 55.6;
            }else if(codigo == 110 || codigo == 101){
                ciudadO = opt;
                kilometros = kilometros + 65.7;
            }else if(codigo == 111){
                ciudadO = opt;
                kilometros = kilometros + 26.4;
            }else if(codigo == 112 || codigo == 121){
                ciudadO = opt;
                kilometros = kilometros + 77.4;
            }else if(codigo == 113 || codigo == 131){
                ciudadO = opt;
                kilometros = kilometros + 77.8;
            }else if(codigo == 114 || codigo == 141){
                ciudadO = opt;
                kilometros = kilometros + 15.3;
            }else if(codigo == 23 || codigo == 32){
                ciudadO = opt;
                kilometros = kilometros + 56.9;
            }else if(codigo == 24 || codigo == 42){
                ciudadO = opt;
                kilometros = kilometros + 52.9;
            }else if(codigo == 25 || codigo == 52){
                ciudadO = opt;
                kilometros = kilometros + 76.1;
            }else if(codigo == 26 || codigo == 62){
                ciudadO = opt;
                kilometros = kilometros + 13.7;
            }else if(codigo == 27 || codigo == 72){
                ciudadO = opt;
                kilometros = kilometros + 18.9;
            }else if(codigo == 28 || codigo == 82){
                ciudadO = opt;
                kilometros = kilometros + 72.1;
            }else if(codigo == 29 || codigo == 92){
                ciudadO = opt;
                kilometros = kilometros + 73.0;
            }else if(codigo == 210 || codigo == 102){
                ciudadO = opt;
                kilometros = kilometros + 49.7;
            }else if(codigo == 211 || codigo == 112){
                ciudadO = opt;
                kilometros = kilometros + 64.8;
            }else if(codigo == 212 || codigo == 122){
                ciudadO = opt;
                kilometros = kilometros + 94.8;
            }else if(codigo == 213 || codigo == 132){
                ciudadO = opt;
                kilometros = kilometros + 61.9;
            }else if(codigo == 214 || codigo == 142){
                ciudadO = opt;
                kilometros = kilometros + 38.3;
            }else if(codigo == 34 || codigo == 43){
                ciudadO = opt;
                kilometros = kilometros + 74.6;
            }else if(codigo == 35 || codigo == 53){
                ciudadO = opt;
                kilometros = kilometros + 25.1;
            }else if(codigo == 36 || codigo == 63){
                ciudadO = opt;
                kilometros = kilometros + 71.9;
            }else if(codigo == 37 || codigo == 73){
                ciudadO = opt;
                kilometros = kilometros + 40.8;
            }else if(codigo == 38 || codigo == 83){
                ciudadO = opt;
                kilometros = kilometros + 93.8;
            }else if(codigo == 39 || codigo == 93){
                ciudadO = opt;
                kilometros = kilometros + 16.3;
            }else if(codigo == 310 || codigo == 103){
                ciudadO = opt;
                kilometros = kilometros + 71.4;
            }else if(codigo == 311 || codigo == 113){
                ciudadO = opt;
                kilometros = kilometros + 65.4;
            }else if(codigo == 312 || codigo == 123){
                ciudadO = opt;
                kilometros = kilometros + 52.4;
            }else if(codigo == 313 || codigo == 133){
                ciudadO = opt;
                kilometros = kilometros + 83.6;
            }else if(codigo == 314 || codigo == 143){
                ciudadO = opt;
                kilometros = kilometros + 71.4;
            }else if(codigo == 45 || codigo == 54){
                ciudadO = opt;
                kilometros = kilometros + 92.3;
            }else if(codigo == 46 || codigo == 64){
                ciudadO = opt;
                kilometros = kilometros + 66.6;
            }else if(codigo == 47 || codigo == 74){
                ciudadO = opt;
                kilometros = kilometros + 32.5;
            }else if(codigo == 48 || codigo == 84){
                ciudadO = opt;
                kilometros = kilometros + 34.4;
            }else if(codigo == 49 || codigo == 94){
                ciudadO = opt;
                kilometros = kilometros + 89.3;
            }else if(codigo == 410 || codigo == 104){
                ciudadO = opt;
                kilometros = kilometros + 2.4;
            }else if(codigo == 411 || codigo == 114){
                ciudadO = opt;
                kilometros = kilometros + 92.5;
            }else if(codigo == 412 || codigo == 124){
                ciudadO = opt;
                kilometros = kilometros + 93.9;
            }else if(codigo == 413 || codigo == 134){
                ciudadO = opt;
                kilometros = kilometros + 12.4;
            }else if(codigo == 414 || codigo == 144){
                ciudadO = opt;
                kilometros = kilometros + 66.0;
            }else if(codigo == 56 || codigo == 65){
                ciudadO = opt;
                kilometros = kilometros + 91.1;
            }else if(codigo == 57 || codigo == 75){
                ciudadO = opt;
                kilometros = kilometros + 60.0;
            }else if(codigo == 58 || codigo == 85){
                ciudadO = opt;
                kilometros = kilometros + 98.5;
            }else if(codigo == 59 || codigo == 95){
                ciudadO = opt;
                kilometros = kilometros + 25.1;
            }else if(codigo == 510 || codigo == 105){
                ciudadO = opt;
                kilometros = kilometros + 90.6;
            }else if(codigo == 511 || codigo == 115){
                ciudadO = opt;
                kilometros = kilometros + 84.8;
            }else if(codigo == 512 || codigo == 125){
                ciudadO = opt;
                kilometros = kilometros + 22.9;
            }else if(codigo == 513 || codigo == 135){
                ciudadO = opt;
                kilometros = kilometros + 85.5;
            }else if(codigo == 514 || codigo == 145){
                ciudadO = opt;
                kilometros = kilometros + 73.4;
            }else if(codigo == 67 || codigo == 76){
                ciudadO = opt;
                kilometros = kilometros + 33.9;
            }else if(codigo == 68 || codigo == 86){
                ciudadO = opt;
                kilometros = kilometros + 87.2;
            }else if(codigo == 69 || codigo == 96){
                ciudadO = opt;
                kilometros = kilometros + 88.1;
            }else if(codigo == 610 || codigo == 106){
                ciudadO = opt;
                kilometros = kilometros + 64.7;
            }else if(codigo == 611 || codigo == 116){
                ciudadO = opt;
                kilometros = kilometros + 49.1;
            }else if(codigo == 612 || codigo == 126){
                ciudadO = opt;
                kilometros = kilometros + 110.0;
            }else if(codigo == 613 || codigo == 136){
                ciudadO = opt;
                kilometros = kilometros + 76.9;
            }else if(codigo == 614 || codigo == 146){
                ciudadO = opt;
                kilometros = kilometros + 22.6;
            }else if(codigo == 78 || codigo == 87){
                ciudadO = opt;
                kilometros = kilometros + 53.3;
            }else if(codigo == 79 || codigo == 97){
                ciudadO = opt;
                kilometros = kilometros + 56.9;
            }else if(codigo == 710 || codigo == 107){
                ciudadO = opt;
                kilometros = kilometros + 30.8;
            }else if(codigo == 711 || codigo == 117){
                ciudadO = opt;
                kilometros = kilometros + 60.0;
            }else if(codigo == 712 || codigo == 127){
                ciudadO = opt;
                kilometros = kilometros + 78.7;
            }else if(codigo == 713 || codigo == 137){
                ciudadO = opt;
                kilometros = kilometros + 43.0;
            }else if(codigo == 714 || codigo == 147){
                ciudadO = opt;
                kilometros = kilometros + 33.5;
            }else if(codigo == 89 || codigo == 98){
                ciudadO = opt;
                kilometros = kilometros + 110.0;
            }else if(codigo == 810 || codigo == 108){
                ciudadO = opt;
                kilometros = kilometros + 32.9;
            }else if(codigo == 811 || codigo == 118){
                ciudadO = opt;
                kilometros = kilometros + 113.0;
            }else if(codigo == 812 || codigo == 128){
                ciudadO = opt;
                kilometros = kilometros + 96.6;
            }else if(codigo == 813 || codigo == 138){
                ciudadO = opt;
                kilometros = kilometros + 44.7;
            }else if(codigo == 814 || codigo == 148){
                ciudadO = opt;
                kilometros = kilometros + 86.5;
            }else if(codigo == 910 || codigo == 109){
                ciudadO = opt;
                kilometros = kilometros + 87.6;
            }else if(codigo == 911 || codigo == 119){
                ciudadO = opt;
                kilometros = kilometros + 81.7;
            }else if(codigo == 912 || codigo == 129){
                ciudadO = opt;
                kilometros = kilometros + 53.6;
            }else if(codigo == 913 || codigo == 139){
                ciudadO = opt;
                kilometros = kilometros + 99.8;
            }else if(codigo == 914 || codigo == 149){
                ciudadO = opt;
                kilometros = kilometros + 70.4;
            }else if(codigo == 1011 || codigo == 1110){
                ciudadO = opt;
                kilometros = kilometros + 90.7;
            }else if(codigo == 1012 || codigo == 1210){
                ciudadO = opt;
                kilometros = kilometros + 95.8;
            }else if(codigo == 1013 || codigo == 1310){
                ciudadO = opt;
                kilometros = kilometros + 14.3;
            }else if(codigo == 1014 || codigo == 1410){
                ciudadO = opt;
                kilometros = kilometros + 64.2;
            }else if(codigo == 1112 || codigo == 1211){
                ciudadO = opt;
                kilometros = kilometros + 103.0;
            }else if(codigo == 1113 || codigo == 1311){
                ciudadO = opt;
                kilometros = kilometros + 103.0;
            }else if(codigo == 1114 || codigo == 1411){
                ciudadO = opt;
                kilometros = kilometros + 34.3;
            }else if(codigo == 1213 || codigo == 1312){
                ciudadO = opt;
                kilometros = kilometros + 83.2;
            }else if(codigo == 1214 || codigo == 1412){
                ciudadO = opt;
                kilometros = kilometros + 109.0;
            }else if(codigo == 1314 || codigo == 1413){
                ciudadO = opt;
                kilometros = kilometros + 75.2;
            
            }  

        }
        
        System.out.println("Kilometros a recorrer = " + kilometros);

        System.out.print("Ingrese valor del galon en estos momentos: ");
        int galon = info.nextInt();

        System.out.print("Ingrese cantidad de galones que alcanzan el tanque: ");
        int cant = info.nextInt();

        System.out.print("Ingrese la cantidad de kilometros que dura la gasolina empezando con el tanque lleno: ");
        int km = info.nextInt();

        int tanquear = 0;

        while( kilometros > 0){
            kilometros = kilometros - km;
            tanquear = tanquear + 1;
        }

        int gasolina = (galon * cant) * tanquear;

        System.out.print("El valor total en pesos de  la gasolina que consumira el camion es: $" + gasolina);

    }
}