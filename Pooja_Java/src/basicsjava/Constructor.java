package basicsjava;

public class Constructor 
{
	Constructor() //Constructor
	{
		System.out.println("This is a Constructor");
	}
public static void main(String[] args) 
{
	Constructor c1=new Constructor(); //Non-Static
	System.out.println("This is a main method");
	
}
}

/*It doesn't have any Return Type
It always a Non-Static
Constructor name will be same as class name
Constructor can be Parameterized or Non-Parameterized
Constructor will have all Specifier*/
