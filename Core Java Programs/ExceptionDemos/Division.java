package com.ExceptionDemos;

class ArithmeticException extends Exception {
	public ArithmeticException(String str) {
		System.out.print(str);
	}
}

public class Division {

	public String divideTwoNumbers(int number1, int number2) throws ArithmeticException {
		if (number2 == 0) {
			throw new ArithmeticException("Division by zero is not possible. ");
		} else {
			int number = number1 / number2;
			return "The answer is " + number + ". ";
		}
	}
}