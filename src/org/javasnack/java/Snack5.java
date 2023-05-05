package org.javasnack.java;

import java.util.Random;
import java.util.Scanner;

public class Snack5 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Richiesta del numero intero N
        System.out.print("Inserisci un numero: ");
        int n = scanner.nextInt();

        // Generazione di N numeri casuali compresi tra 0 e 100
        int[] numeri = new int[n];
        Random random = new Random();
        for (int i = 0; i < n; i++) {
            numeri[i] = random.nextInt(101);
        }

        // Calcolo della sommatoria di tutti i valori
        int sommaTotale = 0;
        for (int i = 0; i < n; i++) {
            sommaTotale += numeri[i];
        }

        // Calcolo della sommatoria dei valori pari
        int sommaPari = 0;
        for (int i = 0; i < n; i++) {
            if (numeri[i] % 2 == 0) {
                sommaPari += numeri[i];
            }
        }

        // Calcolo della media di tutti i valori
        double mediaTotale = (double) sommaTotale / n;

        // Calcolo della media dei valori dispari
        int sommaDispari = 0;
        int countDispari = 0;
        for (int i = 0; i < n; i++) {
            if (numeri[i] % 2 != 0) {
                sommaDispari += numeri[i];
                countDispari++;
            }
        }
        double mediaDispari = (double) sommaDispari / countDispari;

        // Trovare il valore minimo
        int minimo = numeri[0];
        for (int i = 1; i < n; i++) {
            if (numeri[i] < minimo) {
                minimo = numeri[i];
            }
        }

        // Trovare il valore massimo
        int massimo = numeri[0];
        for (int i = 1; i < n; i++) {
            if (numeri[i] > massimo) {
                massimo = numeri[i];
            }
        }

        // Stampare i risultati
        System.out.println("Sommatoria di tutti i valori: " + sommaTotale);
        System.out.println("Sommatoria dei valori pari: " + sommaPari);
        System.out.println("Media di tutti i valori: " + mediaTotale);
        System.out.println("Media dei valori dispari: " + mediaDispari);
        System.out.println("Valore minimo: " + minimo);
        System.out.println("Valore massimo: " + massimo);

        scanner.close();
    }
}
