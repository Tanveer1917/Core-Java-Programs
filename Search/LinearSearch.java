package Search;

import java.io.*;
 
public class LinearSearch {
   
    // Returns index of x if it is present in arr[].
    int BinarySearch(int arr[], int x)
    {
        int l = 0, r = arr.length - 1;
        while (l <= r) {
            int m = l + (r - l) / 2;
 
            
            if (arr[m] == x)
                return m;
 
            
            if (arr[m] < x)
                l = m + 1;
 
            
            else
                r = m - 1;
        }
 
        
        return -1;
    }
 
   
    public static void main(String args[])
    {
        LinearSearch ob = new LinearSearch();
        int arr[] = { 2, 3, 4, 10, 40 };
        int n = arr.length;
        int x = 10;
        int result = ob.BinarySearch(arr, x);
        if (result == -1)
            System.out.println(
                "Element is not present in array");
        else
            System.out.println("Element is present at "
                               + "index " + result);
    }
}