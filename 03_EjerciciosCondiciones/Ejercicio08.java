import java.util.Scanner;
public class Ejercicio08{

    public static void main (String[] args){

        Scanner numero = new Scanner(System.in);
        String text1 = "";
        String text2 = "";
        String text3 = "";

        System.out.print("Ingrese un numero de maximo 9 digitos: ");
        int num = numero.nextInt();

        if (num > 999999999){
            System.out.print("El numero se pasa del limite, escriba otro numero de 9 digitos: ");
            num = numero.nextInt();
        }

        if (num > 99999999){
            int digs1 = num % 1000;
            int digs2 = (num % 1000000)/1000;
            int digs3 = (num % 1000000000)/1000000;

            if (digs3 > 900){

                int cifra2 = (digs3 % 100)/10;
                int cifra3 = digs3 % 10;

                if (cifra2 / 2 == 1 && cifra2 % 2 == 0){
                    if (cifra3 < 1){
                        
                        text1 = "NOVECIENTOS VEINTE MILLONES ";

                    }else{
                        if (cifra3 / 2 == 1 && cifra3 % 2 == 0){
                            text1 = "NOVECIENTOS VEINTIDOS MILLONES ";
                        }else{
                            if (cifra3 / 3 == 1 && cifra3 % 3 == 0){
                                text1 = "NOVECIENTOS VEINTITRES MILLONES ";
                            }else{
                                if (cifra3 / 4 == 1 && cifra3 % 4 == 0){
                                    text1 = "NOVECIENTOS VEINTICUATRO MILLONES ";
                                }else{
                                    if (cifra3 / 5 == 1 && cifra3 % 5 == 0){
                                        text1 = "NOVECIENTOS VEINTICINCO MILLONES ";
                                    }else{
                                        if (cifra3 / 6 == 1 && cifra3 % 6 == 0){
                                            text1 = "NOVECIENTOS VEINTISEIS MILLONES ";
                                        }else{
                                            if (cifra3 / 7 == 1 && cifra3 % 7 == 0){
                                                text1 = "NOVECIENTOS VEINTISIETE MILLONES ";
                                            }else{
                                                if (cifra3 / 8 == 1 && cifra3 % 8 == 0){
                                                    text1 = "NOVECIENTOS VEINTIOCHO MILLONES ";
                                                }else{
                                                    if (cifra3 / 9 == 1 && cifra3 % 9 == 0){
                                                        text1 = "NOVECIENTOS VEINTINUEVE MILLONES ";
                                                    }else{
                                                        text1 = "NOVECIENTOS VEINTIUN MILLONES ";
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
                    if (cifra2 / 3 == 1 && cifra2 % 3 == 0){

                        if (cifra3 < 1){
                            
                            text1 = "NOVECIENTOS TREINTA MILLONES ";

                        }else{

                            if (cifra3 / 2 == 1 && cifra3 % 2 == 0){
                                text1 = "NOVECIENTOS TREINTA Y DOS MILLONES ";
                            }else{
                                if (cifra3 / 3 == 1 && cifra3 % 3 == 0){
                                    text1 = "NOVECIENTOS TREINTA Y TRES MILLONES ";
                                }else{
                                    if (cifra3 / 4 == 1 && cifra3 % 4 == 0){
                                        text1 = "NOVECIENTOS TREINTA Y CUATRO MILLONES ";
                                    }else{
                                        if (cifra3 / 5 == 1 && cifra3 % 5 == 0){
                                            text1 = "NOVECIENTOS TREINTA Y CINCO MILLONES ";
                                        }else{
                                            if (cifra3 / 6 == 1 && cifra3 % 6 == 0){
                                                text1 = "NOVECIENTOS TREINTA Y SEIS MILLONES ";
                                            }else{
                                                if (cifra3 / 7 == 1 && cifra3 % 7 == 0){
                                                    text1 = "NOVECIENTOS TREINTA Y SIETE MILLONES ";
                                                }else{
                                                    if (cifra3 / 8 == 1 && cifra3 % 8 == 0){
                                                        text1 = "NOVECIENTOS TREINTA Y OCHO MILLONES ";
                                                    }else{
                                                        if (cifra3 / 9 == 1 && cifra3 % 9 == 0){
                                                            text1 = "NOVECIENTOS TREINTA Y NUEVE MILLONES ";
                                                        }else{
                                                            text1 = "NOVECIENTOS TREINTA Y UN MILLONES ";
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
                        if (cifra2 / 4 == 1 && cifra2 % 4 == 0){

                            if (cifra3 < 1){
                                
                                text1 = "NOVECIENTOS CUARENTA MILLONES ";

                            }else{

                                if (cifra3 / 2 == 1 && cifra3 % 2 == 0){
                                    text1 = "NOVECIENTOS CUARENTA Y DOS MILLONES ";
                                }else{
                                    if (cifra3 / 3 == 1 && cifra3 % 3 == 0){
                                        text1 = "NOVECIENTOS CUARENTA Y TRES MILLONES ";
                                    }else{
                                        if (cifra3 / 4 == 1 && cifra3 % 4 == 0){
                                            text1 = "NOVECIENTOS CUARENTA Y CUATRO MILLONES ";
                                        }else{
                                            if (cifra3 / 5 == 1 && cifra3 % 5 == 0){
                                                text1 = "NOVECIENTOS CUARENTA Y CINCO MILLONES ";
                                            }else{
                                                if (cifra3 / 6 == 1 && cifra3 % 6 == 0){
                                                    text1 = "NOVECIENTOS CUARENTA Y SEIS MILLONES ";
                                                }else{
                                                    if (cifra3 / 7 == 1 && cifra3 % 7 == 0){
                                                        text1 = "NOVECIENTOS CUARENTA Y SIETE MILLONES ";
                                                    }else{
                                                        if (cifra3 / 8 == 1 && cifra3 % 8 == 0){
                                                            text1 = "NOVECIENTOS CUARENTA Y OCHO MILLONES ";
                                                        }else{
                                                            if (cifra3 / 9 == 1 && cifra3 % 9 == 0){
                                                                text1 = "NOVECIENTOS CUARENTA Y NUEVE MILLONES ";
                                                            }else{
                                                                text1 = "NOVECIENTOS CUARENTA Y UN MILLONES ";
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

                            if (cifra2 / 5 == 1 && cifra2 % 5 == 0){

                                if (cifra3 < 1){
                                    
                                    text1 = "NOVECIENTOS CINCUENTA MILLONES ";

                                }else{

                                    if (cifra3 / 2 == 1 && cifra3 % 2 == 0){
                                        text1 = "NOVECIENTOS CINCUENTA Y DOS MILLONES ";
                                    }else{
                                        if (cifra3 / 3 == 1 && cifra3 % 3 == 0){
                                            text1 = "NOVECIENTOS CINCUENTA Y TRES MILLONES ";
                                        }else{
                                            if (cifra3 / 4 == 1 && cifra3 % 4 == 0){
                                                text1 = "NOVECIENTOS CINCUENTA Y CUATRO MILLONES ";
                                            }else{
                                                if (cifra3 / 5 == 1 && cifra3 % 5 == 0){
                                                    text1 = "NOVECIENTOS CINCUENTA Y CINCO MILLONES ";
                                                }else{
                                                    if (cifra3 / 6 == 1 && cifra3 % 6 == 0){
                                                        text1 = "NOVECIENTOS CINCUENTA Y SEIS MILLONES ";
                                                    }else{
                                                        if (cifra3 / 7 == 1 && cifra3 % 7 == 0){
                                                            text1 = "NOVECIENTOS CINCUENTA Y SIETE MILLONES ";
                                                        }else{
                                                            if (cifra3 / 8 == 1 && cifra3 % 8 == 0){
                                                                text1 = "NOVECIENTOS CINCUENTA Y OCHO MILLONES ";
                                                            }else{
                                                                if (cifra3 / 9 == 1 && cifra3 % 9 == 0){
                                                                    text1 = "NOVECIENTOS CINCUENTA Y NUEVE MILLONES ";
                                                                }else{
                                                                    text1 = "NOVECIENTOS CINCUENsTA Y UN MILLONES ";
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
                                if (cifra2 / 6 == 1 && cifra2 % 6 == 0){
                                    
                                    if (cifra3 < 1){
                                                
                                        text1 = "NOVECIENTOS SESENTA MILLONES ";

                                    }else{

                                        if (cifra3 / 2 == 1 && cifra3 % 2 == 0){
                                            text1 = "NOVECIENTOS SESENTA Y DOS MILLONES ";
                                        }else{
                                            if (cifra3 / 3 == 1 && cifra3 % 3 == 0){
                                                text1 = "NOVECIENTOS SESENTA Y TRES MILLONES ";
                                            }else{
                                                if (cifra3 / 4 == 1 && cifra3 % 4 == 0){
                                                    text1 = "NOVECIENTOS SESENTA Y CUATRO MILLONES ";
                                                }else{
                                                    if (cifra3 / 5 == 1 && cifra3 % 5 == 0){
                                                        text1 = "NOVECIENTOS SESENTA Y CINCO MILLONES ";
                                                    }else{
                                                        if (cifra3 / 6 == 1 && cifra3 % 6 == 0){
                                                            text1 = "NOVECIENTOS SESENTA Y SEIS MILLONES ";
                                                        }else{
                                                            if (cifra3 / 7 == 1 && cifra3 % 7 == 0){
                                                                text1 = "NOVECIENTOS SESENTA Y SIETE MILLONES ";
                                                            }else{
                                                                if (cifra3 / 8 == 1 && cifra3 % 8 == 0){
                                                                    text1 = "NOVECIENTOS SESENTA Y OCHO MILLONES ";
                                                                }else{
                                                                    if (cifra3 / 9 == 1 && cifra3 % 9 == 0){
                                                                        text1 = "NOVECIENTOS SESENTA Y NUEVE MILLONES ";
                                                                    }else{
                                                                        text1 = "NOVECIENTOS SESENTA Y UN MILLONES ";
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
                                    if (cifra2 / 7 == 1 && cifra2 % 7 == 0){

                                        if (cifra3 < 1){
                                            text1 = "NOVECIENTOS SETENTA MILLONES ";

                                        }else{

                                            if (cifra3 / 2 == 1 && cifra3 % 2 == 0){
                                                text1 = "NOVECIENTOS SETENTA Y DOS MILLONES ";
                                            }else{
                                                if (cifra3 / 3 == 1 && cifra3 % 3 == 0){
                                                    text1 = "NOVECIENTOS SETENTA Y TRES MILLONES ";
                                                }else{
                                                    if (cifra3 / 4 == 1 && cifra3 % 4 == 0){
                                                        text1 = "NOVECIENTOS SETENTA Y CUATRO MILLONES ";
                                                    }else{
                                                        if (cifra3 / 5 == 1 && cifra3 % 5 == 0){
                                                            text1 = "NOVECIENTOS SETENTA Y CINCO MILLONES ";
                                                        }else{
                                                            if (cifra3 / 6 == 1 && cifra3 % 6 == 0){
                                                                text1 = "NOVECIENTOS SETENTA Y SEIS MILLONES ";
                                                            }else{
                                                                if (cifra3 / 7 == 1 && cifra3 % 7 == 0){
                                                                    text1 = "NOVECIENTOS SETENTA Y SIETE MILLONES ";
                                                                }else{
                                                                    if (cifra3 / 8 == 1 && cifra3 % 8 == 0){
                                                                        text1 = "NOVECIENTOS SETENTA Y OCHO MILLONES ";
                                                                    }else{
                                                                        if (cifra3 / 9 == 1 && cifra3 % 9 == 0){
                                                                            text1 = "NOVECIENTOS SETENTA Y NUEVE MILLONES ";
                                                                        }else{
                                                                            text1 = "NOVECIENTOS SETENTA Y UN MILLONES ";
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
                                        if (cifra2 / 8 == 1 && cifra2 % 8 == 0){

                                            if (cifra3 < 1){
                                                    text1 = "NOVECIENTOS OCHENTA MILLONES ";

                                            }else{

                                                if (cifra3 / 2 == 1 && cifra3 % 2 == 0){
                                                    text1 = "NOVECIENTOS OCHENTA Y DOS MILLONES ";
                                                }else{
                                                    if (cifra3 / 3 == 1 && cifra3 % 3 == 0){
                                                        text1 = "NOVECIENTOS OCHENTA Y TRES MILLONES ";
                                                    }else{
                                                        if (cifra3 / 4 == 1 && cifra3 % 4 == 0){
                                                            text1 = "NOVECIENTOS OCHENTA Y CUATRO MILLONES ";
                                                        }else{
                                                            if (cifra3 / 5 == 1 && cifra3 % 5 == 0){
                                                                text1 = "NOVECIENTOS OCHENTA Y CINCO MILLONES ";
                                                            }else{
                                                                if (cifra3 / 6 == 1 && cifra3 % 6 == 0){
                                                                    text1 = "NOVECIENTOS OCHENTA Y SEIS MILLONES ";
                                                                }else{
                                                                    if (cifra3 / 7 == 1 && cifra3 % 7 == 0){
                                                                        text1 = "NOVECIENTOS OCHENTA Y SIETE MILLONES ";
                                                                    }else{
                                                                        if (cifra3 / 8 == 1 && cifra3 % 8 == 0){
                                                                            text1 = "NOVECIENTOS OCHENTA Y OCHO MILLONES ";
                                                                        }else{
                                                                            if (cifra3 / 9 == 1 && cifra3 % 9 == 0){
                                                                                text1 = "NOVECIENTOS OCHENTA Y NUEVE MILLONES ";
                                                                            }else{
                                                                                text1 = "NOVECIENTOS OCHENTA Y UN MILLONES ";
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
                                            if (cifra2 / 9 == 1 && cifra2 % 9 == 0){

                                                if (cifra3 < 1){
                                                    text1 = "NOVECIENTOS NOVENTA MILLONES ";

                                                }else{
                                                    if (cifra3 / 2 == 1 && cifra3 % 2 == 0){
                                                        text1 = "NOVECIENTOS NOVENTA Y DOS MILLONES ";
                                                    }else{
                                                        if (cifra3 / 3 == 1 && cifra3 % 3 == 0){
                                                            text1 = "NOVECIENTOS NOVENTA Y TRES MILLONES ";
                                                        }else{
                                                            if (cifra3 / 4 == 1 && cifra3 % 4 == 0){
                                                                text1 = "NOVECIENTOS NOVENTA Y CUATRO MILLONES ";
                                                            }else{
                                                                if (cifra3 / 5 == 1 && cifra3 % 5 == 0){
                                                                    text1 = "NOVECIENTOS NOVENTA Y CINCO MILLONES ";
                                                                }else{
                                                                    if (cifra3 / 6 == 1 && cifra3 % 6 == 0){
                                                                        text1 = "NOVECIENTOS NOVENTA Y SEIS MILLONES ";
                                                                    }else{
                                                                        if (cifra3 / 7 == 1 && cifra3 % 7 == 0){
                                                                            text1 = "NOVECIENTOS NOVENTA Y SIETE MILLONES ";
                                                                        }else{
                                                                            if (cifra3 / 8 == 1 && cifra3 % 8 == 0){
                                                                                text1 = "NOVECIENTOS NOVENTA Y OCHO MILLONES ";
                                                                            }else{
                                                                                if (cifra3 / 9 == 1 && cifra3 % 9 == 0){
                                                                                    text1 = "NOVECIENTOS NOVENTA Y NUEVE MILLONES ";
                                                                                }else{
                                                                                    text1 = "NOVECIENTOS NOVENTA Y UN MILLONES ";
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
                                                if (cifra2 < 1){

                                                    if (cifra3 < 1){
                                                        text1 = "NOVECIENTOS MILLONES ";
                                                    }else{
                                                        if (cifra3 / 2 == 1 && cifra3 % 2 == 0){
                                                            text1 = "NOVECIENTOS DOS MILLONES ";
                                                        }else{
                                                            if (cifra3 / 3 == 1 && cifra3 % 3 == 0){
                                                                text1 = "NOVECIENTOS TRES MILLONES ";
                                                            }else{
                                                                if (cifra3 / 4 == 1 && cifra3 % 4 == 0){
                                                                    text1 = "NOVECIENTOS CUATRO MILLONES ";
                                                                }else{
                                                                    if (cifra3 / 5 == 1 && cifra3 % 5 == 0){
                                                                        text1 = "NOVECIENTOS CINCO MILLONES ";
                                                                    }else{
                                                                        if (cifra3 / 6 == 1 && cifra3 % 6 == 0){
                                                                            text1 = "NOVECIENTOS SEIS MILLONES ";
                                                                        }else{
                                                                            if (cifra3 / 7 == 1 && cifra3 % 7 == 0){
                                                                                text1 = "NOVECIENTOS SIETE MILLONES ";
                                                                            }else{
                                                                                if (cifra3 / 8 == 1 && cifra3 % 8 == 0){
                                                                                    text1 = "NOVECIENTOS OCHO MILLONES ";
                                                                                }else{
                                                                                    if (cifra3 / 9 == 1 && cifra3 % 9 == 0){
                                                                                        text1 = "NOVECIENTOS NUEVE MILLONES ";
                                                                                    }else{
                                                                                        text1 = "NOVECIENTOS UN MILLONES ";
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
                                                    if (cifra3 < 1){
                                                        text1 = "NOVECIENTOS DIEZ MILLONES ";
                                                    }else{
                                                        if (cifra3 / 2 == 1 && cifra3 % 2 == 0){
                                                            text1 = "NOVECIENTOS DOCE MILLONES ";
                                                            if ( cifra3 / 3 == 1 && cifra3 % 3 == 0){
                                                                    text1 = "NOVECIENTOS TRECE  MILLONES ";
                                                            }else{
                                                                if (cifra3 / 4 == 1 && cifra3 % 4 == 0){
                                                                    text1 = "NOVECIENTOS CATORCE MILLONES ";
                                                                }else{
                                                                    if ( cifra3 / 5 == 1 && cifra3 % 5 == 0){
                                                                        text1 = "NOVECIENTOS QUINCE MILLONES ";
                                                                    }else{
                                                                        if (cifra3 / 6 == 1 && cifra3 % 6 == 0){
                                                                            text1 = "NOVECIENTOS DIECISEIS MILLONES ";
                                                                        }else{
                                                                            if (cifra3 / 7 == 1 && cifra3 % 7 == 0){
                                                                                text1 = "NOVECIENTOS DIECISIETE MILLONES ";
                                                                            }else{
                                                                                if (cifra3 / 8 == 1 && cifra3 % 8 == 0){
                                                                                    text1 = "NOVECIENTOS DIECIOCHO MILLONES ";
                                                                                }else{
                                                                                    if (cifra3 / 9 == 1 && cifra3 % 9 == 0){
                                                                                        text1 = "NOVECIENTOS DIECINUEVE MILLONES ";
                                                                                    }else{
                                                                                        text1 = "NOVECIENTO ONCE MILLONES ";
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

            }else{
                if (digs3 < 900 && digs3 >799){

                    int cifra2 = (digs3 % 100)/10;
                    int cifra3 = digs3 % 10;

                    if (cifra2 / 2 == 1 && cifra2 % 2 == 0){
                        if (cifra3 < 1){
                            
                            text1 = "SETECIENTOS VEINTE MILLONES ";

                        }else{
                            if (cifra3 / 2 == 1 && cifra3 % 2 == 0){
                                text1 = "OCHOCIENTOS VEINTIDOS MILLONES ";
                            }else{
                                if (cifra3 / 3 == 1 && cifra3 % 3 == 0){
                                    text1 = "OCHOCIENTOS VEINTITRES MILLONES ";
                                }else{
                                    if (cifra3 / 4 == 1 && cifra3 % 4 == 0){
                                        text1 = "OCHOCIENTOS VEINTICUATRO MILLONES ";
                                    }else{
                                        if (cifra3 / 5 == 1 && cifra3 % 5 == 0){
                                            text1 = "OCHOCIENTOS VEINTICINCO MILLONES ";
                                        }else{
                                            if (cifra3 / 6 == 1 && cifra3 % 6 == 0){
                                                text1 = "OCHOCIENTOS VEINTISEIS MILLONES ";
                                            }else{
                                                if (cifra3 / 7 == 1 && cifra3 % 7 == 0){
                                                    text1 = "OCHOCIENTOS VEINTISIETE MILLONES ";
                                                }else{
                                                    if (cifra3 / 8 == 1 && cifra3 % 8 == 0){
                                                        text1 = "OCHOCIENTOS VEINTIOCHO MILLONES ";
                                                    }else{
                                                        if (cifra3 / 9 == 1 && cifra3 % 9 == 0){
                                                            text1 = "OCHOCIENTOS VEINTINUEVE MILLONES ";
                                                        }else{
                                                            text1 = "OCHOCIENTOS VEINTIUN MILLONES ";
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
                        if (cifra2 / 3 == 1 && cifra2 % 3 == 0){

                            if (cifra3 < 1){
                                
                                text1 = "OCHOCIENTOS TREINTA MILLONES ";

                            }else{

                                if (cifra3 / 2 == 1 && cifra3 % 2 == 0){
                                    text1 = "OCHOCIENTOS TREINTA Y DOS MILLONES ";
                                }else{
                                    if (cifra3 / 3 == 1 && cifra3 % 3 == 0){
                                        text1 = "OCHOCIENTOS TREINTA Y TRES MILLONES ";
                                    }else{
                                        if (cifra3 / 4 == 1 && cifra3 % 4 == 0){
                                            text1 = "OCHOCIENTOS TREINTA Y CUATRO MILLONES ";
                                        }else{
                                            if (cifra3 / 5 == 1 && cifra3 % 5 == 0){
                                                text1 = "OCHOCIENTOS TREINTA Y CINCO MILLONES ";
                                            }else{
                                                if (cifra3 / 6 == 1 && cifra3 % 6 == 0){
                                                    text1 = "OCHOCIENTOS TREINTA Y SEIS  MILLONES ";
                                                }else{
                                                    if (cifra3 / 7 == 1 && cifra3 % 7 == 0){
                                                        text1 = "OCHOCIENTOS TREINTA Y SIETE MILLONES ";
                                                    }else{
                                                        if (cifra3 / 8 == 1 && cifra3 % 8 == 0){
                                                            text1 = "OCHOCIENTOS TREINTA Y OCHO MILLONES ";
                                                        }else{
                                                            if (cifra3 / 9 == 1 && cifra3 % 9 == 0){
                                                                text1 = "OCHOCIENTOS TREINTA Y NUEVE MILLONES ";
                                                            }else{
                                                                text1 = "OCHOCIENTOS TREINTA Y UN MILLONES ";
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
                            if (cifra2 / 4 == 1 && cifra2 % 4 == 0){

                                if (cifra3 < 1){
                                    
                                    text1 = "OCHOCIENTOS CUARENTA MILLONES ";

                                }else{

                                    if (cifra3 / 2 == 1 && cifra3 % 2 == 0){
                                        text1 = "OCHOCIENTOS CUARENTA Y DOS MILLONES ";
                                    }else{

                                        if (cifra3 / 3 == 1 && cifra3 % 3 == 0){
                                            text1 = "OCHOCIENTOS CUARENTA Y TRES MILLONES ";
                                        }else{
                                            if (cifra3 / 4 == 1 && cifra3 % 4 == 0){
                                                text1 = "OCHOCIENTOS CUARENTA Y CUATRO MILLONES ";
                                            }else{
                                                if (cifra3 / 5 == 1 && cifra3 % 5 == 0){
                                                    text1 = "OCHOCIENTOS CUARENTA Y CINCO MILLONES ";
                                                }else{
                                                    if (cifra3 / 6 == 1 && cifra3 % 6 == 0){
                                                        text1 = "OCHOCIENTOS CUARENTA Y SEIS  MILLONES ";
                                                    }else{
                                                        if (cifra3 / 7 == 1 && cifra3 % 7 == 0){
                                                            text1 = "OCHOCIENTOS CUARENTA Y SIETE MILLONES ";
                                                        }else{
                                                            if (cifra3 / 8 == 1 && cifra3 % 8 == 0){
                                                                text1 = "OCHOCIENTOS CUARENTA Y OCHO MILLONES ";
                                                            }else{
                                                                if (cifra3 / 9 == 1 && cifra3 % 9 == 0){
                                                                    text1 = "OCHOCIENTOS CUARENTA Y NUEVE MILLONES ";
                                                                }else{
                                                                    text1 = "OCHOCIENTOS CUARENTA Y UN MILLONES ";
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

                                if (cifra2 / 5 == 1 && cifra2 % 5 == 0){

                                    if (cifra3 < 1){
                                        
                                        text1 = "OCHOCIENTOS CINCUENTA MILLONES ";

                                    }else{

                                        if (cifra3 / 2 == 1 && cifra3 % 2 == 0){
                                            text1 = "OCHOCIENTOS CINCUENTA Y DOS MILLONES ";
                                        }else{

                                            if (cifra3 / 3 == 1 && cifra3 % 3 == 0){
                                                text1 = "OCHOCIENTOS CINCUENTA Y TRES MILLONES ";
                                            }else{
                                                if (cifra3 / 4 == 1 && cifra3 % 4 == 0){
                                                    text1 = "OCHOCIENTOS CINCUENTA Y CUATRO MILLONES ";
                                                }else{
                                                    if (cifra3 / 5 == 1 && cifra3 % 5 == 0){
                                                        text1 = "OCHOCIENTOS CINCUENTA Y CINCO MILLONES ";
                                                    }else{
                                                        if (cifra3 / 6 == 1 && cifra3 % 6 == 0){
                                                            text1 = "OCHOCIENTOS CINCUENTA Y SEIS  MILLONES ";
                                                        }else{
                                                            if (cifra3 / 7 == 1 && cifra3 % 7 == 0){
                                                                text1 = "OCHOCIENTOS CINCUENTA Y SIETE MILLONES ";
                                                            }else{
                                                                if (cifra3 / 8 == 1 && cifra3 % 8 == 0){
                                                                    text1 = "OCHOCIENTOS CINCUENTA Y OCHO MILLONES ";
                                                                }else{
                                                                    if (cifra3 / 9 == 1 && cifra3 % 9 == 0){
                                                                        text1 = "OCHOCIENTOS CINCUENTA Y NUEVE MILLONES ";
                                                                    }else{
                                                                        text1 = "OCHOCIENTOS CINCUENTA Y UN MILLONES ";
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
                                    if (cifra2 / 6 == 1 && cifra2 % 6 == 0){
                                        
                                        if (cifra3 < 1){
                                                    
                                            text1 = "OCHOCIENTOS SESENTA MILLONES ";

                                        }else{
                                            if (cifra3 / 2 == 1 && cifra3 % 2 == 0){
                                                text1 = "OCHOCIENTOS SESENTA Y DOS MILLONES ";
                                            }else{

                                                if (cifra3 / 3 == 1 && cifra3 % 3 == 0){
                                                    text1 = "OCHOCIENTOS SESENTA Y TRES MILLONES ";
                                                }else{
                                                    if (cifra3 / 4 == 1 && cifra3 % 4 == 0){
                                                        text1 = "OCHOCIENTOS SESENTA Y CUATRO MILLONES ";
                                                    }else{
                                                        if (cifra3 / 5 == 1 && cifra3 % 5 == 0){
                                                            text1 = "OCHOCIENTOS SESENTA Y CINCO MILLONES ";
                                                        }else{
                                                            if (cifra3 / 6 == 1 && cifra3 % 6 == 0){
                                                                text1 = "OCHOCIENTOS SESENTA Y SEIS  MILLONES ";
                                                            }else{
                                                                if (cifra3 / 7 == 1 && cifra3 % 7 == 0){
                                                                    text1 = "OCHOCIENTOS SESENTA Y SIETE MILLONES ";
                                                                }else{
                                                                    if (cifra3 / 8 == 1 && cifra3 % 8 == 0){
                                                                        text1 = "OCHOCIENTOS SESENTA Y OCHO MILLONES ";
                                                                    }else{
                                                                        if (cifra3 / 9 == 1 && cifra3 % 9 == 0){
                                                                            text1 = "OCHOCIENTOS SESENTA Y NUEVE MILLONES ";
                                                                        }else{
                                                                            text1 = "OCHOCIENTOS SESENTA Y UN MILLONES ";
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
                                        if (cifra2 / 7 == 1 && cifra2 % 7 == 0){

                                            if (cifra3 < 1){
                                                text1 = "OCHOCIENTOS SETENTA MILLONES ";

                                            }else{
                                                if (cifra3 / 2 == 1 && cifra3 % 2 == 0){
                                                    text1 = "OCHOCIENTOS SETENTA Y DOS MILLONES ";
                                                }else{

                                                    if (cifra3 / 3 == 1 && cifra3 % 3 == 0){
                                                        text1 = "OCHOCIENTOS SETENTA Y TRES MILLONES ";
                                                    }else{
                                                        if (cifra3 / 4 == 1 && cifra3 % 4 == 0){
                                                            text1 = "OCHOCIENTOS SETENTA Y CUATRO MILLONES ";
                                                        }else{
                                                            if (cifra3 / 5 == 1 && cifra3 % 5 == 0){
                                                                text1 = "OCHOCIENTOS SETENTA Y CINCO MILLONES ";
                                                            }else{
                                                                if (cifra3 / 6 == 1 && cifra3 % 6 == 0){
                                                                    text1 = "OCHOCIENTOS SETENTA Y SEIS  MILLONES ";
                                                                }else{
                                                                    if (cifra3 / 7 == 1 && cifra3 % 7 == 0){
                                                                        text1 = "OCHOCIENTOS SETENTA Y SIETE MILLONES ";
                                                                    }else{
                                                                        if (cifra3 / 8 == 1 && cifra3 % 8 == 0){
                                                                            text1 = "OCHOCIENTOS SETENTA Y OCHO MILLONES ";
                                                                        }else{
                                                                            if (cifra3 / 9 == 1 && cifra3 % 9 == 0){
                                                                                text1 = "OCHOCIENTOS SETENTA Y NUEVE MILLONES ";
                                                                            }else{
                                                                                text1 = "OCHOCIENTOS SETENTA Y UN MILLONES ";
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
                                            if (cifra2 / 8 == 1 && cifra2 % 8 == 0){

                                                if (cifra3 < 1){
                                                    text1 = "OCHOCIENTOS OCHENTA MILLONES ";

                                                }else{
                                                    if (cifra3 / 2 == 1 && cifra3 % 2 == 0){
                                                        text1 = "OCHOCIENTOS OCHENTA Y DOS MILLONES ";
                                                    }else{

                                                        if (cifra3 / 3 == 1 && cifra3 % 3 == 0){
                                                            text1 = "OCHOCIENTOS OCHENTA Y TRES MILLONES ";
                                                        }else{
                                                            if (cifra3 / 4 == 1 && cifra3 % 4 == 0){
                                                                text1 = "OCHOCIENTOS OCHENTA Y CUATRO MILLONES ";
                                                            }else{
                                                                if (cifra3 / 5 == 1 && cifra3 % 5 == 0){
                                                                    text1 = "OCHOCIENTOS OCHENTA Y CINCO MILLONES ";
                                                                }else{
                                                                    if (cifra3 / 6 == 1 && cifra3 % 6 == 0){
                                                                        text1 = "OCHOCIENTOS OCHENTA Y SEIS  MILLONES ";
                                                                    }else{
                                                                        if (cifra3 / 7 == 1 && cifra3 % 7 == 0){
                                                                            text1 = "OCHOCIENTOS OCHENTA Y SIETE MILLONES ";
                                                                        }else{
                                                                            if (cifra3 / 8 == 1 && cifra3 % 8 == 0){
                                                                                text1 = "OCHOCIENTOS OCHENTA Y OCHO MILLONES ";
                                                                            }else{
                                                                                if (cifra3 / 9 == 1 && cifra3 % 9 == 0){
                                                                                    text1 = "OCHOCIENTOS OCHENTA Y NUEVE MILLONES ";
                                                                                }else{
                                                                                    text1 = "OCHOCIENTOS OCHENTA Y UN MILLONES ";
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
                                                if (cifra2 / 9 == 1 && cifra2 % 9 == 0){

                                                    if (cifra3 < 1){
                                                        text1 = "OCHOCIENTOS NOVENTA MILLONES ";

                                                    }else{
                                                        if (cifra3 / 2 == 1 && cifra3 % 2 == 0){
                                                            text1 = "OCHOCIENTOS NOVENTA Y DOS MILLONES ";
                                                        }else{

                                                            if (cifra3 / 3 == 1 && cifra3 % 3 == 0){
                                                                text1 = "OCHOCIENTOS NOVENTA Y TRES MILLONES ";
                                                            }else{
                                                                if (cifra3 / 4 == 1 && cifra3 % 4 == 0){
                                                                    text1 = "OCHOCIENTOS NOVENTA Y CUATRO MILLONES ";
                                                                }else{
                                                                    if (cifra3 / 5 == 1 && cifra3 % 5 == 0){
                                                                        text1 = "OCHOCIENTOS NOVENTA Y CINCO MILLONES ";
                                                                    }else{
                                                                        if (cifra3 / 6 == 1 && cifra3 % 6 == 0){
                                                                            text1 = "OCHOCIENTOS NOVENTA Y SEIS  MILLONES ";
                                                                        }else{
                                                                            if (cifra3 / 7 == 1 && cifra3 % 7 == 0){
                                                                                text1 = "OCHOCIENTOS NOVENTA Y SIETE MILLONES ";
                                                                            }else{
                                                                                if (cifra3 / 8 == 1 && cifra3 % 8 == 0){
                                                                                    text1 = "OCHOCIENTOS NOVENTA Y OCHO MILLONES ";
                                                                                }else{
                                                                                    if (cifra3 / 9 == 1 && cifra3 % 9 == 0){
                                                                                        text1 = "OCHOCIENTOS NOVENTA Y NUEVE MILLONES ";
                                                                                    }else{
                                                                                        text1 = "OCHOCIENTOS NOVENTA Y UN MILLONES ";
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
                                                    if (cifra2 < 1){

                                                        if (cifra3 < 1){
                                                            text1 = "OCHOCIENTOS MILLONES ";
                                                        }else{
                                                            if (cifra3 / 2 == 1 && cifra3 % 2 == 0){
                                                                text1 = "OCHOCIENTOS DOS MILLONES ";
                                                            }else{
                                                                if (cifra3 / 3 == 1 && cifra3 % 3 == 0){
                                                                    text1 = "OCHOCIENTOS TRES MILLONES ";
                                                                }else{
                                                                    if (cifra3 / 4 == 1 && cifra3 % 4 == 0){
                                                                        text1 = "OCHOCIENTOS CUATRO MILLONES ";
                                                                    }else{
                                                                        if (cifra3 / 5 == 1 && cifra3 % 5 == 0){
                                                                            text1 = "OCHOCIENTOS CINCO MILLONES ";
                                                                        }else{
                                                                            if (cifra3 / 6 == 1 && cifra3 % 6 == 0){
                                                                                text1 = "OCHOCIENTOS SEIS MILLONES ";
                                                                            }else{
                                                                                if (cifra3 / 7 == 1 && cifra3 % 7 == 0){
                                                                                    text1 = "OCHOCIENTOS SIETE MILLONES ";
                                                                                }else{
                                                                                    if (cifra3 / 8 == 1 && cifra3 % 8 == 0){
                                                                                        text1 = "OCHOCIENTOS OCHO MILLONES ";
                                                                                    }else{
                                                                                        if (cifra3 / 9 == 1 && cifra3 % 9 == 0){
                                                                                            text1 = "OCHOCIENTOS NUEVE MILLONES ";
                                                                                        }else{
                                                                                            text1 = "OCHOCIENTOS UN MILLONES ";
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
                                                        if (cifra3 < 1){
                                                            text1 = "OCHOCIENTOS DIEZ MILLONES ";
                                                        }else{
                                                            if (cifra3 / 2 == 1 && cifra3 % 2 == 0){
                                                                text1 = "OCHOCIENTOS DOCE MILLONES ";
                                                                if (cifra3 / 3 == 1 && cifra3 % 3 == 0){
                                                                        text1 = "OCHOCIENTOS TRECE  MILLONES ";
                                                                }else{
                                                                    if (cifra3 / 4 == 1 && cifra3 % 4 == 0){
                                                                        text1 = "OCHOCIENTOS CATORCE MILLONES ";
                                                                    }else{
                                                                        if (cifra3 / 5 == 1 && cifra3 % 5 == 0){
                                                                            text1 = "OCHOCIENTOS QUINCE MILLONES ";
                                                                        }else{
                                                                            if (cifra3 / 6 == 1 && cifra3 % 6 == 0){
                                                                                text1 = "OCHOCIENTOS DIECISEIS MILLONES ";
                                                                            }else{
                                                                                if (cifra3 / 7 == 1 && cifra3 % 7 == 0){
                                                                                    text1 = "OCHOCIENTOS DIECISIETE MILLONES ";
                                                                                }else{
                                                                                    if (cifra3 / 8 == 1 && cifra3 % 8 == 0){
                                                                                        text1 = "OCHOCIENTOS DIECIOCHO MILLONES ";
                                                                                    }else{
                                                                                        if (cifra3 / 9 == 1 && cifra3 % 9 == 0){
                                                                                            text1 = "OCHOCIENTOS DIECINUEVE MILLONES ";
                                                                                        }else{
                                                                                            text1 = "NOVECIENTO ONCE MILLONES ";
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

                }else{
                    if (digs3 < 800 && digs3 >699){
                        int cifra2 = (digs3 % 100)/10;
                        int cifra3 = digs3 % 10;

                        if (cifra2 / 2 == 1 && cifra2 % 2 == 0){
                            if (cifra3 < 1){
                                
                                text1 = "SETECIENTOS VEINTE MILLONES ";

                            }else{
                                if (cifra3 / 2 == 1 && cifra3 % 2 == 0){
                                    text1 = "SETECIENTOS VEINTIDOS MILLONES ";
                                }else{
                                    if (cifra3 / 3 == 1 && cifra3 % 3 == 0){
                                        text1 = "SETECIENTOS VEINTITRES MILLONES ";
                                    }else{
                                        if (cifra3 / 4 == 1 && cifra3 % 4 == 0){
                                            text1 = "SETECIENTOS VEINTICUATRO MILLONES ";
                                        }else{
                                            if (cifra3 / 5 == 1 && cifra3 % 5 == 0){
                                                text1 = "SETECIENTOS VEINTICINCO MILLONES ";
                                            }else{
                                                if (cifra3 / 6 == 1 && cifra3 % 6 == 0){
                                                    text1 = "SETECIENTOS VEINTISEIS MILLONES ";
                                                }else{
                                                    if (cifra3 / 7 == 1 && cifra3 % 7 == 0){
                                                        text1 = "SETECIENTOS VEINTISIETE MILLONES ";
                                                    }else{
                                                        if (cifra3 / 8 == 1 && cifra3 % 8 == 0){
                                                            text1 = "SETECIENTOS VEINTIOCHO MILLONES ";
                                                        }else{
                                                            if (cifra3 / 9 == 1 && cifra3 % 9 == 0){
                                                                text1 = "SETECIENTOS VEINTINUEVE MILLONES ";
                                                            }else{
                                                                text1 = "SETECIENTOS VEINTIUN MILLONES ";
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
                            if (cifra2 / 3 == 1 && cifra2 % 3 == 0){

                                if (cifra3 < 1){
                                    
                                    text1 = "SETECIENTOS TREINTA MILLONES ";

                                }else{

                                    if (cifra3 / 2 == 1 && cifra3 % 2 == 0){
                                        text1 = "SETECIENTOS TREINTA Y DOS MILLONES ";
                                    }else{
                                        if (cifra3 / 3 == 1 && cifra3 % 3 == 0){
                                            text1 = "SETECIENTOS TREINTA Y TRES MILLONES ";
                                        }else{
                                            if (cifra3 / 4 == 1 && cifra3 % 4 == 0){
                                                text1 = "SETECIENTOS TREINTA Y CUATRO MILLONES ";
                                            }else{
                                                if (cifra3 / 5 == 1 && cifra3 % 5 == 0){
                                                    text1 = "SETECIENTOS TREINTA Y CINCO MILLONES ";
                                                }else{
                                                    if (cifra3 / 6 == 1 && cifra3 % 6 == 0){
                                                        text1 = "SETECIENTOS TREINTA Y SEIS  MILLONES ";
                                                    }else{
                                                        if (cifra3 / 7 == 1 && cifra3 % 7 == 0){
                                                            text1 = "SETECIENTOS TREINTA Y SIETE MILLONES ";
                                                        }else{
                                                            if (cifra3 / 8 == 1 && cifra3 % 8 == 0){
                                                                text1 = "SETECIENTOS TREINTA Y OCHO MILLONES ";
                                                            }else{
                                                                if (cifra3 / 9 == 1 && cifra3 % 9 == 0){
                                                                    text1 = "SETECIENTOS TREINTA Y NUEVE MILLONES ";
                                                                }else{
                                                                    text1 = "SETECIENTOS TREINTA Y UN MILLONES ";
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
                                if (cifra2 / 4 == 1 && cifra2 % 4 == 0){

                                    if (cifra3 < 1){
                                        
                                        text1 = "SETECIENTOS CUARENTA MILLONES ";

                                    }else{

                                        if (cifra3 / 2 == 1 && cifra3 % 2 == 0){
                                            text1 = "SETECIENTOS CUARENTA Y DOS MILLONES ";
                                        }else{

                                            if (cifra3 / 3 == 1 && cifra3 % 3 == 0){
                                                text1 = "SETECIENTOS CUARENTA Y TRES MILLONES ";
                                            }else{
                                                if (cifra3 / 4 == 1 && cifra3 % 4 == 0){
                                                    text1 = "SETECIENTOS CUARENTA Y CUATRO MILLONES ";
                                                }else{
                                                    if (cifra3 / 5 == 1 && cifra3 % 5 == 0){
                                                        text1 = "SETECIENTOS CUARENTA Y CINCO MILLONES ";
                                                    }else{
                                                        if (cifra3 / 6 == 1 && cifra3 % 6 == 0){
                                                            text1 = "SETECIENTOS CUARENTA Y SEIS  MILLONES ";
                                                        }else{
                                                            if (cifra3 / 7 == 1 && cifra3 % 7 == 0){
                                                                text1 = "SETECIENTOS CUARENTA Y SIETE MILLONES ";
                                                            }else{
                                                                if (cifra3 / 8 == 1 && cifra3 % 8 == 0){
                                                                    text1 = "SETECIENTOS CUARENTA Y OCHO MILLONES ";
                                                                }else{
                                                                    if (cifra3 / 9 == 1 && cifra3 % 9 == 0){
                                                                        text1 = "SETECIENTOS CUARENTA Y NUEVE MILLONES ";
                                                                    }else{
                                                                        text1 = "SETECIENTOS CUARENTA Y UN MILLONES ";
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

                                    if (cifra2 / 5 == 1 && cifra2 % 5 == 0){

                                        if (cifra3 < 1){
                                            
                                            text1 = "SETECIENTOS CINCUENTA MILLONES ";

                                        }else{

                                            if (cifra3 / 2 == 1 && cifra3 % 2 == 0){
                                                text1 = "SETECIENTOS CINCUENTA Y DOS MILLONES ";
                                            }else{

                                                if (cifra3 / 3 == 1 && cifra3 % 3 == 0){
                                                    text1 = "SETECIENTOS CINCUENTA Y TRES MILLONES ";
                                                }else{
                                                    if (cifra3 / 4 == 1 && cifra3 % 4 == 0){
                                                        text1 = "SETECIENTOS CINCUENTA Y CUATRO MILLONES ";
                                                    }else{
                                                        if (cifra3 / 5 == 1 && cifra3 % 5 == 0){
                                                            text1 = "SETECIENTOS CINCUENTA Y CINCO MILLONES ";
                                                        }else{
                                                            if (cifra3 / 6 == 1 && cifra3 % 6 == 0){
                                                                text1 = "SETECIENTOS CINCUENTA Y SEIS  MILLONES ";
                                                            }else{
                                                                if (cifra3 / 7 == 1 && cifra3 % 7 == 0){
                                                                    text1 = "SETECIENTOS CINCUENTA Y SIETE MILLONES ";
                                                                }else{
                                                                    if (cifra3 / 8 == 1 && cifra3 % 8 == 0){
                                                                        text1 = "SETECIENTOS CINCUENTA Y OCHO MILLONES ";
                                                                    }else{
                                                                        if (cifra3 / 9 == 1 && cifra3 % 9 == 0){
                                                                            text1 = "SETECIENTOS CINCUENTA Y NUEVE MILLONES ";
                                                                        }else{
                                                                            text1 = "SETECIENTOS CINCUENTA Y UN MILLONES ";
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
                                        if (cifra2 / 6 == 1 && cifra2 % 6 == 0){
                                            
                                            if (cifra3 < 1){
                                                        
                                                text1 = "SETECIENTOS SESENTA MILLONES ";

                                            }else{
                                                if (cifra3 / 2 == 1 && cifra3 % 2 == 0){
                                                    text1 = "SETECIENTOS SESENTA Y DOS MILLONES ";
                                                }else{

                                                    if (cifra3 / 3 == 1 && cifra3 % 3 == 0){
                                                        text1 = "SETECIENTOS SESENTA Y TRES MILLONES ";
                                                    }else{
                                                        if (cifra3 / 4 == 1 && cifra3 % 4 == 0){
                                                            text1 = "SETECIENTOS SESENTA Y CUATRO MILLONES ";
                                                        }else{
                                                            if (cifra3 / 5 == 1 && cifra3 % 5 == 0){
                                                                text1 = "SETECIENTOS SESENTA Y CINCO MILLONES ";
                                                            }else{
                                                                if (cifra3 / 6 == 1 && cifra3 % 6 == 0){
                                                                    text1 = "SETECIENTOS SESENTA Y SEIS  MILLONES ";
                                                                }else{
                                                                    if (cifra3 / 7 == 1 && cifra3 % 7 == 0){
                                                                        text1 = "SETECIENTOS SESENTA Y SIETE MILLONES ";
                                                                    }else{
                                                                        if (cifra3 / 8 == 1 && cifra3 % 8 == 0){
                                                                            text1 = "SETECIENTOS SESENTA Y OCHO MILLONES ";
                                                                        }else{
                                                                            if (cifra3 / 9 == 1 && cifra3 % 9 == 0){
                                                                                text1 = "SETECIENTOS SESENTA Y NUEVE MILLONES ";
                                                                            }else{
                                                                                text1 = "SETECIENTOS SESENTA Y UN MILLONES ";
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
                                            if (cifra2 / 7 == 1 && cifra2 % 7 == 0){

                                                if (cifra3 < 1){
                                                    text1 = "SETECIENTOS SETENTA MILLONES ";

                                                }else{
                                                    if (cifra3 / 2 == 1 && cifra3 % 2 == 0){
                                                        text1 = "SETECIENTOS SETENTA Y DOS MILLONES ";
                                                    }else{

                                                        if (cifra3 / 3 == 1 && cifra3 % 3 == 0){
                                                            text1 = "SETECIENTOS SETENTA Y TRES MILLONES ";
                                                        }else{
                                                            if (cifra3 / 4 == 1 && cifra3 % 4 == 0){
                                                                text1 = "SETECIENTOS SETENTA Y CUATRO MILLONES ";
                                                            }else{
                                                                if (cifra3 / 5 == 1 && cifra3 % 5 == 0){
                                                                    text1 = "SETECIENTOS SETENTA Y CINCO MILLONES ";
                                                                }else{
                                                                    if (cifra3 / 6 == 1 && cifra3 % 6 == 0){
                                                                        text1 = "SETECIENTOS SETENTA Y SEIS  MILLONES ";
                                                                    }else{
                                                                        if (cifra3 / 7 == 1 && cifra3 % 7 == 0){
                                                                            text1 = "SETECIENTOS SETENTA Y SIETE MILLONES ";
                                                                        }else{
                                                                            if (cifra3 / 8 == 1 && cifra3 % 8 == 0){
                                                                                text1 = "SETECIENTOS SETENTA Y OCHO MILLONES ";
                                                                            }else{
                                                                                if (cifra3 / 9 == 1 && cifra3 % 9 == 0){
                                                                                    text1 = "SETECIENTOS SETENTA Y NUEVE MILLONES ";
                                                                                }else{
                                                                                    text1 = "SETECIENTOS SETENTA Y UN MILLONES ";
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
                                                if (cifra2 / 8 == 1 && cifra2 % 8 == 0){

                                                    if (cifra3 < 1){
                                                        text1 = "SETECIENTOS OCHENTA MILLONES ";

                                                    }else{
                                                        if (cifra3 / 2 == 1 && cifra3 % 2 == 0){
                                                            text1 = "SETECIENTOS OCHENTA Y DOS MILLONES ";
                                                        }else{

                                                            if (cifra3 / 3 == 1 && cifra3 % 3 == 0){
                                                                text1 = "SETECIENTOS OCHENTA Y TRES MILLONES ";
                                                            }else{
                                                                if (cifra3 / 4 == 1 && cifra3 % 4 == 0){
                                                                    text1 = "SETECIENTOS OCHENTA Y CUATRO MILLONES ";
                                                                }else{
                                                                    if (cifra3 / 5 == 1 && cifra3 % 5 == 0){
                                                                        text1 = "SETECIENTOS OCHENTA Y CINCO MILLONES ";
                                                                    }else{
                                                                        if (cifra3 / 6 == 1 && cifra3 % 6 == 0){
                                                                            text1 = "SETECIENTOS OCHENTA Y SEIS  MILLONES ";
                                                                        }else{
                                                                            if (cifra3 / 7 == 1 && cifra3 % 7 == 0){
                                                                                text1 = "SETECIENTOS OCHENTA Y SIETE MILLONES ";
                                                                            }else{
                                                                                if (cifra3 / 8 == 1 && cifra3 % 8 == 0){
                                                                                    text1 = "SETECIENTOS OCHENTA Y OCHO MILLONES ";
                                                                                }else{
                                                                                    if (cifra3 / 9 == 1 && cifra3 % 9 == 0){
                                                                                        text1 = "SETECIENTOS OCHENTA Y NUEVE MILLONES ";
                                                                                    }else{
                                                                                        text1 = "SETECIENTOS OCHENTA Y UN MILLONES ";
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
                                                    if (cifra2 / 9 == 1 && cifra2 % 9 == 0){

                                                        if (cifra3 < 1){
                                                            text1 = "SETECIENTOS NOVENTA MILLONES ";

                                                        }else{
                                                            if (cifra3 / 2 == 1 && cifra3 % 2 == 0){
                                                                text1 = "SETECIENTOS NOVENTA Y DOS MILLONES ";
                                                            }else{

                                                                if (cifra3 / 3 == 1 && cifra3 % 3 == 0){
                                                                    text1 = "SETECIENTOS NOVENTA Y TRES MILLONES ";
                                                                }else{
                                                                    if (cifra3 / 4 == 1 && cifra3 % 4 == 0){
                                                                        text1 = "SETECIENTOS NOVENTA Y CUATRO MILLONES ";
                                                                    }else{
                                                                        if (cifra3 / 5 == 1 && cifra3 % 5 == 0){
                                                                            text1 = "SETECIENTOS NOVENTA Y CINCO MILLONES ";
                                                                        }else{
                                                                            if (cifra3 / 6 == 1 && cifra3 % 6 == 0){
                                                                                text1 = "SETECIENTOS NOVENTA Y SEIS  MILLONES ";
                                                                            }else{
                                                                                if (cifra3 / 7 == 1 && cifra3 % 7 == 0){
                                                                                    text1 = "SETECIENTOS NOVENTA Y SIETE MILLONES ";
                                                                                }else{
                                                                                    if (cifra3 / 8 == 1 && cifra3 % 8 == 0){
                                                                                        text1 = "SETECIENTOS NOVENTA Y OCHO MILLONES ";
                                                                                    }else{
                                                                                        if (cifra3 / 9 == 1 && cifra3 % 9 == 0){
                                                                                            text1 = "SETECIENTOS NOVENTA Y NUEVE MILLONES ";
                                                                                        }else{
                                                                                            text1 = "SETECIENTOS NOVENTA Y UN MILLONES ";
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
                                                        if (cifra2 < 1){

                                                            if (cifra3 < 1){
                                                                text1 = "SETECIENTOS MILLONES ";
                                                            }else{
                                                                if (cifra3 / 2 == 1 && cifra3 % 2 == 0){
                                                                    text1 = "SETECIENTOS DOS MILLONES ";
                                                                }else{
                                                                    if (cifra3 / 3 == 1 && cifra3 % 3 == 0){
                                                                        text1 = "SETECIENTOS TRES MILLONES ";
                                                                    }else{
                                                                        if (cifra3 / 4 == 1 && cifra3 % 4 == 0){
                                                                            text1 = "SETECIENTOS CUATRO MILLONES ";
                                                                        }else{
                                                                            if (cifra3 / 5 == 1 && cifra3 % 5 == 0){
                                                                                text1 = "SETECIENTOS CINCO MILLONES ";
                                                                            }else{
                                                                                if (cifra3 / 6 == 1 && cifra3 % 6 == 0){
                                                                                    text1 = "SETECIENTOS SEIS MILLONES ";
                                                                                }else{
                                                                                    if (cifra3 / 7 == 1 && cifra3 % 7 == 0){
                                                                                        text1 = "SETECIENTOS SIETE MILLONES ";
                                                                                    }else{
                                                                                        if (cifra3 / 8 == 1 && cifra3 % 8 == 0){
                                                                                            text1 = "SETECIENTOS OCHO MILLONES ";
                                                                                        }else{
                                                                                            if (cifra3 / 9 == 1 && cifra3 % 9 == 0){
                                                                                                text1 = "SETECIENTOS NUEVE MILLONES ";
                                                                                            }else{
                                                                                                text1 = "SETECIENTOS UN MILLONES ";
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
                                                            if (cifra3 < 1){
                                                                text1 = "SETECIENTOS DIEZ MILLONES ";
                                                            }else{
                                                                if (cifra3 / 2 == 1 && cifra3 % 2 == 0){
                                                                    text1 = "SETECIENTOS DOCE MILLONES ";
                                                                    if (cifra3 / 3 == 1 && cifra3 % 3 == 0){
                                                                            text1 = "SETECIENTOS TRECE  MILLONES ";
                                                                    }else{
                                                                        if (cifra3 / 4 == 1 && cifra3 % 4 == 0){
                                                                            text1 = "SETECIENTOS CATORCE MILLONES ";
                                                                        }else{
                                                                            if (cifra3 / 5 == 1 && cifra3 % 5 == 0){
                                                                                text1 = "SETECIENTOS QUINCE MILLONES ";
                                                                            }else{
                                                                                if (cifra3 / 6 == 1 && cifra3 % 6 == 0){
                                                                                    text1 = "SETECIENTOS DIECISEIS MILLONES ";
                                                                                }else{
                                                                                    if (cifra3 / 7 == 1 && cifra3 % 7 == 0){
                                                                                        text1 = "SETECIENTOS DIECISIETE MILLONES ";
                                                                                    }else{
                                                                                        if (cifra3 / 8 == 1 && cifra3 % 8 == 0){
                                                                                            text1 = "SETECIENTOS DIECIOCHO MILLONES ";
                                                                                        }else{
                                                                                            if (cifra3 / 9 == 1 && cifra3 % 9 == 0){
                                                                                                text1 = "SETECIENTOS DIECINUEVE MILLONES ";
                                                                                            }else{
                                                                                                text1 = "NOVECIENTO ONCE MILLONES ";
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

                    }else{

                    }    
                }
            }

            if (digs2 > 900){

                int cifra4 = (digs2 % 100)/10;
                int cifra5 = digs2 % 10;

                if (cifra4 / 2 == 1 && cifra4 % 2 == 0){
                    if (cifra5 < 1){
                        
                        text2 = "NOVECIENTOS VEINTE MIL ";

                    }else{
                        if (cifra5 / 2 == 1 && cifra5 % 2 == 0){
                            text2 = "NOVECIENTOS VEINTIDOS MIL ";
                        }else{
                            if (cifra5 / 3 == 1 && cifra5 % 3 == 0){
                                text2 = "NOVECIENTOS VEINTITRES MIL ";
                            }else{
                                if (cifra5 / 4 == 1 && cifra5 % 4 == 0){
                                    text2 = "NOVECIENTOS VEINTICUATRO MIL ";
                                }else{
                                    if (cifra5 / 5 == 1 && cifra5 % 5 == 0){
                                        text2 = "NOVECIENTOS VEINTICINCO MIL ";
                                    }else{
                                        if (cifra5 / 6 == 1 && cifra5 % 6 == 0){
                                            text2 = "NOVECIENTOS VEINTISEIS MIL ";
                                        }else{
                                            if (cifra5 / 7 == 1 && cifra5 % 7 == 0){
                                                text2 = "NOVECIENTOS VEINTISIETE MIL ";
                                            }else{
                                                if (cifra5 / 8 == 1 && cifra5 % 8 == 0){
                                                    text2 = "NOVECIENTOS VEINTIOCHO MIL ";
                                                }else{
                                                    if (cifra5 / 9 == 1 && cifra5 % 9 == 0){
                                                        text2 = "NOVECIENTOS VEINTINUEVE MIL ";
                                                    }else{
                                                        text2 = "NOVECIENTOS VEINTIUN MIL ";
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
                    if (cifra4 / 3 == 1 && cifra4 % 3 == 0){

                        if (cifra5 < 1){
                            
                            text2 = "NOVECIENTOS TREINTA MIL ";

                        }else{

                            if (cifra5 / 2 == 1 && cifra5 % 2 == 0){
                                text2 = "NOVECIENTOS TREINTA Y DOS MIL ";
                            }else{
                                if (cifra5 / 3 == 1 && cifra5 % 3 == 0){
                                    text2 = "NOVECIENTOS TREINTA Y TRES MIL ";
                                }else{
                                    if (cifra5 / 4 == 1 && cifra5 % 4 == 0){
                                        text2 = "NOVECIENTOS TREINTA Y CUATRO MIL ";
                                    }else{
                                        if (cifra5 / 5 == 1 && cifra5 % 5 == 0){
                                            text2 = "NOVECIENTOS TREINTA Y CINCO MIL ";
                                        }else{
                                            if (cifra5 / 6 == 1 && cifra5 % 6 == 0){
                                                text2 = "NOVECIENTOS TREINTA Y SEIS MIL ";
                                            }else{
                                                if (cifra5 / 7 == 1 && cifra5 % 7 == 0){
                                                    text2 = "NOVECIENTOS TREINTA Y SIETE MIL ";
                                                }else{
                                                    if (cifra5 / 8 == 1 && cifra5 % 8 == 0){
                                                        text2 = "NOVECIENTOS TREINTA Y OCHO MIL ";
                                                    }else{
                                                        if (cifra5 / 9 == 1 && cifra5 % 9 == 0){
                                                            text2 = "NOVECIENTOS TREINTA Y NUEVE MIL ";
                                                        }else{
                                                            text2 = "NOVECIENTOS TREINTA Y UN MIL ";
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
                        if (cifra4 / 4 == 1 && cifra4 % 4 == 0){

                            if (cifra5 < 1){
                                
                                text2 = "NOVECIENTOS CUARENTA MIL ";

                            }else{

                                if (cifra5 / 2 == 1 && cifra5 % 2 == 0){
                                    text2 = "NOVECIENTOS CUARENTA Y DOS MIL ";
                                }else{
                                    if (cifra5 / 3 == 1 && cifra5 % 3 == 0){
                                        text2 = "NOVECIENTOS CUARENTA Y TRES MIL ";
                                    }else{
                                        if (cifra5 / 4 == 1 && cifra5 % 4 == 0){
                                            text2 = "NOVECIENTOS CUARENTA Y CUATRO MIL ";
                                        }else{
                                            if (cifra5 / 5 == 1 && cifra5 % 5 == 0){
                                                text2 = "NOVECIENTOS CUARENTA Y CINCO MIL ";
                                            }else{
                                                if (cifra5 / 6 == 1 && cifra5 % 6 == 0){
                                                    text2 = "NOVECIENTOS CUARENTA Y SEIS MIL ";
                                                }else{
                                                    if (cifra5 / 7 == 1 && cifra5 % 7 == 0){
                                                        text2 = "NOVECIENTOS CUARENTA Y SIETE MIL ";
                                                    }else{
                                                        if (cifra5 / 8 == 1 && cifra5 % 8 == 0){
                                                            text2 = "NOVECIENTOS CUARENTA Y OCHO MIL ";
                                                        }else{
                                                            if (cifra5 / 9 == 1 && cifra5 % 9 == 0){
                                                                text2 = "NOVECIENTOS CUARENTA Y NUEVE MIL ";
                                                            }else{
                                                                text2 = "NOVECIENTOS CUARENTA Y UN MIL ";
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

                            if (cifra4 / 5 == 1 && cifra4 % 5 == 0){

                                if (cifra5 < 1){
                                    
                                    text2 = "NOVECIENTOS CINCUENTA MIL ";

                                }else{

                                    if (cifra5 / 2 == 1 && cifra5 % 2 == 0){
                                        text2 = "NOVECIENTOS CINCUENTA Y DOS MIL ";
                                    }else{
                                        if (cifra5 / 3 == 1 && cifra5 % 3 == 0){
                                            text2 = "NOVECIENTOS CINCUENTA Y TRES MIL ";
                                        }else{
                                            if (cifra5 / 4 == 1 && cifra5 % 4 == 0){
                                                text2 = "NOVECIENTOS CINCUENTA Y CUATRO MIL ";
                                            }else{
                                                if (cifra5 / 5 == 1 && cifra5 % 5 == 0){
                                                    text2 = "NOVECIENTOS CINCUENTA Y CINCO MIL ";
                                                }else{
                                                    if (cifra5 / 6 == 1 && cifra5 % 6 == 0){
                                                        text2 = "NOVECIENTOS CINCUENTA Y SEIS MIL ";
                                                    }else{
                                                        if (cifra5 / 7 == 1 && cifra5 % 7 == 0){
                                                            text2 = "NOVECIENTOS CINCUENTA Y SIETE MIL ";
                                                        }else{
                                                            if (cifra5 / 8 == 1 && cifra5 % 8 == 0){
                                                                text2 = "NOVECIENTOS CINCUENTA Y OCHO MIL ";
                                                            }else{
                                                                if (cifra5 / 9 == 1 && cifra5 % 9 == 0){
                                                                    text2 = "NOVECIENTOS CINCUENTA Y NUEVE MIL ";
                                                                }else{
                                                                    text2 = "NOVECIENTOS CINCUENTA Y UN MIL ";
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
                                if (cifra4 / 6 == 1 && cifra4 % 6 == 0){
                                    
                                    if (cifra5 < 1){
                                                
                                        text2 = "NOVECIENTOS SESENTA MIL ";

                                    }else{

                                        if (cifra5 / 2 == 1 && cifra5 % 2 == 0){
                                            text2 = "NOVECIENTOS SESENTA Y DOS MIL ";
                                        }else{
                                            if (cifra5 / 3 == 1 && cifra5 % 3 == 0){
                                                text2 = "NOVECIENTOS SESENTA Y TRES MIL ";
                                            }else{
                                                if (cifra5 / 4 == 1 && cifra5 % 4 == 0){
                                                    text2 = "NOVECIENTOS SESENTA Y CUATRO MIL ";
                                                }else{
                                                    if (cifra5 / 5 == 1 && cifra5 % 5 == 0){
                                                        text2 = "NOVECIENTOS SESENTA Y CINCO MIL ";
                                                    }else{
                                                        if (cifra5 / 6 == 1 && cifra5 % 6 == 0){
                                                            text2 = "NOVECIENTOS SESENTA Y SEIS MIL ";
                                                        }else{
                                                            if (cifra5 / 7 == 1 && cifra5 % 7 == 0){
                                                                text2 = "NOVECIENTOS SESENTA Y SIETE MIL ";
                                                            }else{
                                                                if (cifra5 / 8 == 1 && cifra5 % 8 == 0){
                                                                    text2 = "NOVECIENTOS SESENTA Y OCHO MIL ";
                                                                }else{
                                                                    if (cifra5 / 9 == 1 && cifra5 % 9 == 0){
                                                                        text2 = "NOVECIENTOS SESENTA Y NUEVE MIL ";
                                                                    }else{
                                                                        text2 = "NOVECIENTOS SESENTA Y UN MIL ";
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
                                    if (cifra4 / 7 == 1 && cifra4 % 7 == 0){

                                        if (cifra5 < 1){
                                            text2 = "NOVECIENTOS SETENTA MIL ";

                                        }else{

                                            if (cifra5 / 2 == 1 && cifra5 % 2 == 0){
                                                text2 = "NOVECIENTOS SETENTA Y DOS MIL ";
                                            }else{
                                                if (cifra5 / 3 == 1 && cifra5 % 3 == 0){
                                                    text2 = "NOVECIENTOS SETENTA Y TRES MIL ";
                                                }else{
                                                    if (cifra5 / 4 == 1 && cifra5 % 4 == 0){
                                                        text2 = "NOVECIENTOS SETENTA Y CUATRO MIL ";
                                                    }else{
                                                        if (cifra5 / 5 == 1 && cifra5 % 5 == 0){
                                                            text2 = "NOVECIENTOS SETENTA Y CINCO MIL ";
                                                        }else{
                                                            if (cifra5 / 6 == 1 && cifra5 % 6 == 0){
                                                                text2 = "NOVECIENTOS SETENTA Y SEIS MIL ";
                                                            }else{
                                                                if (cifra5 / 7 == 1 && cifra5 % 7 == 0){
                                                                    text2 = "NOVECIENTOS SETENTA Y SIETE MIL ";
                                                                }else{
                                                                    if (cifra5 / 8 == 1 && cifra5 % 8 == 0){
                                                                        text2 = "NOVECIENTOS SETENTA Y OCHO MIL ";
                                                                    }else{
                                                                        if (cifra5 / 9 == 1 && cifra5 % 9 == 0){
                                                                            text2 = "NOVECIENTOS SETENTA Y NUEVE MIL ";
                                                                        }else{
                                                                            text2 = "NOVECIENTOS SETENTA Y UN MIL ";
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
                                        if (cifra4 / 8 == 1 && cifra4 % 8 == 0){

                                            if (cifra5 < 1){
                                                    text2 = "NOVECIENTOS OCHENTA MIL ";

                                            }else{

                                                if (cifra5 / 2 == 1 && cifra5 % 2 == 0){
                                                    text2 = "NOVECIENTOS OCHENTA Y DOS MIL ";
                                                }else{
                                                    if (cifra5 / 3 == 1 && cifra5 % 3 == 0){
                                                        text2 = "NOVECIENTOS OCHENTA Y TRES MIL ";
                                                    }else{
                                                        if (cifra5 / 4 == 1 && cifra5 % 4 == 0){
                                                            text2 = "NOVECIENTOS OCHENTA Y CUATRO MIL ";
                                                        }else{
                                                            if (cifra5 / 5 == 1 && cifra5 % 5 == 0){
                                                                text2 = "NOVECIENTOS OCHENTA Y CINCO MIL ";
                                                            }else{
                                                                if (cifra5 / 6 == 1 && cifra5 % 6 == 0){
                                                                    text2 = "NOVECIENTOS OCHENTA Y SEIS MIL ";
                                                                }else{
                                                                    if (cifra5 / 7 == 1 && cifra5 % 7 == 0){
                                                                        text2 = "NOVECIENTOS OCHENTA Y SIETE MIL ";
                                                                    }else{
                                                                        if (cifra5 / 8 == 1 && cifra5 % 8 == 0){
                                                                            text2 = "NOVECIENTOS OCHENTA Y OCHO MIL ";
                                                                        }else{
                                                                            if (cifra5 / 9 == 1 && cifra5 % 9 == 0){
                                                                                text2 = "NOVECIENTOS OCHENTA Y NUEVE MIL ";
                                                                            }else{
                                                                                text2 = "NOVECIENTOS OCHENTA Y UN MIL ";
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
                                            if (cifra4 / 9 == 1 && cifra4 % 9 == 0){

                                                if (cifra5 < 1){
                                                    text2 = "NOVECIENTOS NOVENTA MIL ";

                                                }else{
                                                    if (cifra5 / 2 == 1 && cifra5 % 2 == 0){
                                                        text2 = "NOVECIENTOS NOVENTA Y DOS MIL ";
                                                    }else{
                                                        if (cifra5 / 3 == 1 && cifra5 % 3 == 0){
                                                            text2 = "NOVECIENTOS NOVENTA Y TRES MIL ";
                                                        }else{
                                                            if (cifra5 / 4 == 1 && cifra5 % 4 == 0){
                                                                text2 = "NOVECIENTOS NOVENTA Y CUATRO MIL ";
                                                            }else{
                                                                if (cifra5 / 5 == 1 && cifra5 % 5 == 0){
                                                                    text2 = "NOVECIENTOS NOVENTA Y CINCO MIL ";
                                                                }else{
                                                                    if (cifra5 / 6 == 1 && cifra5 % 6 == 0){
                                                                        text2 = "NOVECIENTOS NOVENTA Y SEIS MIL ";
                                                                    }else{
                                                                        if (cifra5 / 7 == 1 && cifra5 % 7 == 0){
                                                                            text2 = "NOVECIENTOS NOVENTA Y SIETE MIL ";
                                                                        }else{
                                                                            if (cifra5 / 8 == 1 && cifra5 % 8 == 0){
                                                                                text2 = "NOVECIENTOS NOVENTA Y OCHO MIL ";
                                                                            }else{
                                                                                if (cifra5 / 9 == 1 && cifra5 % 9 == 0){
                                                                                    text2 = "NOVECIENTOS NOVENTA Y NUEVE MIL ";
                                                                                }else{
                                                                                    text2 = "NOVECIENTOS NOVENTA Y UN MIL ";
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
                                                if (cifra4 < 1){

                                                    if (cifra5 < 1){
                                                        text2 = "NOVECIENTOS MIL ";
                                                    }else{
                                                        if (cifra5 / 2 == 1 && cifra5 % 2 == 0){
                                                            text2 = "NOVECIENTOS DOS MIL ";
                                                        }else{
                                                            if (cifra5 / 3 == 1 && cifra5 % 3 == 0){
                                                                text2 = "NOVECIENTOS TRES MIL ";
                                                            }else{
                                                                if (cifra5 / 4 == 1 && cifra5 % 4 == 0){
                                                                    text2 = "NOVECIENTOS CUATRO MIL ";
                                                                }else{
                                                                    if (cifra5 / 5 == 1 && cifra5 % 5 == 0){
                                                                        text2 = "NOVECIENTOS CINCO MIL ";
                                                                    }else{
                                                                        if (cifra5 / 6 == 1 && cifra5 % 6 == 0){
                                                                            text2 = "NOVECIENTOS SEIS MIL ";
                                                                        }else{
                                                                            if (cifra5 / 7 == 1 && cifra5 % 7 == 0){
                                                                                text2 = "NOVECIENTOS SIETE MIL ";
                                                                            }else{
                                                                                if (cifra5 / 8 == 1 && cifra5 % 8 == 0){
                                                                                    text2 = "NOVECIENTOS OCHO MIL ";
                                                                                }else{
                                                                                    if (cifra5 / 9 == 1 && cifra5 % 9 == 0){
                                                                                        text2 = "NOVECIENTOS NUEVE MIL ";
                                                                                    }else{
                                                                                        text2 = "NOVECIENTOS UN MIL ";
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
                                                    if (cifra5 < 1){
                                                        text2 = "NOVECIENTOS DIEZ MIL ";
                                                    }else{
                                                        if (cifra5 / 2 == 1 && cifra5 % 2 == 0){
                                                            text2 = "NOVECIENTOS DOCE MIL ";
                                                            if (cifra5 / 3 == 1 && cifra5 % 3 == 0){
                                                                    text2 = "NOVECIENTOS TRECE  MIL ";
                                                            }else{
                                                                if (cifra5 / 4 == 1 && cifra5 % 4 == 0){
                                                                    text2 = "NOVECIENTOS CATORCE MIL ";
                                                                }else{
                                                                    if (cifra5 / 5 == 1 && cifra5 % 5 == 0){
                                                                        text2 = "NOVECIENTOS QUINCE MIL ";
                                                                    }else{
                                                                        if (cifra5 / 6 == 1 && cifra5 % 6 == 0){
                                                                            text2 = "NOVECIENTOS DIECISEIS MIL ";
                                                                        }else{
                                                                            if (cifra5 / 7 == 1 && cifra5 % 7 == 0){
                                                                                text2 = "NOVECIENTOS DIECISIETE MIL ";
                                                                            }else{
                                                                                if (cifra5 / 8 == 1 && cifra5 % 8 == 0){
                                                                                    text2 = "NOVECIENTOS DIECIOCHO MIL ";
                                                                                }else{
                                                                                    if (cifra5 / 9 == 1 && cifra5 % 9 == 0){
                                                                                        text2 = "NOVECIENTOS DIECINUEVE MIL ";
                                                                                    }else{
                                                                                        text2 = "NOVECIENTO ONCE MIL ";
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
            }else{

            }

            if (digs1 > 900){

                int cifra2 = (digs1 % 100)/10;
                int cifra3 = digs1 % 10;

                if (cifra2 / 2 == 1 && cifra2 % 2 == 0){
                    if (cifra3 < 1){
                        
                        text3 = "NOVECIENTOS VEINTE ";

                    }else{
                        if (cifra3 / 2 == 1 && cifra3 % 2 == 0){
                            text3 = "NOVECIENTOS VEINTIDOS ";
                        }else{
                            if (cifra3 / 3 == 1 && cifra3 % 3 == 0){
                                text3 = "NOVECIENTOS VEINTITRES ";
                            }else{
                                if (cifra3 / 4 == 1 && cifra3 % 4 == 0){
                                    text3 = "NOVECIENTOS VEINTICUATRO ";
                                }else{
                                    if (cifra3 / 5 == 1 && cifra3 % 5 == 0){
                                        text3 = "NOVECIENTOS VEINTICINCO ";
                                    }else{
                                        if (cifra3 / 6 == 1 && cifra3 % 6 == 0){
                                            text3 = "NOVECIENTOS VEINTISEIS ";
                                        }else{
                                            if (cifra3 / 7 == 1 && cifra3 % 7 == 0){
                                                text3 = "NOVECIENTOS VEINTISIETE ";
                                            }else{
                                                if (cifra3 / 8 == 1 && cifra3 % 8 == 0){
                                                    text3 = "NOVECIENTOS VEINTIOCHO ";
                                                }else{
                                                    if (cifra3 / 9 == 1 && cifra3 % 9 == 0){
                                                        text3 = "NOVECIENTOS VEINTINUEVE ";
                                                    }else{
                                                        text3 = "NOVECIENTOS VEINTIUNO ";
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
                    if (cifra2 / 3 == 1 && cifra2 % 3 == 0){

                        if (cifra3 < 1){
                            
                            text3 = "NOVECIENTOS TREINTA ";

                        }else{

                            if (cifra3 / 2 == 1 && cifra3 % 2 == 0){
                                text3 = "NOVECIENTOS TREINTA Y DOS ";
                            }else{
                                if (cifra3 / 3 == 1 && cifra3 % 3 == 0){
                                    text3 = "NOVECIENTOS TREINTA Y TRES ";
                                }else{
                                    if (cifra3 / 4 == 1 && cifra3 % 4 == 0){
                                        text3 = "NOVECIENTOS TREINTA Y CUATRO ";
                                    }else{
                                        if (cifra3 / 5 == 1 && cifra3 % 5 == 0){
                                            text3 = "NOVECIENTOS TREINTA Y CINCO ";
                                        }else{
                                            if (cifra3 / 6 == 1 && cifra3 % 6 == 0){
                                                text3 = "NOVECIENTOS TREINTA Y SEIS ";
                                            }else{
                                                if (cifra3 / 7 == 1 && cifra3 % 7 == 0){
                                                    text3 = "NOVECIENTOS TREINTA Y SIETE ";
                                                }else{
                                                    if (cifra3 / 8 == 1 && cifra3 % 8 == 0){
                                                        text3 = "NOVECIENTOS TREINTA Y OCHO ";
                                                    }else{
                                                        if (cifra3 / 9 == 1 && cifra3 % 9 == 0){
                                                            text3 = "NOVECIENTOS TREINTA Y NUEVE ";
                                                        }else{
                                                            text3 = "NOVECIENTOS TREINTA Y UNO ";
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
                        if (cifra2 / 4 == 1 && cifra2 % 4 == 0){

                            if (cifra3 < 1){
                                
                                text3 = "NOVECIENTOS CUARENTA ";

                            }else{

                                if (cifra3 / 2 == 1 && cifra3 % 2 == 0){
                                    text3 = "NOVECIENTOS CUARENTA Y DOS ";
                                }else{
                                    if (cifra3 / 3 == 1 && cifra3 % 3 == 0){
                                        text3 = "NOVECIENTOS CUARENTA Y TRES ";
                                    }else{
                                        if (cifra3 / 4 == 1 && cifra3 % 4 == 0){
                                            text3 = "NOVECIENTOS CUARENTA Y CUATRO ";
                                        }else{
                                            if (cifra3 / 5 == 1 && cifra3 % 5 == 0){
                                                text3 = "NOVECIENTOS CUARENTA Y CINCO ";
                                            }else{
                                                if (cifra3 / 6 == 1 && cifra3 % 6 == 0){
                                                    text3 = "NOVECIENTOS CUARENTA Y SEIS ";
                                                }else{
                                                    if (cifra3 / 7 == 1 && cifra3 % 7 == 0){
                                                        text3 = "NOVECIENTOS CUARENTA Y SIETE ";
                                                    }else{
                                                        if (cifra3 / 8 == 1 && cifra3 % 8 == 0){
                                                            text3 = "NOVECIENTOS CUARENTA Y OCHO ";
                                                        }else{
                                                            if (cifra3 / 9 == 1 && cifra3 % 9 == 0){
                                                                text3 = "NOVECIENTOS CUARENTA Y NUEVE ";
                                                            }else{
                                                                text3 = "NOVECIENTOS CUARENTA Y UNO ";
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

                            if (cifra2 / 5 == 1 && cifra2 % 5 == 0){

                                if (cifra3 < 1){
                                    
                                    text3 = "NOVECIENTOS CINCUENTA ";

                                }else{

                                    if (cifra3 / 2 == 1 && cifra3 % 2 == 0){
                                        text3 = "NOVECIENTOS CINCUENTA Y DOS ";
                                    }else{
                                        if (cifra3 / 3 == 1 && cifra3 % 3 == 0){
                                            text3 = "NOVECIENTOS CINCUENTA Y TRES ";
                                        }else{
                                            if (cifra3 / 4 == 1 && cifra3 % 4 == 0){
                                                text3 = "NOVECIENTOS CINCUENTA Y CUATRO ";
                                            }else{
                                                if (cifra3 / 5 == 1 && cifra3 % 5 == 0){
                                                    text3 = "NOVECIENTOS CINCUENTA Y CINCO ";
                                                }else{
                                                    if (cifra3 / 6 == 1 && cifra3 % 6 == 0){
                                                        text3 = "NOVECIENTOS CINCUENTA Y SEIS ";
                                                    }else{
                                                        if (cifra3 / 7 == 1 && cifra3 % 7 == 0){
                                                            text3 = "NOVECIENTOS CINCUENTA Y SIETE ";
                                                        }else{
                                                            if (cifra3 / 8 == 1 && cifra3 % 8 == 0){
                                                                text3 = "NOVECIENTOS CINCUENTA Y OCHO ";
                                                            }else{
                                                                if (cifra3 / 9 == 1 && cifra3 % 9 == 0){
                                                                    text3 = "NOVECIENTOS CINCUENTA Y NUEVE ";
                                                                }else{
                                                                    text3 = "NOVECIENTOS CINCUENTA Y UNO ";
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
                                if (cifra2 / 6 == 1 && cifra2 % 6 == 0){
                                    
                                    if (cifra3 < 1){
                                                
                                        text3 = "NOVECIENTOS SESENTA ";

                                    }else{

                                        if (cifra3 / 2 == 1 && cifra3 % 2 == 0){
                                            text3 = "NOVECIENTOS SESENTA Y DOS ";
                                        }else{
                                            if (cifra3 / 3 == 1 && cifra3 % 3 == 0){
                                                text3 = "NOVECIENTOS SESENTA Y TRES ";
                                            }else{
                                                if (cifra3 / 4 == 1 && cifra3 % 4 == 0){
                                                    text3 = "NOVECIENTOS SESENTA Y CUATRO ";
                                                }else{
                                                    if (cifra3 / 5 == 1 && cifra3 % 5 == 0){
                                                        text3 = "NOVECIENTOS SESENTA Y CINCO ";
                                                    }else{
                                                        if (cifra3 / 6 == 1 && cifra3 % 6 == 0){
                                                            text3 = "NOVECIENTOS SESENTA Y SEIS ";
                                                        }else{
                                                            if (cifra3 / 7 == 1 && cifra3 % 7 == 0){
                                                                text3 = "NOVECIENTOS SESENTA Y SIETE ";
                                                            }else{
                                                                if (cifra3 / 8 == 1 && cifra3 % 8 == 0){
                                                                    text3 = "NOVECIENTOS SESENTA Y OCHO ";
                                                                }else{
                                                                    if (cifra3 / 9 == 1 && cifra3 % 9 == 0){
                                                                        text3 = "NOVECIENTOS SESENTA Y NUEVE ";
                                                                    }else{
                                                                        text3 = "NOVECIENTOS SESENTA Y UNO ";
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
                                    if (cifra2 / 7 == 1 && cifra2 % 7 == 0){

                                        if (cifra3 < 1){
                                            text3 = "NOVECIENTOS SETENTA ";

                                        }else{

                                            if (cifra3 / 2 == 1 && cifra3 % 2 == 0){
                                                text3 = "NOVECIENTOS SETENTA Y DOS ";
                                            }else{
                                                if (cifra3 / 3 == 1 && cifra3 % 3 == 0){
                                                    text3 = "NOVECIENTOS SETENTA Y TRES ";
                                                }else{
                                                    if (cifra3 / 4 == 1 && cifra3 % 4 == 0){
                                                        text3 = "NOVECIENTOS SETENTA Y CUATRO ";
                                                    }else{
                                                        if (cifra3 / 5 == 1 && cifra3 % 5 == 0){
                                                            text3 = "NOVECIENTOS SETENTA Y CINCO ";
                                                        }else{
                                                            if (cifra3 / 6 == 1 && cifra3 % 6 == 0){
                                                                text3 = "NOVECIENTOS SETENTA Y SEIS ";
                                                            }else{
                                                                if (cifra3 / 7 == 1 && cifra3 % 7 == 0){
                                                                    text3 = "NOVECIENTOS SETENTA Y SIETE ";
                                                                }else{
                                                                    if (cifra3 / 8 == 1 && cifra3 % 8 == 0){
                                                                        text3 = "NOVECIENTOS SETENTA Y OCHO ";
                                                                    }else{
                                                                        if (cifra3 / 9 == 1 && cifra3 % 9 == 0){
                                                                            text3 = "NOVECIENTOS SETENTA Y NUEVE ";
                                                                        }else{
                                                                            text3 = "NOVECIENTOS SETENTA Y UNO ";
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
                                        if (cifra2 / 8 == 1 && cifra2 % 8 == 0){

                                            if (cifra3 < 1){
                                                    text3 = "NOVECIENTOS OCHENTA ";

                                            }else{

                                                if (cifra3 / 2 == 1 && cifra3 % 2 == 0){
                                                    text3 = "NOVECIENTOS OCHENTA Y DOS ";
                                                }else{
                                                    if (cifra3 / 3 == 1 && cifra3 % 3 == 0){
                                                        text3 = "NOVECIENTOS OCHENTA Y TRES ";
                                                    }else{
                                                        if (cifra3 / 4 == 1 && cifra3 % 4 == 0){
                                                            text3 = "NOVECIENTOS OCHENTA Y CUATRO ";
                                                        }else{
                                                            if (cifra3 / 5 == 1 && cifra3 % 5 == 0){
                                                                text3 = "NOVECIENTOS OCHENTA Y CINCO ";
                                                            }else{
                                                                if (cifra3 / 6 == 1 && cifra3 % 6 == 0){
                                                                    text3 = "NOVECIENTOS OCHENTA Y SEIS ";
                                                                }else{
                                                                    if (cifra3 / 7 == 1 && cifra3 % 7 == 0){
                                                                        text3 = "NOVECIENTOS OCHENTA Y SIETE ";
                                                                    }else{
                                                                        if (cifra3 / 8 == 1 && cifra3 % 8 == 0){
                                                                            text3 = "NOVECIENTOS OCHENTA Y OCHO ";
                                                                        }else{
                                                                            if (cifra3 / 9 == 1 && cifra3 % 9 == 0){
                                                                                text3 = "NOVECIENTOS OCHENTA Y NUEVE ";
                                                                            }else{
                                                                                text3 = "NOVECIENTOS OCHENTA Y UNO ";
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
                                            if (cifra2 / 9 == 1 && cifra2 % 9 == 0){

                                                if (cifra3 < 1){
                                                    text3 = "NOVECIENTOS NOVENTA ";

                                                }else{
                                                    if (cifra3 / 2 == 1 && cifra3 % 2 == 0){
                                                        text3 = "NOVECIENTOS NOVENTA Y DOS ";
                                                    }else{
                                                        if (cifra3 / 3 == 1 && cifra3 % 3 == 0){
                                                            text3 = "NOVECIENTOS NOVENTA Y TRES ";
                                                        }else{
                                                            if (cifra3 / 4 == 1 && cifra3 % 4 == 0){
                                                                text3 = "NOVECIENTOS NOVENTA Y CUATRO ";
                                                            }else{
                                                                if (cifra3 / 5 == 1 && cifra3 % 5 == 0){
                                                                    text3 = "NOVECIENTOS NOVENTA Y CINCO ";
                                                                }else{
                                                                    if (cifra3 / 6 == 1 && cifra3 % 6 == 0){
                                                                        text3 = "NOVECIENTOS NOVENTA Y SEIS ";
                                                                    }else{
                                                                        if (cifra3 / 7 == 1 && cifra3 % 7 == 0){
                                                                            text3 = "NOVECIENTOS NOVENTA Y SIETE ";
                                                                        }else{
                                                                            if (cifra3 / 8 == 1 && cifra3 % 8 == 0){
                                                                                text3 = "NOVECIENTOS NOVENTA Y OCHO ";
                                                                            }else{
                                                                                if (cifra3 / 9 == 1 && cifra3 % 9 == 0){
                                                                                    text3 = "NOVECIENTOS NOVENTA Y NUEVE ";
                                                                                }else{
                                                                                    text3 = "NOVECIENTOS NOVENTA Y UNO ";
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
                                                if (cifra2 < 1){

                                                    if (cifra3 < 1){
                                                        text3 = "NOVECIENTOS ";
                                                    }else{
                                                        if (cifra3 / 2 == 1 && cifra3 % 2 == 0){
                                                            text3 = "NOVECIENTOS DOS ";
                                                        }else{
                                                            if (cifra3 / 3 == 1 && cifra3 % 3 == 0){
                                                                text3 = "NOVECIENTOS TRES ";
                                                            }else{
                                                                if (cifra3 / 4 == 1 && cifra3 % 4 == 0){
                                                                    text3 = "NOVECIENTOS CUATRO ";
                                                                }else{
                                                                    if (cifra3 / 5 == 1 && cifra3 % 5 == 0){
                                                                        text3 = "NOVECIENTOS CINCO ";
                                                                    }else{
                                                                        if (cifra3 / 6 == 1 && cifra3 % 6 == 0){
                                                                            text3 = "NOVECIENTOS SEIS ";
                                                                        }else{
                                                                            if (cifra3 / 7 == 1 && cifra3 % 7 == 0){
                                                                                text3 = "NOVECIENTOS SIETE ";
                                                                            }else{
                                                                                if (cifra3 / 8 == 1 && cifra3 % 8 == 0){
                                                                                    text3 = "NOVECIENTOS OCHO ";
                                                                                }else{
                                                                                    if (cifra3 / 9 == 1 && cifra3 % 9 == 0){
                                                                                        text3 = "NOVECIENTOS NUEVE ";
                                                                                    }else{
                                                                                        text3 = "NOVECIENTOS UNO ";
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
                                                    if (cifra3 < 1){
                                                        text3 = "NOVECIENTOS DIEZ ";
                                                    }else{
                                                        if (cifra3 / 2 == 1 && cifra3 % 2 == 0){
                                                            text3 = "NOVECIENTOS DOCE ";
                                                            if (cifra3 / 3 == 1 && cifra3 % 3 == 0){
                                                                    text3 = "NOVECIENTOS TRECE  ";
                                                            }else{
                                                                if (cifra3 / 4 == 1 && cifra3 % 4 == 0){
                                                                    text3 = "NOVECIENTOS CATORCE ";
                                                                }else{
                                                                    if (cifra3 / 5 == 1 && cifra3 % 5 == 0){
                                                                        text3 = "NOVECIENTOS QUINCE ";
                                                                    }else{
                                                                        if (cifra3 / 6 == 1 && cifra3 % 6 == 0){
                                                                            text3 = "NOVECIENTOS DIECISEIS ";
                                                                        }else{
                                                                            if (cifra3 / 7 == 1 && cifra3 % 7 == 0){
                                                                                text3 = "NOVECIENTOS DIECISIETE ";
                                                                            }else{
                                                                                if (cifra3 / 8 == 1 && cifra3 % 8 == 0){
                                                                                    text3 = "NOVECIENTOS DIECIOCHO ";
                                                                                }else{
                                                                                    if (cifra3 / 9 == 1 && cifra3 % 9 == 0){
                                                                                        text3 = "NOVECIENTOS DIECINUEVE ";
                                                                                    }else{
                                                                                        text3 = "NOVECIENTO ONCE ";
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

            }else{

            }

            System.out.println("El texto del numero es: "+ text1 + text2 + text3);

        }else{

            if (num > 9999999){
                
            }else{
                if (num > 999999){
                    
                }else{
                    if (num > 99999){
                        
                    }else{
                        if (num > 9999){
                     
                        }else{
                            if (num > 999){
                             
                            }else{
                                

                            }

                        }
                    }
                }

            }

        }

    }
}