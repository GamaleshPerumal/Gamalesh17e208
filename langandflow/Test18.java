public class Test18 {
	public static void main(String[] args) {
		int a=10;
		int c=99;
		
		for (int j=a;j<=c;j++)
		{
			boolean b = false;
        for(int i = 2; i <= j/2; ++i)
        {
            
            if(j % i == 0)
            {
                b = true;
                break;
            }
        }

        if (!b)
            System.out.println(j + " is a prime number.");
        else
            System.out.println(j + " is not a prime number.");
    }

}
}
