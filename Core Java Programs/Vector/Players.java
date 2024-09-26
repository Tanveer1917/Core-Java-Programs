package com.Vector;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;

public class Players {

	public static void main(String[] args) {
		
				List<Integer> list = new ArrayList();
				Scanner sc = new Scanner(System.in);
				System.out.println("Enter no of players: ");
				int nofplayer= sc.nextInt();
				
				for(int i=0; i<nofplayer; i++)
				{
					System.out.println("Enter "+(i+1) + " score ");
					int score = sc.nextInt();
					list.add(score);
				}		
				Collections.sort(list);
				System.out.println(list);
				
			}
}


