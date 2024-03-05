package basicsjava;

public class Call_Non_Static
{
	void add()
	{
		int a=22;
		int b=8;
		System.out.println("a+b");
		
	}
	void mult()
	{
		int a=12;
		int b=10;
		System.out.println("a*b");
	}
public static void main(String[] args)  
{                                             //Creating an Onject
	Call_Non_Static c1=new Call_Non_Static(); //classname referencevariable=new classname
	c1.add();                                  
	c1.mult();
}
	
	
}

