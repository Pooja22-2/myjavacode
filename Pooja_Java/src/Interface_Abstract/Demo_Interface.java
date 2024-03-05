package Interface_Abstract;
interface one
{
	void add();
	void sub();
}
abstract class Lunch implements one
{
	abstract void Chapathi();
	abstract void Rice();
}
abstract class Dinner extends Lunch
{
	abstract void Milk();
	abstract void Chapathi1();
	void drink()
	{
		System.out.println("Drink");
	}
	void eat()
	{
		System.out.println("eat");
	}
}
public class Demo_Interface extends Dinner //un_implements methods auto implements or overide
{

	public static void main(String[] args) 
	{
		Demo_Interface D1=new Demo_Interface();
		D1.add();
		D1.sub();
		D1.drink();
		D1.eat();
		D1.Chapathi();
		D1.Rice();
		D1.Milk();
		D1.Chapathi1();
	}

	@Override
	public void add() 
	{
		System.out.println("add should overide");
	}

	@Override
	public void sub() 
	{
		System.out.println("sub should overide");
	}

	@Override
	void Milk() 
	{
		System.out.println("Milk should overide");
	}

	@Override
	void Chapathi1() 
	{
		System.out.println("Chapathi1 should overide");
	}

	@Override
	void Chapathi() 
	{
		System.out.println("Chapathi should overide");
	}

	@Override
	void Rice() 
	{
		System.out.println("Rice should overide");
	}

}
