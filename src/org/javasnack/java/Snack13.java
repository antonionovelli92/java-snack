package org.javasnack.java;

import java.util.Arrays;

public class Snack13 {
public static void main(String[] args) {
	
	Integer[] arr1 = { 1, 2, 3, 4, 5 };
	Integer[] arr2 = { 34, 35, 36, 37, 38 };

	// creo fake array 
	Integer[] copyArr1 = Arrays.copyOf(arr1, arr1.length);
	Integer[] copyArr2 = Arrays.copyOf(arr2, arr2.length);

	// swap del primo valore negli array copiati
	copyArr1[0] = arr2[0];
	copyArr2[0] = arr1[0];

	// stampo fake array 
	System.out.println(Arrays.toString(copyArr1));
	System.out.println(Arrays.toString(copyArr2));
}
}
