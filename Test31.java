package gg3;

public class Test31 {
	public static void pushzero(int arr[],int b)
	{
		int d=0;
		for(int i=0;i<b;i++)
		{
			if(arr[i]!=0)
			{
				arr[d++]=arr[i];
			}
		}
		while(d<b)
		{
			arr[d++]=0;
		}
	}
	public static void removeten(int arr[])
	{
		
		int b=arr.length;
		int c=10;
		for(int i=0;i<b;i++)
		{
			if(arr[i]==c)
			{
				arr[i]=arr[i]-c;
			}
		}
		pushzero(arr,b);
		for(int i=0;i<b;i++)
		{
			System.out.print(arr[i]+" ");
		}
		
	}
	public static void main(String[] args) {
		int arr[]= {10,2,10,4,10,3,6};
		removeten(arr);
		
		
	}

}
