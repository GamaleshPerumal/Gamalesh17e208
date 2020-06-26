package inheri;

public class employee extends person {
	double sal;
	int year;
	String insnum;
	 employee(String name,double sal,int year,String insnum)
	{
		super(name);
		this.sal=sal;
		this.year=year;
		this.insnum=insnum;
	}
	 public void getSal()
	 {
		 System.out.println(sal);
	 }
	 public void getYear()
	 {
		 System.out.println(year);
	 }
	 public void getInsnum()
	 {
		 System.out.println(insnum);
	 }

}
