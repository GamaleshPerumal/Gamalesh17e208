public class Test22 {
	public static void main(String[] args) {
		
	
	int a=Integer.parseInt(args[0]);
	int b,c=0;
	int d;   
	d=a;    
	  while(a>0){    
	   b=a%10;  //getting remainder  
	   c=(c*10)+b;    
	   a=a/10;    
	  }    
	  if(c==d)  
	  {
	   System.out.println("palindrome number ");   
	  }
	  else    
	  {
		  
	  
	   System.out.println("not palindrome number");    
	  }

}
}

