package com.syntax.groupproject;

public class Task08 {

	public static void main(String[] args) {
		
		//Maximum and minimum number in the array?
		
		int[] number = { 10, 1, 45, 10, 32, 750, 50, 100 };
		int min = number[0];
		for (int n = 0; n < number.length; n++) {
			if (number[n] < min) {
				min = number[n];
			}
		}
		System.out.println("The minimum number of the array is " + min);
		int max = number[0];
		for (int n = 0; n < number.length; n++) {
			if (number[n] > max) {
				max = number[n];
			}
		}
		System.out.println("The maximum number of the array is " + max);

	}

}
