package com.syntax.groupproject;

public class Task09 {

	public static void main(String[] args) {

		/*
		 * Write a java program to find the second largest number in the array?
		 */

		int[] num = { 100, 2000, 30, 400, 50, 600, 70, 800 };

		int largest = num[0];
		int secondLargest = num[0];

		for (int i = 0; i < num.length; i++) {

			// if current array value is greater than largest value
			// move the largest value to secondLargest and make current value as largest
			if (num[i] > largest) {
				secondLargest = largest;
				largest = num[i];
				// if the current value is smaller than largest and greater than secondLargest
				// then the current value becomes secondLargest
			} else if (num[i] > secondLargest) {
				secondLargest = num[i];
			}

		}
		System.out.println(secondLargest);

	}

}
