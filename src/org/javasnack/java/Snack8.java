package org.javasnack.java;

import java.util.Random;

public class Snack8 {
    public static void main(String[] args) {
        Random rand = new Random();
        int[] numeri = new int[10];
        int[] pari = new int[10];
        int[] dispari = new int[10];
        int countPari = 0;
        int countDispari = 0;

        for (int i = 0; i < 10; i++) {
        	// 0 e 100
            numeri[i] = rand.nextInt(101); 
            
            System.out.println(numeri[i]);
            
            if (numeri[i] % 2 == 0) {
                pari[countPari] = numeri[i];
                countPari++;
            } else {
                dispari[countDispari] = numeri[i];
                countDispari++;
            }
        }

        System.out.print("Array pari: ");
        for (int i = 0; i < countPari; i++) {
            System.out.print(pari[i] + " ");
        }
        System.out.println();

        System.out.print("Array dispari: ");
        for (int i = 0; i < countDispari; i++) {
            System.out.print(dispari[i] + " ");
        }
        System.out.println();
    }
}
