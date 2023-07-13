import java.util.Scanner;
public class Ejercicio09{

    public static void main (String[] args){

        Scanner fecha = new Scanner(System.in);

        System.out.print("Ingrese la fecha en formato ddmmaaaa: ");
        int num = fecha.nextInt();

        int day = (num / 1000000);
        int month = (num % 1000000)/10000;
        int year = num % 10000;
       
        System.out.println(day + " / " + month + " / " + year);

        if (day > 9){
            int d1 = day / 10;
            int d2 = day % 10;

            if (d1 == 1){
                if(d2 == 0){
                    System.out.print("DIEZ DE ");
                }else if(d2 == 1){
                    System.out.print("ONCE DE ");
                }else if(d2 == 2){
                    System.out.print("DOCE DE ");
                }else if(d2 == 3){
                    System.out.print("TRECE DE ");
                }else if(d2 == 4){
                    System.out.print("CATORCE DE ");
                }else if(d2 == 5){
                    System.out.print("QUINCE DE ");
                }else if(d2 == 6){
                    System.out.print("DIECISEIS DE ");
                }else if(d2 == 7){
                    System.out.print("DIECISIETE DE ");
                }else if(d2 == 8){
                    System.out.print("DIECIOCHO DE ");
                }else if(d2 == 9){
                    System.out.print("DIECINUEVE DE ");
                }
            
            }else if (d1 == 2){
                if(d2 == 0){
                    System.out.print("VEINTE DE ");
                }else if(d2 >= 1 && d2 <= 9){
                    System.out.print("VENTI ");
                }
            }else if (d1 == 3){
                if(d2 == 0){
                    System.out.print("TREINTA DE ");
                }else if(d2 == 1){
                    System.out.print("TREINTA Y ");
                }
            }

            if (d2 == 0){ 
                System.out.print(" ");
            }else if (d2 == 1){ 
                if(d1 != 1){
                    System.out.print("UNO DE ");
                }   
            }else if (d2 == 2){ 
                if(d1 > 1 && d1 < 3){
                    System.out.print("DOS DE ");
                }
            }else if (d2 == 3){ 
                if(d1 > 1 && d1 < 3){
                    System.out.print("TRES DE ");
                }
            }else if (d2 == 4){ 
                if(d1 > 1 && d1 < 3){
                    System.out.print("CUATRO DE ");
                }
            }else if (d2 == 5){ 
                if(d1 > 1 && d1 < 3){
                    System.out.print("CINCO DE ");
                }
            }else if (d2 == 6){ 
                if(d1 > 1 && d1 < 3){
                    System.out.print("SEIS DE ");
                }
            }else if (d2 == 7){ 
                if(d1 > 1 && d1 < 3){
                    System.out.print("SIETE DE ");
                }
            }else if (d2 == 8){ 
                if(d1 > 1 && d1 < 3){
                    System.out.print("OCHCO DE ");
                }
            }else if (d2 == 9){ 
                if(d1 > 1 && d1 < 3){
                    System.out.print("NUEVE DE ");
                }
            }

        }else if (day <= 9){
            if(day == 1){
                System.out.print("UNO DE ");
            }else if(day == 2){
                System.out.print("DOS DE ");
            }else if(day == 3){
                System.out.print("TRES DE ");
            }else if(day == 4){
                System.out.print("CUATRO DE ");
            }else if(day == 5){
                System.out.print("CINCO DE ");
            }else if(day == 6){
                System.out.print("SEIS DE ");
            }else if(day == 7){
                System.out.print("SIETE DE ");
            }else if(day == 8){
                System.out.print("OCHO DE ");
            }else if(day == 9){
                System.out.print("NUEVE DE ");
            }
        }

        if (month > 9){
            int d1 = month / 10;
            int d2 = month % 10;

            if (d1 == 1){
                if(d2 == 0){
                    System.out.print("OCTUBRE DEL ");
                }else if(d2 == 1){
                    System.out.print("NOVIEMBRE DEL ");
                }else if(d2 == 2){
                    System.out.print("DICIEMBRE DEL ");
                }
            }
        }else if (month <= 9){
            if(month == 1){
                System.out.print("ENERO DEL ");
            }else if(month == 2){
                System.out.print("FEBRERO DEL ");
            }else if(month == 3){
                System.out.print("MARZO DEL ");
            }else if(month == 4){
                System.out.print("ABRIL DEL ");
            }else if(month == 5){
                System.out.print("MAYO DEL ");
            }else if(month == 6){
                System.out.print("JUNIO DEL ");
            }else if(month == 7){
                System.out.print("JULIO DEL ");
            }else if(month == 8){
                System.out.print("AGOSTO DEL ");
            }else if(month == 9){
                System.out.print("SEPTIEMBRE DEL ");
            }
        }

        if (year >= 1000 && year < 2999){

            int d1 = (year / 1000);
            int d2 = (year % 1000)/ 100;
            int d3 = (year % 100)/ 10;
            int d4 = (year % 10);

            if (d1 == 1){ 
                
                System.out.print("MIL ");
                
            }else if (d1 == 2){ 
                
                System.out.print("DOS MIL "); 
            }

            if (d2==0) {
				System.out.print("");
			}else if(d2==1){
				if(d3==0 && d4==0){
					System.out.print("CIEN ");
				}else{
					System.out.print("CIENTO ");
				}
			}else if(d2==2){
				System.out.print("DOSCIENTOS ");
			}else if(d2==3){
				System.out.print("TRESCIENTOS ");
			}else if(d2==4){
				System.out.print("CUATROCIENTOS ");
			}else if(d2==5){
				System.out.print("QUINIENTOS ");
			}else if(d2==6){
				System.out.print("SEISCIENTOS ");
			}else if(d2==7){
				System.out.print("SETECIENTOS ");
			}else if(d2==8){
				System.out.print("OCHOCIENTOS ");
			}else if(d2==9){
				System.out.print("NOVECIENTOS ");
			}

            if(d3==1){
				if (d4==0){
					System.out.print("DIEZ");
				}else if(d4==1){
					System.out.print("ONCE");
				}else if(d4==2){
					System.out.print("DOCE ");
				}else if(d4==3){
					System.out.print("TRECE ");
				}else if(d4==4){
					System.out.print("CATORCE ");
				}else if(d4==5){
					System.out.print("QUINCE ");
				}else if(d4==6){
					System.out.print("DIECISEIS ");
				}else if(d4==7){
					System.out.print("DIECISIETE ");
				}else if(d4==8){
					System.out.print("DIECIOCHO ");
				}else if(d4==9){
					System.out.print("DIECINUEVE ");
				}
			}else if(d3==2){
				if (d4==0) {
					System.out.print("VEINTE ");
				}else{
					System.out.print("VEINTI");
				}
			}else if(d3==3){
				if (d4==0) { 
					System.out.print("TREINTA ");
				}else{
					System.out.print("TREINTA Y ");
				}
			}else if(d3==4){
				if (d4==0) {
					System.out.print("CUARENTA ");
				}else{
					System.out.print("CUARENTA Y ");
				}
			}else if(d3==5){
				if (d4==0) {
					System.out.print("CINCUENTA ");
				}else{
					System.out.print("CINCUENTA Y ");
				}
			}else if(d3==6){
				if (d4==0) {
					System.out.print("SESENTA ");
				}else{
					System.out.print("SESENTA Y ");
				}
			}else if(d3==7){
				if (d4==0) {
					System.out.print("SETENTA ");
				}else{
					System.out.print("SETENTA Y ");
				}
			}else if(d3==8){
				if (d4==0) {
					System.out.print("OCHENTA ");
				}else{
					System.out.print("OCHENTA Y ");
				}
			}else if(d3==9){
				if (d4==0) {
					System.out.print("NOVENTA ");
				}else{
					System.out.print("NOVENTA Y ");
				}
			}

            if (d4==0){
				System.out.print("");
			}else if(d4==1){
				if (d3==0) {
					System.out.print("UNO ");
				}
				if (d3>=2 && d3<=9) {
					System.out.print("UNO ");
				}
			}else if(d4==2){
				if (d3!=1) {
					System.out.print("DOS ");
				}
			}else if(d4==3){
				if (d3!=1) {
					System.out.print("TRES ");
				}
			}else if(d4==4){
				if (d3!=1) {
					System.out.print("CUATRO ");
				}
			}else if(d4==5){
				if (d3!=1) {
					System.out.print("CINCO ");
				}
			}else if(d4==6){
				if (d3!=1) {
					System.out.print("SEIS ");
				}
			}else if(d4==7){
				if (d3!=1) {
					System.out.print("SIETE ");
				}
			}else if(d4==8){
				if (d3!=1) {
					System.out.print("OCHO ");
				}
			}else if(d4==9){
				if (d3!=1) {
					System.out.print("NUEVE ");
				}
			}
        }
    }
}

        
   



        