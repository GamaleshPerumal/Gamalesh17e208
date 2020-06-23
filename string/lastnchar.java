public class lastnchar {
	public static void main(String[] args) {
		StringBuffer a=new StringBuffer(args[0]);
		int b=Integer.parseUnsignedInt(args[1]);
		int c=b;
		while(c!=0)
		{
			System.out.print(a.substring(b-1));
			c=c-1;
		}
	}

}
