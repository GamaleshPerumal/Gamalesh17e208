public class removefl {
	public static void main(String[] args) {
		String a=new String(args[0]);
		StringBuffer b=new StringBuffer(a);
		System.out.println(b.substring(1, b.length()-1));
	}

}
