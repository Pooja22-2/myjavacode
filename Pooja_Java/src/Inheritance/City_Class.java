package Inheritance;
class Super_Calling
{
	Super_Calling()
	{
		System.out.println("Parent Constructor");
	}
}
public class City_Class extends Super_Calling
{
	City_Class()
	{
		super(); //non_parameterize super calling Implicity(Without any force)
		System.out.println("Child Constructor");
	}

	public static void main(String[] args) 
	{
        new City_Class();  
	}

	}
