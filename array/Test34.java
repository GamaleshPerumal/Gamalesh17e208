package gg3;

public class Test34 {
	public static int findmid(int crr[])
	{ 
		int c=0;
		for(int i=0;i<crr.length;i++)
		{
			if(i==1)
			{
				c=c+crr[i];
				
			}
		}return c;
	}
	public static void main(String[] args) {
		int arr[]= {1,5,3};
		int brr[]= {1,2,3};
		int a;
		a=findmid(arr);
		int b=findmid(brr);
		int drr[]= {a,b};
		for(int i=0;i<drr.length;i++)
		{
			System.out.print(drr[i]+" ");
		}
	}

}
