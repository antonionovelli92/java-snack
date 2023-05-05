package org.javasnack.java;

import java.util.Scanner;

public class Snack1 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Inserisci un numero intero: ");
        int num = input.nextInt();

        if (num % 2 == 0) {
            System.out.println("Il numero inserito è pari: " + num);
        } else {
            System.out.println("Il numero inserito è dispari: " + num);
            System.out.println("Il numero successivo è: " + (num + 1));
        }

        input.close();
    }
}
