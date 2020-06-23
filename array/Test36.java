public class Test36 {
	public static void main(String[] args) {
		if(args.length!=9)
		{
			System.out.println("Please enter 9 integer numbers");
		}
		else
		{
			int a=args.length;
			int arr[][]=new int[3][3];
			int b=0;
			System.out.println("Given Array:");
			for(int i=0;i<3;i++)
			{
				for(int j=0;j<3;j++)
				{
					arr[i][j]=Integer.parseInt(args[b]);
					b++;
					System.out.print(arr[i][j]+" ");
				}
				System.out.println(" ");
			}
			
			for(int i=0;i<3;i++)
			{
				for(int j=0;j<3;j++)
				{
					if(arr[i][j]>arr[0][0])
					{
						arr[0][0]=arr[i][j];
					}
				}
			}System.out.println("The biggest number in the given array is "+arr[0][0]);
	}

}
}
