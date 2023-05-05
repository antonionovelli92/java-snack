package org.javasnack.java;

import java.util.Scanner;

public class Snack11 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        
        System.out.println("Inserisci un valore: ");
        int valore = input.nextInt();

        
        System.out.println("I divisori esatti di " + valore + " sono: ");
        for (int i = 1; i <= valore; i++) {
            if (valore % i == 0) {
                System.out.println(i + " ");
            }
        }


        input.close();
    }
}
