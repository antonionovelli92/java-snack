package org.javasnack.java;

import java.util.Scanner;

public class Snack9 {
public static void main(String[] args) {
	Scanner sc = new Scanner(System.in);
	
	System.out.println("Inserisci un numero per la BASE: ");
	int bas = sc.nextInt();
	System.out.println("Inserisci un numero per l'ALTEZZA: ");
	int alt = sc.nextInt();
	sc.close();
	
	
	System.out.println("Area: " + bas*alt);
	System.out.println("Perimetro: " + (2*bas) + (2*alt));
	
	
}
}
