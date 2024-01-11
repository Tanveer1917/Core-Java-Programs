package com.Abstract;

class Emp {
	private int empId;
	private String empName;
	private Emp emp;

	public Emp(int empId, String empName) {
		this.empId = empId;
		this.empName = empName;
	}
	// overriding toString() method object
	/*
	 * toString() is the method of Object class which returns String we can override
	 * toString() into our own class to convert the content of the object into
	 * string
	 * 
	 * How to call toString() once we call println() method , internally it calls
	 * toString() method of the Object class
	 * 
	 * 
	 */
	// override toString()

	public String toString() {
		return empName + " " + empId;
	}

	// override hashCode()
	// overridden hashcode()
	public int hashcode() {
		return empId * 2;

	}
	// overiding equals() method

	public boolean equals(Object Obj) {
		/*
		 * If this keywoord which holds the reference of currently
		 * 
		 * 
		 * 
		 */
		if (this == Obj) {
			return true;
		}
		Emp e = (Emp) Obj;
		if ((e.empId == this.empId) && (e.empName.equals(this.empName)))
			;
		{
			return true;
		}
	}
}

public class TestClassObjectDemo {

	public static void main(String[] args, Object obj1) {

		Emp obj11 = new Emp(108, " A");
		System.out.println(obj11.hashCode());
		Emp obj2 = new Emp(108, "A");
//System.out.println(obj2.hashCode());
		String msg = obj11.equals(obj2) ? "both objects are same" : "not same as objects";

		if (obj11.equals(obj2)) {
			System.out.println("both objet content are same");
		} else {

		}
		String s1 = "A";
		String s2 = "A";
		System.out.println(s1.hashCode() + " " + s2.hashCode());
		System.out.println(obj11);

	}

}
