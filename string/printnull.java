public class printnull {
	public static void main(String[] args) {
		StringBuffer a=new StringBuffer(args[0]);
		int n=a.length();
		if(n%2==0)
		{
			System.out.println(a.substring(0, n/2));
		}
		else
		{
			System.out.println("null");
		}
	}

}
