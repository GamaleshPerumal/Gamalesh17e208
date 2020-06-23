public class removestar {
	public static void main(String[] args) {
		{
			StringBuffer a=new StringBuffer(args[0]);
			int b=a.indexOf("*");
			
			
			a.delete(b-1, b+2);
			
			System.out.println(a);
		}
	}

}
