public class Test9 {
	public static void main(String[] args) {
		
		String a=args[0];
		char b=a.charAt(0);
		String c=args[1];
		char d=c.charAt(0);
		int e=b;
		int f=d;
		if(e>f)
		{
			System.out.println(c+","+a);
		}
		else if(e<f)
		{
			System.out.println(a+","+c);
		}
	}

}
