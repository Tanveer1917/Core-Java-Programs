package Search;

import java.util.Arrays;
import java.io.*;
 
public class SelectionSearch 
{
	
	public static void main(String[] args) {
	    	
	    	int arr[] = {23,54,67,89,76};
			int a;
			for(int i=0;i<5;i++)
			{
				for(int j=i;j<5;j++)
				{
					if(arr[i]>arr[j])
					{
						a=arr[i];
						arr[i]=arr[j];
						arr[j]=a;
					}
				}
				
			}
			System.out.println(Arrays.toString(arr));
	        
	       
    }
}
