package com.Collections;

import java.util.ArrayList;
import java.util.Date;
import java.util.Iterator;
import java.util.List;
import java.util.Scanner;

class Product
{
	private String pCode;
	private String name;
	private Date mfd;
	private double price;
	public Product(String pCode, String name, Date mfd, double price) {
		super();
		this.pCode = pCode;
		this.name = name;
		this.mfd = mfd;
		this.price = price;
	}
	
	public String getpCode() {
		return pCode;
	}

	public void setpCode(String pCode) {
		this.pCode = pCode;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public Date getMfd() {
		return mfd;
	}

	public void setMfd(Date mfd) {
		this.mfd = mfd;
	}

	public double getPrice() {
		return price;
	}

	public void setPrice(double price) {
		this.price = price;
	}

	@Override
	public String toString() {
		return "Product [pCode=" + pCode + ", name=" + name + ", mfd=" + mfd + ", price=" + price + "]";
	}
	 	
}
public class TestProduct {

	private static final Object PCode = null;

	public static void main(String[] args) {

		List<Product>listOfProduct=new ArrayList<Product>();
		listOfProduct.add(new Product("Laptop-008", "Hp LAPTOP", new Date("12/12/2023"), 50000.00));
		listOfProduct.add(new Product("Tv-08", "LED", new Date("27/12/2023"), 10000.00));
		listOfProduct.add(new Product("Mobile-008", "Apple", new Date("01/10/2023"), 5000.00));
		listOfProduct.add(new Product("Smarthwatch", " boot", new Date("12/11/2023"), 5000.00));
		listOfProduct.add(new Product("Ear-bird-008", "Apple", new Date("12/12/2024"), 5000.00));
		
		for(Product p:listOfProduct)
		{
			System.out.println(p);
		}
		
		
		//total price
		double sum=0;
		//calculate the total price of all product
		Iterator itr=listOfProduct.iterator();
		while(itr.hasNext())
		{
			Product p=(Product) itr.next();
			double price=p.getPrice();
			sum=sum+price;	
		}
		System.out.println(sum);
		//based on the product code remove the product object
		Scanner sc=new Scanner(System.in);
		System.out.println("enter the product code");
		String pCode=sc.next();
		
		for(int index=0; index<listOfProduct.size();index++)
		{
			//fetch the product object
			Product pObj=listOfProduct.get(index);
			//fetch the product code
			String pcode=pObj.getpCode();
			//match the product code with user input
			if(pCode.equals(pCode))
			{
				//call remove (Object obj)
				listOfProduct.remove(index);
			}
			}
			 			
		
	for(Product p:listOfProduct)
	{
		System.out.println(p);
	}

	}

}

