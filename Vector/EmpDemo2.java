package com.Vector;

import java.util.Scanner;
import java.util.Vector;

class Emp
{
	int id;
	String name;
	
	public Emp(int id, String name) {
		super();
		this.id = id;
		this.name = name;
	}

	@Override
	public String toString() {
		return "Emp [id=" + id + ", name=" + name + "]";
	}
	
	
}

public class EmpDemo2 {

	public static void main(String[] args)
	{
		
		Vector v1=new Vector<Emp>();
		Scanner sc=new Scanner(System.in);
		
		for(int i=0;i<5;i++)
		{
			System.out.println("Enter the emp id");
			int id=sc.nextInt();
			System.out.println("Enter the emp name");
			String name=sc.next();
			
			Emp e1 =new Emp(id,name);
			v1.add(e1);
			
		}
		
		System.out.println(v1);
		
		
		}

}
