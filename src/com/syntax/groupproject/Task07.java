package com.syntax.groupproject;

public class Task07 {

	public static void main(String[] args) {

		// Write a Java Program to print the first 10 numbers of Fibonacci series

		int n1 = 0;
		int n2 = 1;
		int n3;
		int i;
		int count = 10;
		System.out.print(n1 + " " + n2); // Prints out 0 & 1

		for (i = 1; i < count; i++) {
			n3 = n1 + n2;
			System.out.print(" " + n3);
			n1 = n2;
			n2 = n3;
		}
	}

}
