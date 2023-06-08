import java.util.Scanner;
public class Ejercicio08{
    public static void main(String[] args){
        Scanner entrada = new Scanner(System.in);

		System.out.print(" => Ingrese un numero (maximo 9 digitos): ");
		int numero = entrada.nextInt();

        int d1 = (numero/100000000);
		int d2 = (numero/10000000)%10;
		int d3 = (numero/1000000)%10;
		int d4 = (numero/100000)%10;
        int d5 = (numero/10000)%10;
        int d6 = (numero/1000)%10;
        int d7 = (numero/100)%10;
        int d8 = (numero/10)%10;
		int d9 = numero%10;

		if(numero>=0 && numero<=999999999){
            //Algoritmo para validar Digito 1
            if (d1==0) {
				System.out.print("");
			}else if(d1==1){
				if(d2==0 && d3==0){
					System.out.print("CIEN ");
				}else{
					System.out.print("CIENTO ");
				}
			}else if(d1==2){
				System.out.print("DOSCIENTOS ");
			}else if(d1==3){
				System.out.print("TRESCIENTOS ");
			}else if(d1==4){
				System.out.print("CUATROCIENTOS ");
			}else if(d1==5){
				System.out.print("QUINIENTOS ");
			}else if(d1==6){
				System.out.print("SEISCIENTOS ");
			}else if(d1==7){
				System.out.print("SETECIENTOS ");
			}else if(d1==8){
				System.out.print("OCHOCIENTOS ");
			}else if(d1==9){
				System.out.print("NOVECIENTOS ");
			}


            //Algoritmo para validar Digito 2

            if (d2==0) {
				System.out.print("");
			}else if(d2==1){
				if (d3==0) {
					System.out.print("DIEZ MILLONES ");
				}else if(d3==1){
					System.out.print("ONCE MILLONES ");
				}else if(d3==2){
					System.out.print("DOCE MILLONES ");
				}else if(d3==3){
					System.out.print("TRECE MILLONES ");
				}else if(d3==4){
					System.out.print("CATORCE MILLONES ");
				}else if(d3==5){
					System.out.print("QUINCE MILLONES ");
				}else if(d3==6){
					System.out.print("DIECISEIS MILLONES ");
				}else if(d3==7){
					System.out.print("DIECISIETE MILLONES ");
				}else if(d3==8){
					System.out.print("DIECIOCHO MILLONES ");
				}else if(d3==9){
					System.out.print("DIECINUEVE MILLONES ");
				}
			}else if(d2==2){
				if (d3==0) {
					System.out.print("VEINTE MILLONES ");
				}else{
					System.out.print("VEINTI");
				}
			}else if(d2==3){
				if (d3==0) {
					System.out.print("TREINTA MILLONES ");
				}else{
					System.out.print("TREINTA Y ");
				}
			}else if(d2==4){
				if (d3==0) {
					System.out.print("CUARENTA MILLONES ");
				}else{
					System.out.print("CUARENTA Y ");
				}
			}else if(d2==5){
				if (d3==0) {
					System.out.print("CINCUENTA MILLONES ");
				}else{
					System.out.print("CINCUENTA Y ");
				}
			}else if(d2==6){
				if (d3==0) {
					System.out.print("SESENTA MILLONES ");
				}else{
					System.out.print("SESENTA Y ");
				}
			}else if(d2==7){
				if (d3==0) {
					System.out.print("SETENTA MILLONES ");
				}else{
					System.out.print("SETENTA Y ");
				}
			}else if(d2==8){
				if (d3==0) {
					System.out.print("OCHENTA MILLONES ");
				}else{
					System.out.print("OCHENTA Y ");
				}
			}else if(d2==9){
				if (d3==0) {
					System.out.print("NOVENTA MILLONES ");
				}else{
					System.out.print("NOVENTA Y ");
				}
			}


            //Algoritmo para validar Digito 3
            if (d3==0) {
                if (d1 == 0 && d2 == 0){
                    System.out.print("");
                }else if (d2 == 0){
                    System.out.print("MILLONES ");
                }	
			}else if(d3==1){
				if (d2==0) {
					System.out.print("UN MILLON ");
				}
				if (d2>=2 && d2<=9) {
					System.out.print("UN MILLONES ");
				}
			}else if(d3==2){
				if (d2!=1) {
					System.out.print("DOS MILLONES ");
				}
			}else if(d3==3){
				if (d2!=1) {
					System.out.print("TRES MILLONES ");
				}
			}else if(d3==4){
				if (d2!=1) {
					System.out.print("CUATRO MILLONES ");
				}
			}else if(d3==5){
				if (d2!=1) {
					System.out.print("CINCO MILLONES ");
				}
			}else if(d3==6){
				if (d2!=1) {
					System.out.print("SEIS MILLONES ");
				}
			}else if(d3==7){
				if (d2!=1) {
					System.out.print("SIETE MILLONES ");
				}
			}else if(d3==8){
				if (d2!=1) {
					System.out.print("OCHO MILLONES ");
				}
			}else if(d3==9){
				if (d2!=1) {
					System.out.print("NUEVE MILLONES ");
				}
			}


            //Algoritmo para validar Digito 4
            if (d4==0) {
				System.out.print("");
			}else if(d4==1){
				if(d5==0 && d6==0){
					System.out.print("CIEN");
				}else{
					System.out.print("CIENTO ");
				}
			}else if(d4==2){
				System.out.print("DOSCIENTOS ");
			}else if(d4==3){
				System.out.print("TRESCIENTOS ");
			}else if(d4==4){
				System.out.print("CUATROCIENTOS ");
			}else if(d4==5){
				System.out.print("QUINIENTOS ");
			}else if(d4==6){
				System.out.print("SEISCIENTOS ");
			}else if(d4==7){
				System.out.print("SETECIENTOS ");
			}else if(d4==8){
				System.out.print("OCHOCIENTOS ");
			}else if(d4==9){
				System.out.print("NOVECIENTOS ");
			}



			// Algoritmo para validar Digito 5
			if (d5==0) {
				System.out.print("");
			}else if(d5==1){
				if (d6==0) {
					System.out.print("DIEZ MIL ");
				}else if(d6==1){
					System.out.print("ONCE MIL ");
				}else if(d6==2){
					System.out.print("DOCE MIL ");
				}else if(d6==3){
					System.out.print("TRECE MIL ");
				}else if(d6==4){
					System.out.print("CATORCE MIL ");
				}else if(d6==5){
					System.out.print("QUINCE MIL ");
				}else if(d6==6){
					System.out.print("DIECISEIS MIL ");
				}else if(d6==7){
					System.out.print("DIECISIETE MIL ");
				}else if(d6==8){
					System.out.print("DIECIOCHO MIL ");
				}else if(d6==9){
					System.out.print("DIECINUEVE MIL ");
				}
			}else if(d5==2){
				if (d6==0) {
					System.out.print("VEINTE MIL ");
				}else{
					System.out.print("VEINTI");
				}
			}else if(d5==3){
				if (d6==0) {
					System.out.print("TREINTA MIL ");
				}else{
					System.out.print("TREINTA Y ");
				}
			}else if(d5==4){
				if (d6==0) {
					System.out.print("CUARENTA MIL ");
				}else{
					System.out.print("CUARENTA Y ");
				}
			}else if(d5==5){
				if (d6==0) {
					System.out.print("CINCUENTA MIL ");
				}else{
					System.out.print("CINCUENTA Y ");
				}
			}else if(d5==6){
				if (d6==0) {
					System.out.print("SESENTA MIL ");
				}else{
					System.out.print("SESENTA Y ");
				}
			}else if(d5==7){
				if (d6==0) {
					System.out.print("SETENTA MIL ");
				}else{
					System.out.print("SETENTA Y ");
				}
			}else if(d5==8){
				if (d6==0) {
					System.out.print("OCHENTA MIL ");
				}else{
					System.out.print("OCHENTA Y ");
				}
			}else if(d5==9){
				if (d6==0) {
					System.out.print("NOVENTA MIL ");
				}else{
					System.out.print("NOVENTA Y ");
				}
			}

			// Algoritmo para validar Digito 6
			if (d6==0) {
                if (d4 == 0 && d5 == 0){
                    System.out.print("");
                }else{
                    System.out.print("MIL");
                }	
			}else if(d6==1){
				if (d5==0) {
					System.out.print("MIL ");
				}
				if (d5>=2 && d5<=9) {
					System.out.print("UN MIL ");
				}
			}else if(d6==2){
				if (d5!=1) {
					System.out.print("DOS MIL ");
				}
			}else if(d6==3){
				if (d5!=1) {
					System.out.print("TRES MIL ");
				}
			}else if(d6==4){
				if (d5!=1) {
					System.out.print("CUATRO MIL ");
				}
			}else if(d6==5){
				if (d5!=1) {
					System.out.print("CINCO MIL ");
				}
			}else if(d6==6){
				if (d5!=1) {
					System.out.print("SEIS MIL ");
				}
			}else if(d6==7){
				if (d5!=1) {
					System.out.print("SIETE MIL ");
				}
			}else if(d6==8){
				if (d5!=1) {
					System.out.print("OCHO MIL ");
				}
			}else if(d6==9){
				if (d5!=1) {
					System.out.print("NUEVE MIL ");
				}
			}

			// Algoritmo para validar Digito 7
			if (d7==0) {
				System.out.print("");
			}else if(d7==1){
				if(d8==0 && d9==0){
					System.out.print("CIEN ");
				}else{
					System.out.print("CIENTO ");
				}
			}else if(d7==2){
				System.out.print("DOSCIENTOS ");
			}else if(d7==3){
				System.out.print("TRESCIENTOS ");
			}else if(d7==4){
				System.out.print("CUATROCIENTOS ");
			}else if(d7==5){
				System.out.print("QUINIENTOS ");
			}else if(d7==6){
				System.out.print("SEISCIENTOS ");
			}else if(d7==7){
				System.out.print("SETECIENTOS ");
			}else if(d7==8){
				System.out.print("OCHOCIENTOS ");
			}else if(d7==9){
				System.out.print("NOVECIENTOS ");
			}

			// Algoritmo para validar Digito 8

            if (d8==0) {
				System.out.print("");
			}else if(d8==1){
				if (d9==0) {
					System.out.print("DIEZ");
				}else if(d9==1){
					System.out.print("ONCE");
				}else if(d9==2){
					System.out.print("DOCE ");
				}else if(d9==3){
					System.out.print("TRECE ");
				}else if(d9==4){
					System.out.print("CATORCE ");
				}else if(d9==5){
					System.out.print("QUINCE ");
				}else if(d9==6){
					System.out.print("DIECISEIS ");
				}else if(d9==7){
					System.out.print("DIECISIETE ");
				}else if(d9==8){
					System.out.print("DIECIOCHO ");
				}else if(d9==9){
					System.out.print("DIECINUEVE ");
				}
			}else if(d8==2){
				if (d9==0) {
					System.out.print("VEINTE ");
				}else{
					System.out.print("VEINTI");
				}
			}else if(d8==3){
				if (d9==0) { 
					System.out.print("TREINTA ");
				}else{
					System.out.print("TREINTA Y ");
				}
			}else if(d8==4){
				if (d9==0) {
					System.out.print("CUARENTA ");
				}else{
					System.out.print("CUARENTA Y ");
				}
			}else if(d8==5){
				if (d9==0) {
					System.out.print("CINCUENTA ");
				}else{
					System.out.print("CINCUENTA Y ");
				}
			}else if(d8==6){
				if (d9==0) {
					System.out.print("SESENTA ");
				}else{
					System.out.print("SESENTA Y ");
				}
			}else if(d8==7){
				if (d9==0) {
					System.out.print("SETENTA ");
				}else{
					System.out.print("SETENTA Y ");
				}
			}else if(d8==8){
				if (d9==0) {
					System.out.print("OCHENTA ");
				}else{
					System.out.print("OCHENTA Y ");
				}
			}else if(d8==9){
				if (d9==0) {
					System.out.print("NOVENTA ");
				}else{
					System.out.print("NOVENTA Y ");
				}
			}
            // Algoritmo para validar digito 9

            if (d9==0) {
				System.out.print("");
			}else if(d9==1){
				if (d8==0) {
					System.out.print("UNO ");
				}
				if (d8>=2 && d8<=9) {
					System.out.print("UNO ");
				}
			}else if(d9==2){
				if (d8!=1) {
					System.out.print("DOS ");
				}
			}else if(d9==3){
				if (d8!=1) {
					System.out.print("TRES ");
				}
			}else if(d9==4){
				if (d8!=1) {
					System.out.print("CUATRO ");
				}
			}else if(d9==5){
				if (d8!=1) {
					System.out.print("CINCO ");
				}
			}else if(d9==6){
				if (d8!=1) {
					System.out.print("SEIS ");
				}
			}else if(d9==7){
				if (d8!=1) {
					System.out.print("SIETE ");
				}
			}else if(d9==8){
				if (d8!=1) {
					System.out.print("OCHO ");
				}
			}else if(d9==9){
				if (d8!=1) {
					System.out.print("NUEVE");
				}
			}	
		}else{
			System.out.println(" => Numero invalido. ");
		}

	}
}

    