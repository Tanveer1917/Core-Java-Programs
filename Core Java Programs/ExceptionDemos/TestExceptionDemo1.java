package com.ExceptionDemos;

import java.util.Scanner;

public class TestExceptionDemo1 {

	public static void main(String[] args) {
		try {

			Scanner sc = new Scanner(System.in);
			System.out.println("enter the num to divide");
			int numByDivides = sc.nextInt();
			int res = 100 / numByDivides;
			System.out.println(res);
			System.out.println("Enter to index to get value from array");
			int index = sc.nextInt();
			int[] arr = { 34, 67, 89, 90 };
			System.out.println(arr[index]);

		}
		
		catch (ArrayIndexOutOfBoundsException e) {
			System.out.println(e.getMessage());
			main(null);
		} finally {
			System.out.println("Thanks for using my app");
		}
	}
}
