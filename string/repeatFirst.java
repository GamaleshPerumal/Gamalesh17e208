public class repeatFirst {
	public static void main(String[] args) {
		StringBuffer a=new StringBuffer(args[0]);
		int n=a.length();
		for(int i=0;i<n;i++)
		{
			System.out.print(a.substring(0, 2));
		}
	}
	
	

}
