package org.example;

import java.util.Scanner;

public class circunference {
    public static void main(String[] args) {
        Scanner scan =  new Scanner(System.in);

        System.out.println("Ingrese el número:");
        double number = scan.nextDouble();

        double area = (Math.PI * Math.pow(number, 2));
        double longi = (Math.PI * number);

        System.out.println("El area de la circunferencia es "+ area +" y su longitud es: " + longi );

    }

}
