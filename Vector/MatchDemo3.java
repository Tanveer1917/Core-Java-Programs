package com.Vector;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Scanner;

public class MatchDemo3 {

	public static void main(String[] args) {
		
		List<Integer>list=new ArrayList<Integer>();
		Scanner sc=new Scanner(System.in);
		
		System.out.println("Enter the total matches played by Raina");
		
		int nom=sc.nextInt();
		for(int i=0;i<nom;i++)
		{
			System.out.println("enter"+" "+(i+1)+" "+"Score");
			int score=sc.nextInt();
			list.add(score);
		}
		int totalscore=0;
		double avgscore=0.00;
		
		Iterator<Integer>itr =list.iterator();
		
		while(itr.hasNext())
		{
			totalscore=totalscore+itr.next();
			avgscore=totalscore/nom;
			System.out.println("Total csk score="+totalscore);
			System.out.println("Total average score="+avgscore);
		}
		
		
}

}
