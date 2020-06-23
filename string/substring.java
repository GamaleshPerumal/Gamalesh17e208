public class substring {
	public static void main(String[] args) {
		StringBuffer a=new StringBuffer(args[0]);
		int c=a.length();
		StringBuffer b=new StringBuffer(args[1]);
		int d=b.length();
		if(a.charAt(c-1)==(b.charAt(0)))
		{
			String e=new String(a.substring(0, c-1)+b.substring(0,d));
			System.out.println(e.toLowerCase());
			
		}
		else
		{
			String f=new String(a.substring(0, c)+" "+b.substring(0,d));
			System.out.println(f.toLowerCase());
		}
		
	}

}
