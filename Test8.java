public class Test8 {
	public static void main(String[] args) {
		if (args.length==0)
		{
			System.out.println("No values");
			
		}
		else if(args.length==1)
		{
			System.out.println(args[0]);
		}
		else
		{
			for(int i=0;i<args.length;i++)
			{
				if(i<args.length-1)
				{
				System.out.print(args[i]+",");
			}
				else
				{
					System.out.print(args[i]);
				}
		}
	}

}
}