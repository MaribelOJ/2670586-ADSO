import java.util.Scanner;
public class Ejercicio02{
    public static void main (String [] args){
        Scanner temperaturaC = new Scanner(System.in);

        int fahrenheit, celsius;

        System.out.println("OPERACION: conversion de Celsius a Fahrenheit");
        System.out.println(" ");
        System.out.println("Ingrese temperatura en grados Celsius: ");
        celsius = temperaturaC.nextInt();

        fahrenheit = (celsius * 9/5) + 32;
        
        System.out.println(" ");
        System.out.println( " LA CONVERSIÓN A GRADOS FAHRENHEIT SERIA: ");
        System.out.println(" ");
        System.out.println( fahrenheit + " °F");
       
    }
}