package com.syntax.groupproject;

public class Task05 {

	public static void main(String[] args) {

		// Write a program to swap 2 numbers without a temporary variable?

		System.out.println("Before Swapping Variables");
		int x = 1;
		int y = 2;
		System.out.println("The value of x=" + x);
		System.out.println("The value of y=" + y);
		System.out.println("After Swapping Variables");
		x = x + y;
		y = x - y;
		x = x - y;
		System.out.println("The new value of x=" + x);
		System.out.println("The new value of y=" + y);

		// Swap 2 strings without a temporary variable
		System.out.println("-----------------");
		System.out.println("Before Swapping Strings");
		String w = "Wow";
		String o = "Ok";
		System.out.println(w + " " + o);
		System.out.println("After Swapping Strings");
		w = w + o;
		o = w.substring(0, w.length() - o.length());
		w = w.substring(o.length());
		System.out.println(w + " " + o);
	}

}
