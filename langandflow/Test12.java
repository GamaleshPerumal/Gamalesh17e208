public class Test12 {
	public static void main(String[] args) {
		String a=args[0];
		char b=a.charAt(0);
		int c=b;
		if((c>=65)&&(c<=90))
		{
			int d=c+32;
			char e=(char)d;
			System.out.println(e);
			
		}
		if((c>=97)&&(c<=122))
		{
			int f=c-32;
			char g=(char)f;
			System.out.println(g);
		}
	}

}
