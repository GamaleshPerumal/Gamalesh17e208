public class Test19 {
	public static void main(String[] args) {
		int a=Integer.parseInt(args[0]);
		int sum;
		for( sum=0 ;a!=0 ;a/=10)
		{
		sum+=a%10;
		}
		System.out.println(sum);
	}

}
