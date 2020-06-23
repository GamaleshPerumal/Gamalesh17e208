package gg3;

public class Test27 {
	public static void main(String[] args) {
		int arr[]= {2,4,3,1,6};
		int temp;
		for(int i=0;i<arr.length;i++)
		{
			for(int j=i+1;j<arr.length;j++)
			{
			if(arr[i]>arr[j])
			{
				temp=arr[i];
				arr[i]=arr[j];
				arr[j]=temp;
			}
			}
		}
		System.out.println("1st two Largest elements:"+arr[arr.length-1]+" "+arr[arr.length-2]);
		System.out.println("1st two Smallest elements:"+arr[0]+" "+arr[1]);

	}
}

