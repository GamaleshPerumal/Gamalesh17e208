public class test6 {
	public static void main(String[] args) {
		int a=Integer.parseInt(args[0]);
		int b=Integer.parseInt(args[1]);
		if (a>0)
		{
			if(b>0)
			{
				if(lastDigit(a,b))
				{
					System.out.println("True");
				}
				else
				{
					System.out.println("False");
				}
			}
		}
	}

	private static boolean lastDigit(int a, int b) {
		if(a%10==b%10)
		{
			return true;
		}
		else {
			return false;
		}
		
	}

}
