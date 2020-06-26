package inheri;
 class Animal{
	public void eat() {
		System.out.println("eats");
}
	public void sleep()
	{
		System.out.println("sleeps");
	}
}
 class bird extends Animal
{
	public void fly()
	{
		System.out.println("flies");
	}
}

public class anibird {
	public static void main(String[] args) {
		Animal a=new Animal();
		a.eat();
		a.sleep();
		bird b=new bird();
		b.eat();
		b.sleep();
		b.fly();
	}

}
