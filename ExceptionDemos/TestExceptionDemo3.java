package com.ExceptionDemos;

class InsufficientFundException extends Exception {
	public InsufficientFundException(String msg) {

	}
}

class Account {
	static double totalamt = 10000.00;

	public static double getmoney(double amount) throws InsufficientFundException {
		if (amount > totalamt) {
			throw new InsufficientFundException("Insufficient Fund");
		} else {
			totalamt = totalamt - amount;
		}
		return totalamt;
	}
}

public class TestExceptionDemo3 {

	public static void main(String[] args) {
		try {
			System.out.println(Account.getmoney(10000.00));
		} catch (InsufficientFundException e) {
			System.out.println(e.getMessage());
		}

	}

}
