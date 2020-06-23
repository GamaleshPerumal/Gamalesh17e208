package classandoobj;
import java.math.*;

public class calculator {
	int num1;
	int num2;
	public calculator(int num1,int num2)
	{
		this.num1=num1;
		this.num2=num2;
	}
	 static int powerInt(int num1,int num2)
	{
		return (int)Math.pow(num1,num2);
	}
	static double powerDouble(double num1,double num2)
	{
		return Math.pow(num1,num2);
	}
	
	public static void main(String[] args) {
		calculator c=new calculator(5,6);
		System.out.println(c.powerInt(10,6));
		System.out.println(c.powerDouble(5,6));
		
	}

}
