//Super calling with parameterised with parent and child lass
package Inheritance;
class Super_Calling_Para
{
	Super_Calling_Para(int a)
	{
		System.out.println("Parent Constructor");
	}
}
public class Town_Class extends Super_Calling_Para
{
	Town_Class()
	{
		super(100);
		System.out.println("Child Constructor");
	}
public static void main(String[] args) 
{
	new Town_Class();
}
}

