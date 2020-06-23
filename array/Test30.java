package gg3;



/*public class Test30 {
	public static void main(String[] args) {
		int arr[]= {7,1,2,3,6};
		
		
		int a=6;
		int b=7;
		
		int c;
		c=indexOf(arr,a);
		int d;
		d=indexOf(arr,b);
		int e=0;
		for(int i=0;i<c;i++)
		{
			e=e+arr[i];
			System.out.println(e);
		}
		for(int i=d+1;i<arr.length;i++)
		{
			e=e+arr[i];
			System.out.println(e);
		}
		System.out.println(e);
		
	}
	private static int indexOf(int[] arr, int a) {
		// TODO Auto-generated method stub
		int j;
		for( j=0;j<arr.length;j++)
		{
			if(arr[j]==a)
			{
				return j;
			}
		}return j;
	}

}*/
// Java implementation of above approach 

// Function to find sum 
// of array exlcuding the 
// range which has [a, b] 


class Test30
{ 
static void sumcal(int li[],int a, int b) 
{ 
	int sum = 0; 
	boolean add = true; 
	
	
	for (int i = 0; 
			i < li.length; i++) 
	{ 
		
		
		if (li[i] != a && 
			add == true)
		{
			sum = sum + li[i]; 
			
		}
	 
		else if (li[i] == a) 
			add = true; 
		else if( li[i] == b) 
			add = false; 
	} 
	
	
	System.out.print(sum); 
} 

 
public static void main(String[] args) 
{ 
	int lis[] = { 7,1,2,3,6}; 
	int a = 6; 
	int b = 7; 
	
	sumcal(lis, a, b); 
} 
} 


