package org.javasnack.java;

import java.util.Scanner;

public class Snack4 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        
        System.out.print("Inserisci una parola: ");
        String parola = sc.nextLine();
        sc.close();

        boolean isPalindroma = true;

        for (int i = 0; i < parola.length() / 2 && isPalindroma; i++) {
            if (parola.charAt(i) != parola.charAt(parola.length() - 1 - i)) {
                isPalindroma = false;
            }
        }

        if (isPalindroma) {
            System.out.println("La parola " + parola + " è palindroma.");
        } else {
            System.out.println("La parola " + parola + " non è palindroma.");
        }
    }
}

