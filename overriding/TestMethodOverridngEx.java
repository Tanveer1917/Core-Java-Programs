package com.overriding;

class A1 {
	public void displayMsg(String msg) {
		System.out.println("displaying message from super class" + msg);
	}
}

class B2 extends A1 {
	public void displayMsg(String msg) {
		System.out.println("displaying message from child class" + msg);
	}
}

public class TestMethodOverridngEx 
{
	public static void main(String[] args) {
	//In parent type reference I have initialized
	//object of child class
	//This concept known as 
	
	B2 child = new B2();
	child.displayMsg("Hello");
	A1 parent=new A1();
	parent.displayMsg("Hii");
	

}
}
