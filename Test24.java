package gg3;

public class Test24 {
	public static void main(String[] args) {
		int arr[]= {1,2,3,4,5};
		int max=arr[0];
		for (int i = 1; i < arr.length; i++) 
		{
	         if (arr[i] > max) max = arr[i];
		}
		int min=arr[0];
		for (int i = 1; i < arr.length; i++)
		{
	         if (arr[i] < min) min = arr[i];
		}System.out.println("Max:"+max);
		System.out.println("Min:"+min);
	}
}
