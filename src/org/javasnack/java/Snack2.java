package org.javasnack.java;

import java.util.Random;

public class Snack2 {
    public static void main(String[] args) {
        // list name and surname
        String[] nomi = {"Antonio", "Samuele", "Alessandro", "Pino", "Dario", "Domenica", "Anto", "Sebastian", "Mindu", "Ali"};
        String[] cognomi = {"Novelli", "Novellone", "Novi", "Kontrappali", "Baker", "Lenders", "Giggio", "Scotti", "Baker", "Monkey D."};

        Random rand = new Random(); //random number

        System.out.println("Lista fake di invitati:");

        // random name e surname
        for (int i = 0; i < 10; i++) {
            String nome = nomi[rand.nextInt(nomi.length)];
            String cognome = cognomi[rand.nextInt(cognomi.length)];
            System.out.println(cognome + " " + nome);
        }
    }
}






