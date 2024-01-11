package com.Abstract;

class CustomerService {
	double amount = 5000.00;

	public double deposit(double amount) {
		this.amount = this.amount + amount;
		return this.amount;

	}
}

abstract class Rbi extends CustomerService {
	public Rbi() {
		System.out.println("Welcome to my bank");
	}

	// for customer rbi having one method
	public void showRules() {
		System.out.println("If you want to withdraw more than you need show your PAN card");
	}

	// BAnkingPArtners
	abstract public String getBanking(Rbi rbi);

}
// close rbi class
//he type SBI must implement the inherited abstract method Rbi.getBanking(Rbi)

class SBI extends Rbi {
	public String getBanking(Rbi rbi) {
		/*
		 * 
		 * instanceof Operator is returns boolean This is used to check wheather the
		 * object or reference reffering to particular Type of class object or not
		 */
		if (rbi instanceof SBI) {
			return "SBI is valid Bank";
		} else {
			return "SBI Not valid Bank";
		}
	}

}

class Pnb extends Rbi {
	public String getBanking(Rbi rbi)

	{
		/*
		 * instanceof Operator is returns boolean This is used to check wheather the
		 * object or reference reffering to particular Type of class object or not
		 */
		if (rbi instanceof Pnb) {
			return "Pnb is valid Bank";
		} else {
			return "Pnb Not valid Bank";
		}
	}

	void msg() {
		System.out.println("Hiii");
	}

}

public class TestAbstractDemo1 {
	public static void main(String[] rbi) {
		Rbi r = null;
		r = new SBI();
		double amount = (r.deposit(5000));
		System.out.println(amount);

		r.showRules();
		String statusFOrSBI = r.getBanking(r);
		System.out.println(statusFOrSBI);
		System.out.println("***************************");

		r = new Pnb();

		r.showRules();
		String statusFOrPnb = r.getBanking(r);
		System.out.println(statusFOrPnb);
		System.out.println("*****************************");

	}

}
