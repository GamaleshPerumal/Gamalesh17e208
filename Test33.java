package gg3;

public class Test33 {
	public static void main(String[] args) {
		int arr[]= {1,2,1,4};
		boolean a=true;
		for(int i=0;i<arr.length;i++)
		{
			if(arr[i]!=1)
			{
				if(arr[i]!=4)
				{
					a=false;
				}
			}
		}
		if(a==true)
		{
			System.out.println("True");
		}
		else
		{
			System.out.println("False");
		}
	}

}
