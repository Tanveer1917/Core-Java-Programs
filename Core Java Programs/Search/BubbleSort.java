package Search;

import java.util.Arrays;
import java.io.*;
 
public class BubbleSort 
{
	
	public static void main(String[] args) {
	    	
		int arr[] = {11,25,36,5,9};
		int a;
		System.out.println("Before Sorting");
		System.out.println(Arrays.toString(arr));
		for(int i=0;i<arr.length;i++)
		{
			for(int j=1;j<arr.length;j++)
			{
				if(arr[j]<arr[j-1])
				{
					a=arr[j];
					arr[j]=arr[j-1];
					arr[j-1]=a;
				}
			}
			
		}
		System.out.println("After Sorting");
		System.out.println(Arrays.toString(arr));
	         }
}
