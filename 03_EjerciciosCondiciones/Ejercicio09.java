import java.util.Scanner;
public class Ejercicio09{
    public static void main (String[] args){

        Scanner fecha = new Scanner(System.in);

        String text1 = "";
        String text2 = "";
        String text3 = "";

        System.out.print("Ingrese la fecha en formato ddmmaaaa: ");
        int num = fecha.nextInt();

        int digs1 = num % 10000;
        int digs2 = (num % 1000000)/10000;
        int digs3 = (num / 1000000);

        System.out.println(digs3 + " " + digs2 +" "+ digs1);

        if (digs1 > 1999){
            int cifra2 = (digs1 % 1000)/100;
            int cifra3 = (digs1 % 100)/10;
            int cifra4 = digs1 % 10;

            if (cifra3 < 1){
                if (cifra4 < 1){
                        
                    text1 = "DOSMIL";

                }else{

                    if (cifra4 / 2 == 1 && cifra4 % 2 == 0){
                        text1 = "DOSMIL DOS";
                    }else{
                        if (cifra4 / 3 == 1 && cifra4 % 3 == 0){
                            text1 = " DOSMIL TRES";
                        }else{
                            if (cifra4 / 4 == 1 && cifra4 % 4 == 0){
                                text1 = " DOSMIL CUATRO";
                            }else{
                                if (cifra4 / 5 == 1 && cifra4 % 5 == 0){
                                    text1 = " DOSMIL CINCO";
                                }else{
                                    if (cifra4 / 6 == 1 && cifra4 % 6 == 0){
                                        text1 = "DOSMIL SEIS";
                                    }else{
                                        if (cifra4 / 7 == 1 && cifra4 % 7 == 0){
                                            text1 = "DOSMIL SIETE";
                                        }else{
                                            if (cifra4 / 8 == 1 && cifra4 % 8 == 0){
                                                text1 = " DOSMIL OCHO";
                                            }else{
                                                if (cifra4 / 9 == 1 && cifra4 % 9 == 0){
                                                    text1 = " DOSMIL NUEVE";
                                                }else{
                                                    text1 = "DOSMIL UNO";
                                                }
                                            }
                                        }                                   
                                    }
                                }

                            }
                        }
                    }
                }
            }else{
                if (cifra3 / 2 == 1 && cifra3 % 2 == 0){
                    if (cifra4 < 1){
                            
                        text1 = "DOSMIL VEINTE ";

                    }else{

                        if (cifra4 / 2 == 1 && cifra4 % 2 == 0){
                            text1 = "DOSMIL VEINTIDOS";
                        }else{
                            if (cifra4 / 3 == 1 && cifra4 % 3 == 0){
                                text1 = " DOSMIL VEINTITRES";
                            }else{
                                if (cifra4 / 4 == 1 && cifra4 % 4 == 0){
                                    text1 = " DOSMIL VEINTICUATRO";
                                }else{
                                    if (cifra4 / 5 == 1 && cifra4 % 5 == 0){
                                        text1 = " DOSMIL VEINTICINCO";
                                    }else{
                                        if (cifra4 / 6 == 1 && cifra4 % 6 == 0){
                                            text1 = "DOSMIL VEINTISEIS";
                                        }else{
                                            if (cifra4 / 7 == 1 && cifra4 % 7 == 0){
                                                text1 = "DOSMIL VEINTISIETE";
                                            }else{
                                                if (cifra4 / 8 == 1 && cifra4 % 8 == 0){
                                                    text1 = " DOSMIL VEINTIOCHO";
                                                }else{
                                                    if (cifra4 / 9 == 1 && cifra4 % 9 == 0){
                                                        text1 = " DOSMIL VEINTINUEVE";
                                                    }else{
                                                        text1 = "DOSMIL VEINTIUNO";
                                                    }
                                                }
                                            }                                   
                                        }
                                    }

                                }
                            }
                        }
                    }
                }

            }
            
                    

        }else{
            if (digs1 > 999){
                int cifra2 = (digs1 % 1000)/100;
                int cifra3 = (digs1 % 100)/10;
                int cifra4 = digs1 % 10;

                if (cifra3 < 1){
                    if (cifra4 < 1){
                            
                        text1 = "MIL";

                    }else{

                        if (cifra4 / 2 == 1 && cifra4 % 2 == 0){
                            text1 = "MIL DOS";
                        }else{
                            if (cifra4 / 3 == 1 && cifra4 % 3 == 0){
                                text1 = " MIL TRES";
                            }else{
                                if (cifra4 / 4 == 1 && cifra4 % 4 == 0){
                                    text1 = " MIL CUATRO";
                                }else{
                                    if (cifra4 / 5 == 1 && cifra4 % 5 == 0){
                                        text1 = " MIL CINCO";
                                    }else{
                                        if (cifra4 / 6 == 1 && cifra4 % 6 == 0){
                                            text1 = "MIL SEIS";
                                        }else{
                                            if (cifra4 / 7 == 1 && cifra4 % 7 == 0){
                                                text1 = "MIL SIETE";
                                            }else{
                                                if (cifra4 / 8 == 1 && cifra4 % 8 == 0){
                                                    text1 = " MIL OCHO";
                                                }else{
                                                    if (cifra4 / 9 == 1 && cifra4 % 9 == 0){
                                                        text1 = " MIL NUEVE";
                                                    }else{
                                                        text1 = "MIL UNO";
                                                    }
                                                }
                                            }                                   
                                        }
                                    }

                                }
                            }
                        }
                    }
                }else{
                    if (cifra3 / 2 == 1 && cifra3 % 2 == 0){
                        if (cifra4 < 1){
                                
                            text1 = "MIL VEINTE ";

                        }else{

                            if (cifra4 / 2 == 1 && cifra4 % 2 == 0){
                                text1 = "MIL VEINTIDOS";
                            }else{
                                if (cifra4 / 3 == 1 && cifra4 % 3 == 0){
                                    text1 = " MIL VEINTITRES";
                                }else{
                                    if (cifra4 / 4 == 1 && cifra4 % 4 == 0){
                                        text1 = " MIL VEINTICUATRO";
                                    }else{
                                        if (cifra4 / 5 == 1 && cifra4 % 5 == 0){
                                            text1 = " MIL VEINTICINCO";
                                        }else{
                                            if (cifra4 / 6 == 1 && cifra4 % 6 == 0){
                                                text1 = "MIL VEINTISEIS";
                                            }else{
                                                if (cifra4 / 7 == 1 && cifra4 % 7 == 0){
                                                    text1 = "MIL VEINTISIETE";
                                                }else{
                                                    if (cifra4 / 8 == 1 && cifra4 % 8 == 0){
                                                        text1 = " MIL VEINTIOCHO";
                                                    }else{
                                                        if (cifra4 / 9 == 1 && cifra4 % 9 == 0){
                                                            text1 = " MIL VEINTINUEVE";
                                                        }else{
                                                            text1 = "MIL VEINTIUNO";
                                                        }
                                                    }
                                                }                                   
                                            }
                                        }

                                    }
                                }
                            }
                        }
                    }else{
                        if (cifra3 / 3 == 1 && cifra3 % 3 == 0){
                            if (cifra4 < 1){
                                    
                                text1 = "MIL TREINTA ";

                            }else{

                                if (cifra4 / 2 == 1 && cifra4 % 2 == 0){
                                    text1 = "MIL TREINTA Y DOS";
                                }else{
                                    if (cifra4 / 3 == 1 && cifra4 % 3 == 0){
                                        text1 = " MIL TREINTA Y TRES";
                                    }else{
                                        if (cifra4 / 4 == 1 && cifra4 % 4 == 0){
                                            text1 = " MIL TREINTA Y CUATRO";
                                        }else{
                                            if (cifra4 / 5 == 1 && cifra4 % 5 == 0){
                                                text1 = " MIL TREINTA Y CINCO";
                                            }else{
                                                if (cifra4 / 6 == 1 && cifra4 % 6 == 0){
                                                    text1 = "MIL TREINTA Y SEIS";
                                                }else{
                                                    if (cifra4 / 7 == 1 && cifra4 % 7 == 0){
                                                        text1 = "MIL TREINTA Y SIETE";
                                                    }else{
                                                        if (cifra4 / 8 == 1 && cifra4 % 8 == 0){
                                                            text1 = " MIL TREINTA Y OCHO";
                                                        }else{
                                                            if (cifra4 / 9 == 1 && cifra4 % 9 == 0){
                                                                text1 = " MIL TREINTA Y NUEVE";
                                                            }else{
                                                                text1 = "MIL TREINTA Y UNO";
                                                            }
                                                        }
                                                    }                                   
                                                }
                                            }

                                        }
                                    }
                                }
                            }
                        }else{

                        }
                    }

                }

            }else{

            }
        }

        if (digs2 == 12){

            text2 = "DICIEMBRE";
        }else{
            if (digs2 == 11){

                text2 = "NOVIEMBRE";
            }else{
                if (digs2 == 10){

                    text2 = "OCTUBRE";
                }else{
                    if (digs2 == 9){

                        text2 = "SEPTIEMBRE";
                    }else{
                        if (digs2 == 8){

                            text2 = "AGOSTO";
                        }else{
                            if (digs2 == 7){

                                text2 = "JULIO";
                            }else{
                                if (digs2 == 6){

                                    text2 = "JUNIO";
                                }else{
                                    if (digs2 == 5){

                                        text2 = "MAYO";
                                    }else{
                                        if (digs2 == 4){

                                            text2 = "ABRIL";
                                        }else{
                                            if (digs2 == 3){

                                                text2 = "MARZO";
                                            }else{
                                                if (digs2 == 2){

                                                    text2 = "FEBRERO";
                                                }else{
                                                    if (digs2 == 1){

                                                        text2 = "ENERO";
                                                    }
                                                }
                                            }

                                        }
                                    }
                                }
                            }
                        }
                    }
                }
            }
        }

        if (digs3 == 31){

            text3 = "TREINTA Y UNO";
        }else{
            if (digs3 == 30){

                text3 = "TREINTA";
            }else{
                if (digs3 == 29){

                    text3 = "VEINTINUEVE";
                }else{
                    if (digs3 == 28){

                        text3 = "VEINTIOCHO";
                    }else{
                        if (digs3 == 27){

                            text3 = "VEINTISIETE";
                        }else{
                            if (digs3 == 26){

                                text3 = "VEINTISEIS";
                            }else{
                                if (digs3 == 25){

                                    text3 = "VEINTICINCO";
                                }else{
                                    if (digs3 == 24){

                                        text3 = "VEINTICUATRO";
                                    }else{
                                        if (digs3 == 23){

                                            text3 = "VEINTITRES";
                                        }else{
                                            if (digs3 ==22){

                                                text3 = "VEINTIDOS";
                                            }else{
                                                if (digs3 == 21){

                                                    text3 = "VEINTIUNO";
                                                }else{
                                                    if (digs3 == 20){

                                                        text3 = "VEINTE";
                                                    }else{
                                                        if (digs3 == 19){

                                                            text3 = "DIECINUEVE";
                                                        }else{
                                                            if (digs3 == 18){

                                                                text3 = "DIECIOCHO";
                                                            }else{
                                                                if (digs3 == 17){

                                                                    text3 = "DIECISIETE";
                                                                }else{
                                                                    if (digs3 == 16){

                                                                        text3 = "DIECISEIS";
                                                                    }else{
                                                                        if (digs3 == 15){

                                                                            text3 = "QUINCE";
                                                                        }else{
                                                                            if (digs3 == 14){

                                                                                text3 = "CATORCE";
                                                                            }else{
                                                                                if (digs3 == 13){

                                                                                    text3 = "TRECE";
                                                                                }else{
                                                                                    if (digs3 == 12){

                                                                                        text3 = "DOCE";
                                                                                    }else{
                                                                                        if (digs3 == 11){

                                                                                            text3 = "ONCE";
                                                                                        }else{
                                                                                            if (digs3 == 10){

                                                                                                text3 = "DIEZ";
                                                                                            }else{
                                                                                                if (digs3 == 9){

                                                                                                    text3 = "NUEVE";
                                                                                                }else{
                                                                                                    if (digs3 == 8){

                                                                                                        text3 = "OCHO";
                                                                                                    }else{
                                                                                                        if (digs3 == 7){

                                                                                                            text3 = "SIETE";
                                                                                                        }else{
                                                                                                            if (digs3 == 6){

                                                                                                                text3 = "SEIS";
                                                                                                            }else{
                                                                                                                if (digs3 == 5){

                                                                                                                    text3 = "CINCO";
                                                                                                                }else{
                                                                                                                    if (digs3 == 4){

                                                                                                                        text3 = "CUATRO";
                                                                                                                    }else{
                                                                                                                        if (digs3 == 3){

                                                                                                                            text3 = "TRES";
                                                                                                                        }else{
                                                                                                                            if (digs3 == 2){

                                                                                                                                text3 = "DOS";
                                                                                                                            }else{
                                                                                                                                if (digs3 == 1){

                                                                                                                                    text3 = "UNO";
                                                                                                                                }
                                                                                                                            }
                                                                                                                        }
                                                                                                                    }
                                                                                                                }
                                                                                                            }
                                                                                                        }
                                                                                                    }
                                                                                                }
                                                                                            }
                                                                                        }
                                                                                    }
                                                                                }
                                                                            }
                                                                        }
                                                                    }
                                                                }
                                                            }
                                                        }
                                                    } 
                                                }
                                            }

                                        }
                                    }
                                }
                            }
                        }
                    }
                }
            }
        }

        System.out.println("El texto del numero es: " + text3 + " DE " + text2 + " DEL ANO " + text1);
   

    }
}