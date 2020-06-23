public class Test11 {
	public static void main(String[] args) {
		String gender=args[0];
		int b=Integer.parseInt(args[1]);
		if( gender.equals("Female"))
		{
			System.out.println(gender+b);
			if((b>=1)&&(b<=58))
			{
				System.out.println("the percentage of interest is 8.2%");
			}
		
		
			else if((b>=59)&&(b<=100))
			{
				System.out.println("the percentage of interest is 9.2%");
			}
		}
		
		else if(gender.equals("Male") )
		{
			if((b>=1)&&(b<=58))
			{
				System.out.println("the percentage of interest is 8.4%");
			}
		
			else if((b>=59)&&(b<=100))
			{
				System.out.println("the percentage of interest is 10.5%");
			}
		}
	}

}
