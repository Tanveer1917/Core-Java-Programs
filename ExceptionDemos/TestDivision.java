package com.ExceptionDemos;
import java.util.Scanner;

public class TestDivision {
		public static void main(String[] args) {
			Scanner sc = new Scanner(System.in);
			System.out.println("Enter First Number =");
			int num1= sc.nextInt();
			System.out.println("Enter Second Number =");
			int num2= sc.nextInt();
			
			Division ds = new Division();
			try
			{
			String str = ds.divideTwoNumbers(num1, num2);
			System.out.print(str);
			}
			catch (ArithmeticException e) {
				
			}
			finally {
				System.out.println("\nThanks for using the application");
			}
			
		}
		
	}


