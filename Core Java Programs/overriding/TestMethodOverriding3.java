package com.overriding;

class emp
{
	private int empId;
	private String empName;
	
	public emp(int empId, String empName) {
		super();
		this.empId = empId;
		this.empName = empName;
	}
	
	/*overiding toString() method object
	 * 
	 * 
	 * toString() is the method of Object class
	 * which returns
	 * String 
	 * we can override toString() into own class to convert the content of the object onto String
	 * 
	 * How to call toString()
	 * once we call 
	 */


public String toString()
{
	return empName+" "+empId;
}
}
public class TestMethodOverriding3 {
	
	public static void main(String[] args)
	{
		emp obj = new emp(177,"Tanveer");
		System.out.println(obj);
		
	}

}

