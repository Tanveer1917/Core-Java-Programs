package com.Tree;

import java.util.TreeSet;

class PhoneBook implements Comparable<PhoneBook>
{
	private int slNo;
	private String custName;
	private long custNumber;
	private String city;
	
	
	public PhoneBook(int slNo, String custName, long custNumber, String city) {
		super();
		this.slNo = slNo;
		this.custName = custName;
		this.custNumber = custNumber;
		this.city = city;
	}


	@Override
	public String toString() {
		return "PhoneBook [slNo=" + slNo + ", custName=" + custName + ", custNumber=" + custNumber + ", city=" + city
				+ "]";
	}


	public int getSlNo() {
		return slNo;
	}


	public void setSlNo(int slNo) {
		this.slNo = slNo;
	}


	public String getCustName() {
		return custName;
	}


	public void setCustName(String custName) {
		this.custName = custName;
	}


	public long getCustNumber() {
		return custNumber;
	}


	public void setCustNumber(long custNumber) {
		this.custNumber = custNumber;
	}


	public String getCity() {
		return city;
	}


	public void setCity(String city) {
		this.city = city;
	}


	@Override
	public int compareTo(PhoneBook ph) {
		
		//downcast into child type
		
		PhoneBook ph1=(PhoneBook)ph;
		if(this.slNo<ph1.slNo)
		{
			return 1;
		}
		return -1;
	}
	
}


public class Demo2 {

	public static void main(String[] args) {
		
		TreeSet<PhoneBook> ts=new TreeSet();
		ts.add(new PhoneBook(10,"B",123456,"Belgavi"));
		ts.add(new PhoneBook(11,"C",145297,"Pune"));
		ts.add(new PhoneBook(12,"D",422563,"Mumbai"));
		ts.add(new PhoneBook(13,"E",852149,"Banglore"));
		
		for(PhoneBook book:ts)
		{
			System.out.println(book);
		}
		
		

	}

}
