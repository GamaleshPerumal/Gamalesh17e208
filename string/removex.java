public class removex {
	public static void main(String[] args) {
		StringBuffer a=new StringBuffer(args[0]);
		int n=a.length();
		if(a.charAt(0)=='x' && a.charAt(n-1)=='x')
		{
			System.out.println(a.substring(1,n-1));
		}
		else
		{
			System.out.println(a);
		}
	}
	
	

}
