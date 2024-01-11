package com.ExceptionDemos;

import java.util.Scanner;

import javax.management.InvalidApplicationException;
import javax.naming.directory.InvalidAttributesException;

public class TestCandidate {

	public static Candidate getCandidateDetails() throws InvalidAttributesException, InvalidApplicationException
	{
		Candidate c = new Candidate();
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter Name = ");
		String name = sc.next();
		System.out.println("Enter Gender ");
		String gender = sc.next();
		System.out.println("Enter Expected Salary =");
		double salary = sc.nextDouble();
		
		if(salary<10000)
		{
			throw new InvalidApplicationException("Registration Failed. Salary cannot be less than 10000.");
		}
		c.setExpectedSalary(salary);
		c.setGender(gender);
		c.setName(name);
		return c;
		
	}

	public static void main(String[] args) throws InvalidApplicationException {

		try
		{
		Candidate c =   getCandidateDetails();
		System.out.println("Registration Successful");
		}
		catch(InvalidAttributesException e)
		{
			System.out.println(e.getMessage());
		}
	}
}

