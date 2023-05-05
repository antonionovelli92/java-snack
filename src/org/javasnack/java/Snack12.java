package org.javasnack.java;

import java.util.Arrays;

public class Snack12 {
public static void main(String[] args) {
	Integer[] arr1 = { 1, 2, 3, 4, 5 };
	Integer[] arr2 = { 34, 35, 36, 37, 38 };

	// 1. new array
	Integer[] result = new Integer[arr1.length + arr2.length];
//	test
	System.out.println(Arrays.toString(result)); 

	//  arr1 in result
	for (int i = 0; i < arr1.length; i++) {
	    result[i] = arr1[i];
	}

	//  arr2 in result
	for (int i = 0; i < arr2.length; i++) {
	    result[arr1.length + i] = arr2[i];
	}

	// Stampa il nuovo array
	System.out.println(Arrays.toString(result)); 

}
}
