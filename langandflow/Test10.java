public class Test10 {
	public static void main(String[] args) {
		String a=args[0];
		char b=a.charAt(0);
		int c=b;
		if((c>=65)&&(c<=122))
		{
			System.out.println("Alphabets");
		}
		else if((c>=48)&&(c<=57))
		{
			System.out.println("Numbers");
		}
		else
		{
			System.out.println("Special Characters");
		}
		}

}
