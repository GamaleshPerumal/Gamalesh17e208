package gg3;
import java.util.Scanner;

public class Test25 {
	public static void main(String[] args) {
		int arr[]= {22,33,224,88,5,9,};
		Scanner myInput = new Scanner( System.in );
		int a = myInput.nextInt();
		int b=0;
		int c=0;
		for(int i=0;i<arr.length;i++)
			{
			if(a==arr[i])
			{
				b+=a;
				c+=i;
			}
	}
		if(b==a)
		{
			System.out.println("Index:"+c);
		}
		else
		{
			System.out.println("-1");
		}

}
}

