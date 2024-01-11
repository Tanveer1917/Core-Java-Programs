package com.Abstract;

class X 
{
	public void display() {
		System.out.println("Employee info....");
	}

	public void show1() {
		System.out.println("Hi..");
	}
}

	class Y extends X
	{
		public void display()
		{
		System.out.println("Employee task info..");
		}

	public void show2()
	{
		System.out.println("Hello");

	}
}

public class UpCasting {
	public static void main(String[]args)
	{
		
	
X parent=new Y();
parent.display();
parent.show1();
//parent.show2();

Y child=(Y)parent;

child.display();
child.show1();
child.show2();

	}

}
