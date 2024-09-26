package com.Collections;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class OddNumberlist {

	// public class OddNumberSum {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);

		// Input the number of elements in the list
		System.out.print("Enter the number of elements in the list: ");
		int numberOfElements = scanner.nextInt();

		// Input the elements of the list
		List<Integer> numbersList = new ArrayList<>();
		System.out.println("Enter the elements of the list:");
		for (int i = 0; i < numberOfElements; i++) {
			System.out.print("Element " + (i + 1) + ": ");
			numbersList.add(scanner.nextInt());
		}

		// Find odd numbers and calculate their sum
		int oddSum = 0;
		List<Integer> oddNumbers = new ArrayList<>();
		for (int number : numbersList) {
			if (number % 2 != 0) {
				oddNumbers.add(number);
				oddSum += number;
			}
		}

		// Display odd numbers and their sum
		if (!oddNumbers.isEmpty()) {
			System.out.println("Odd numbers in the list: " + oddNumbers);
			System.out.println("Sum of odd numbers: " + oddSum);
		} else {
			System.out.println("No odd numbers found in the list.");
		}
	}
}
