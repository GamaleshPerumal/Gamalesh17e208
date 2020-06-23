package classifications;

public class book extends Author{
	String Bname;
	double price;
	int qtyInStock;
	public book(String Aname,String email,char gender,String Bname,double price,int qtyInStock)
	{
		super( Aname, email, gender);
		this.Bname=Bname;
		this.price=price;
		this.qtyInStock=qtyInStock;
	}
	public String getAname()
	{
		return Aname;
	}
	public String getBname()
	{
		return Bname;
	}
	public String getEmail()
	{
		return email;
	}
	public char getgender()
	{
		return gender;
	}
	public double getPrice()
	{
		return price;
	}
	public int getQtyInStock()
	{
		return qtyInStock;
	}
	
	

}
