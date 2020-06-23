public class shortout {
	public static void main(String[] args) {
		String a=new String(args[0]);
		String b=new String(args[1]);
		int c=a.length();
		int d=b.length();
		if(c<d)
		{
			
			System.out.println(a+b+a);
		}
		else
		{
			System.out.println(b+a+b);
		}
		
	}

}
