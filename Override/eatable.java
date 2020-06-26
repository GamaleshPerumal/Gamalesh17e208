package override;
class fruit
{
	String name;
	String taste;
	String size;
	fruit(String name,String taste,String size)
	{
		this.name=name;
		this.taste=taste;
		this.size=size;
	}
	public void eat()
	{
		System.out.println(name+" "+"is in "+" "+taste+" ");
	}
}
class Apple extends fruit{
	Apple(String name,String taste,String size)
	{
		super(name,taste,size);
	}
	public void eat()
	{
		System.out.println(name+" "+"is in "+" "+taste+" ");
	}
}
class Mango extends fruit{
	Mango(String name,String taste,String size)
	{
		super(name,taste,size);
	}
	public void eat()
	{
		System.out.println(name+" "+"is in "+" "+taste+" ");
	}
}
public class eatable {
	public static void main(String[] args) {
		fruit f;
		Apple a=new Apple("Apple","Sweet","medium");
		f=a;
		f.eat();
		Mango m=new Mango("Mango","Sweet","medium");
		f=m;
		f.eat();
		
	}
	
	
}

