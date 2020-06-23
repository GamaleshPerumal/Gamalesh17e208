package gg3;
import java.util.Arrays;

public class Test32 {
	public static void moveoddeven(int arr[])
	{
	int b=arr.length;
	int brr[]=Arrays.copyOf(arr,arr.length);
		int c=0;
		
		for(int i=0;i<b;i++)
		{
			if(arr[i]%2==0)
			{
				arr[c++]=arr[i];
				
				
			}
		}
		
		for(int i=0;i<brr.length;i++)
		{
			
				
			
			if(brr[i]%2!=0)
			{
				arr[c++]=brr[i];
				
				
			}
			
		}
		for(int i=0;i<b;i++)
		{
			System.out.print(arr[i]+" ");
		}
		
	}
	public static void main(String[] args) {
		int arr[]= {2,3,4,5,6,7,8};
		moveoddeven(arr);
		
	}

}
