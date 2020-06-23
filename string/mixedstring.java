public class mixedstring {
	public static void main(String[] args) {
		{
			StringBuffer a=new StringBuffer(args[0]);
			StringBuffer b=new StringBuffer(args[1]);
			int n=a.length()+b.length();
			String c=new String();
			int d=0,e=0;
			while(n!=0)
			{
				if(n%2==0)
				{
					c=c+a.charAt(d);
					d=d+1;					
				}
				else
				{
					c=c+b.charAt(e);
					e=e+1;
				}
				n=n-1;
			}
			System.out.println(c);
		}
	}

}
