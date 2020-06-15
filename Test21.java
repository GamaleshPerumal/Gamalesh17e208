public class Test21 {
	public static void main(String[] args) {
		int a=Integer.parseInt(args[0]);
		while(a!=0)
		{
			int d=a%10;
			System.out.print(d);
			a/=10;
		}
	}

}
