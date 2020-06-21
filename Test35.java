public class Test35 {
	public static void main(String[] args) {
		
		if (args.length!=4)
		{
			System.out.println("Please enter 4 integer numbers");
		}
		else
		{
			int a=args.length;
			int arr[][]=new int[args.length][args.length];
			int b=0,c;
			for(int i=0;i<args.length/2;i++)
			{
				for(int j=0;j<args.length/2;j++)
				{
				c=Integer.parseInt(args[b]);
				arr[i][j]=c;
				b++;
				}
			}
			System.out.println("Given Array:");
			for(int i=0;i<arr.length/2;i++)
			{
				for(int j=0;j<args.length/2;j++)
				{
			
				System.out.print(arr[i][j]+" ");
			}
				System.out.println(" ");
			}
			System.out.println("Reversed Array:");
			for(int i=1;i>=0;i--)
			{
				for(int j=1;j>=0;j--)
				{
			
				System.out.print(arr[i][j]+" ");
			}
				System.out.println(" ");
			}
			
		}
	}

}