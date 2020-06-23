public class Test17 {
	public static void main(String[] args) {
		int a=Integer.parseInt(args[0]);
		boolean b = false;
        for(int i = 2; i <= a/2; ++i)
        {
            
            if(a % i == 0)
            {
                b = true;
                break;
            }
        }

        if (!b)
            System.out.println(a + " is a prime number.");
        else
            System.out.println(a + " is not a prime number.");
    }

	}


