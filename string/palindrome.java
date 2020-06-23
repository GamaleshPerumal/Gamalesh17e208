public class palindrome {
	public static void main(String[] args) {
		String a=args[0];
		StringBuffer s=new StringBuffer(a);
		String d=s.reverse().toString();
		if(a.equalsIgnoreCase(d))
		{
			System.out.println("True");
		}
		else
		{
			System.out.println("False");
		}
		
	}

}
