package org.javasnack.java;

import java.util.Random;

public class Snack7 {
    public static void main(String[] args) {
        Random rand = new Random();
        int num=0;
        do {
        	// genera un numero casuale compreso tra 0 e 100
            num = rand.nextInt(101); 
         // stampa il numero generato
            System.out.println(num); 
         // ripete finché il numero generato non è divisibile per 3 e per 5
        } while (num % 3 != 0 || num % 5 != 0); 
    }
}
