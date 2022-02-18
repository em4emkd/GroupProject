package com.syntax.groupproject;

import java.util.Scanner;

public class Task01 {

	public static void main(String[] args) {

		/*
		 * Create an array on int values using a scanner and calculate the sum of all
		 * stored elements in that array.
		 */

		Scanner sc = new Scanner(System.in);
		int size;
		System.out.println("Enter the number of size of array");
		size = sc.nextInt();
		int[] a = new int[size];
		System.out.println("Enter the array element");

		// For reading the element
		for (int i = 0; i < size; i++) {
			a[i] = sc.nextInt();
		}
		// For print the array element
		for (int i : a) {
			System.out.print(i + ", ");

			// Calculate sum of given array element
			int sum = 0;
			for (i = 0; i < size; i++) {
				for (i = 0; i < a.length; i++) {
					sum = sum + a[i];
				}
			}
			// Display The Sum Of Given Array Elements
			System.out.print("Sum of the Given Array Elements is: " + sum);
			sc.close();

		}
	}
}
