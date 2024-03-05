package Inheritance;
class Super_Calling_WithPara
{
	Super_Calling_WithPara(int a)
	{
		System.out.println("Parent Constructor");
	}
}
class Super_Calling2 extends Super_Calling_WithPara
{
	Super_Calling2()
	{
	    super(100);	
		System.out.println("Child1 Constructor");
	}
}
class super_Calling3 extends Super_Calling2
{
	super_Calling3(String name)
	{
		super();
		System.out.println("Child2 Constructor");
	}
}
public class Village_Class extends super_Calling3
{
	Village_Class()
	{
		super("Pooja");
		System.out.println("Child3 Constructor");
	}
public static void main(String[] args) 
	{
	    new Village_Class();
	}
}
