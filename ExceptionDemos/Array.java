package com.ExceptionDemos;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Array {

	public static void main(String[] args) {

		try {
			Array arrayException = new Array();
			System.out.println(arrayException.getPriceDetails());
		} catch (Exception e) {
			System.out.println("An error occurred: " + e.getMessage());
		}
	}

	public String getPriceDetails() {
		try {
			Scanner scanner = new Scanner(System.in);

			System.out.print("Enter the size of the array: ");
			int size = scanner.nextInt();

			int[] array = new int[size];

			System.out.println("Enter the elements of the array:");
			for (int i = 0; i < size; i++) {
				System.out.print("Element " + (i + 1) + ": ");
				array[i] = scanner.nextInt();
			}

			System.out.print("Enter the index to get the price details: ");
			int index = scanner.nextInt();

			return "The array element is " + array[index];
		} catch (ArrayIndexOutOfBoundsException e) {
			return "Array index is out of range";
		} catch (InputMismatchException e) {
			return "Input was not in the correct format";
		}
	}

}
