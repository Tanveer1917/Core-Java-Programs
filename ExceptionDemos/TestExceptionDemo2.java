package com.ExceptionDemos;

import java.util.Scanner;

class ArrayException {
	public String getPriceDetails() {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the number of elements in the array");
		int size = sc.nextInt();
		int[] arrsize = new int[size];

		System.out.println("Enter the price details");
		for (int i = 0; i < size; i++) {
			arrsize[i] = sc.nextInt();
		}
		return null;
	}
}

public class TestExceptionDemo2 {

	public static void main(String[] args) {

	}

}
