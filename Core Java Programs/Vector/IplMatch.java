package com.Vector;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class IplMatch {
	
public static void main(String[] args) {
			List<String> list1 = new ArrayList();
			Scanner sc = new Scanner(System.in);
			System.out.println("Enter the top scorers of IPL season 8");
			
			System.out.println("Enter no of players: ");
			int nofplayer= sc.nextInt();
			for(int i=0; i<nofplayer; i++)
			{
				System.out.println("Enter "+(i+1) + " player ");
				String player= sc.next();
				list1.add(player);
			}	
			List<String> list2 = new ArrayList();
			System.out.println("Enter the top scorers of IPL season 8");
			System.out.println("Enter no of players: ");
			int nofplayers= sc.nextInt();
			
			for(int i=0; i<nofplayers; i++)
			{
				System.out.println("Enter "+(i+1) + " player ");
				String player1= sc.next();
				list2.add(player1);
			}	
			
			list1.retainAll(list2);
			System.out.println(" Consistent Players :"+list1);
			list1.removeAll(list2);
			System.out.println(" Inconsistent Players :"+list1);
		}

	}


