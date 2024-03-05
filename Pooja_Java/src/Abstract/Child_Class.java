package Abstract;
abstract class Emire //create 2Abstract Method and 2Concrete Method
{
	abstract void Animal();
	abstract void Birds();
	void add()
	{
		System.out.println("non-static expose to third party");
	}
	static void sub()
	{
		System.out.println("static expose to third party");
	}
}
abstract class Child1_Class extends Emire //create 2Abstract Method and 2Concrete Method
{
	abstract void Plants();
	abstract void Nature();
	static void multi()
	{
		System.out.println("static expose to third party");
	}
	void div()
	{
		System.out.println("non-static expose to third party");
	}
}

public class Child_Class extends Child1_Class //Create 2Concrete Method
{
	void add()
	{
		System.out.println("non-static not to expose to third party");
	}
	static void sub()
	{
		System.out.println("static not to expose to third party");
	}
	@Override
	void Plants() 
	{
		System.out.println("Abstract Method Plant");
	}
	void Nature() 
	{
		System.out.println("Abstract Method Nature");
	}
	@Override
	void Animal() 
	{
		System.out.println("Abstract Method Animal");
	}
	@Override
	void Birds() 
	{
		System.out.println("Abstract Method Birds");
	}
public static void main(String[] args) //Main Method
{
	Child_Class C1=new Child_Class();
	C1.Animal();
	C1.Birds();
	C1.add();
	sub();
	C1.Plants();
	C1.Nature();
	multi();
	C1.div();
}	
}
	

	


