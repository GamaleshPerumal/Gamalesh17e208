package override;
class Shape{
	String Shape;
	Shape(String Shape)
	{
		this.Shape=Shape;
	}
	public void draw()
	{
		System.out.println("Drawing"+" "+Shape);
	}
	public void erase()
	{
		System.out.println("Erasing"+" "+Shape);
	}
}
class Triangle extends Shape{
	Triangle(String Shape)
	{
		super(Shape);
	}
	public void draw()
	{
		
		System.out.println("Drawing"+" "+Shape);
	}
	public void erase()
	{
		System.out.println("Erasing"+" "+Shape);
	}
	
}
class Circle extends Shape{
	Circle(String Shape)
	{
		super(Shape);
	}
	public void draw()
	{
		
		System.out.println("Drawing"+" "+Shape);
	}
	public void erase()
	{
		System.out.println("Erasing"+" "+Shape);
	}
	
}

class Square extends Shape{
	Square(String Shape)
	{
		super(Shape);
	}
	public void draw()
	{
		
		System.out.println("Drawing"+" "+Shape);
	}
	public void erase()
	{
		System.out.println("Erasing"+" "+Shape);
	}
	
}

public class Diagram {
	public static void main(String[] args) {
		Shape T=new Triangle("Triangle");
		T.draw();
		T.erase();
		Shape C=new Circle("Circle");
		C.draw();
		C.erase();
		Shape S=new Square("Triangle");
		S.draw();
		S.erase();
		
	}
	

}
