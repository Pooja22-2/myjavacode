package Abstract;
abstract class Parent_Class
{
	abstract void add(); //Abstract Methods (Abstract should always be non-static methods)
	abstract void sub(); //Abstract Methods
	void multi()         //Concrete method non-static (Concrete can be static or non-static)
	{
		System.out.println("Expose the code to the Third party 1");
	}
	static void div()           //Concrete method static 
	{
		System.out.println("Expose the code to the Third party 2");
	}
}
public class Abstract_Method extends Parent_Class
{                          //when Abstract method is added in child class should override the Parent method
	
	void add() 
	{
		System.out.println("Don't want to Expose the code to the Third party1");
	}

	
	void sub() 
	{
		System.out.println("Don't want to Expose the code to the Third party2");
	}


	public static void main(String[] args) 
	{
		Abstract_Method A1=new Abstract_Method();
		A1.add();
		A1.sub();
		A1.multi();
		div();
		
		
	}

}
