package gg3;
import java.util.Arrays;

public class Test29 {
	public static void main(String[] args) {        
	       int arr[]= {1,2,3,2,2,4,3,54,6,3};	         	        
	       int n= arr.length;	         	        	         
	        for (int i = 0; i <n; i++) 
	        {
	            for (int j = i+1; j < n; j++)
	            {	                	                 
	                if(arr[i] == arr[j])
	                {	                    	                     
	                    arr[j] = arr[n-1];	                     
	                    n--;	             
	                    j--;
	                }
	            }
	        }
	     int[] arr1 = Arrays.copyOf(arr, n);
	       System.out.println();
	        for (int i = 0; i < arr1.length; i++)
	        {
	            System.out.println(arr1[i]);
	        }   
	    }
}


