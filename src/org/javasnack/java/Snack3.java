package org.javasnack.java;

public class Snack3 {
    public static void main(String[] args) {
        int[] numeri = { 10, 20, 30, 40, 50 };
        int somma = 0;

        for (int i = 1; i < numeri.length; i ++) {
            somma += numeri[i];
        }

        System.out.println("Il risultato è: " + somma);
    }
}
