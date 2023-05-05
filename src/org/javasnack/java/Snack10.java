package org.javasnack.java;

import java.util.Scanner;

public class Snack10 {
    public static void main(String[] args) {
       
        Scanner input = new Scanner(System.in);

        System.out.print("Inserisci il raggio del cerchio: ");
        double raggio = input.nextDouble();

        // area
        double area = raggio * raggio * 3.14;
        System.out.println("L'area del cerchio di raggio " + raggio + " è: " + area);

        // perimetro
        double perimetro = 2 * raggio * 3.14;
        System.out.println("Il perimetro del cerchio di raggio " + raggio + " è: " + perimetro);
        input.close();
    }
}
