package com.Tree;

import java.util.Comparator;
import java.util.Scanner;
import java.util.TreeSet;

class BankCustomer {

	private String customerName;
	private long PhoneNo;
	private double balance;

	public BankCustomer(String customerName, long phoneNo, double balance) {
		super();
		this.customerName = customerName;
		PhoneNo = phoneNo;
		this.balance = balance;
	}

	public String getCustomerName() {
		return customerName;
	}

	public long getPhoneNo() {
		return PhoneNo;
	}

	public double getBalance() {
		return balance;
	}

	@Override
	public String toString() {
		return "BankCustomer [customerName=" + customerName + ", PhoneNo=" + PhoneNo + ", balance=" + balance + "]";
	}

}

class SortCustomerByName implements Comparator<BankCustomer> {

	@Override
	public int compare(BankCustomer o1, BankCustomer o2) {

		return o1.getCustomerName().compareTo(o2.getCustomerName());
	}
}

class SortCustomerByBalance implements Comparator<BankCustomer>{

	@Override
	public int compare(BankCustomer o1, BankCustomer o2) {
		if(o1.getBalance()>o2.getBalance())
			return 1;
		return -1;
	}

}

public class Demo3 {

	public static void main(String[] args) {
//		Comparator cmp=null;
		Comparator cmp=new SortCustomerByName();

		Scanner sc = new Scanner(System.in);
		System.out.println("how to sort");
		String sortTechnique = sc.next();


		if(sortTechnique.equalsIgnoreCase("balance"))
		{
			cmp = new SortCustomerByBalance();

		}else if(sortTechnique.equalsIgnoreCase("name"))
		{
			cmp = new SortCustomerByName();

		}


		TreeSet<BankCustomer> ts=new TreeSet(cmp);
		ts.add(new BankCustomer("F",12344L,34500.00));
		ts.add(new BankCustomer("S",52414L,32500.00));
		ts.add(new BankCustomer("T",42365L,37500.00));

		
		
		
				
		for(BankCustomer customer: ts)
		{
			System.out.println(customer);}
		}

}

