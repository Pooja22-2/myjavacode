package basicsjava;

public class ConstructorOverloading
{
	ConstructorOverloading()
	{
		System.out.println("This a first Constructor with no parameters");
	}
	ConstructorOverloading(String name,int a,String name1)
	{
		System.out.println("This a Second Constructor with parameters");
	}
	ConstructorOverloading(int Height,int weight,String name)
	{
		System.out.println("This a Third Constructor with parameters");
	}
	ConstructorOverloading(String name,int age,int weight)
	{
		System.out.println("This a Forth Constructor with parameters");
	}
	ConstructorOverloading(char gender,int age,double a)
	{
		System.out.println("This a Fivth Constructor with parameters");
	}
	ConstructorOverloading(String name)
	{
		System.out.println("This a Sixth Constructor with parameters");
	}
	ConstructorOverloading(int a,String name,char gender)
	{
		System.out.println("This a Seventh Constructor with parameters");
	}
	ConstructorOverloading(double d,String name,int c)
	{
		System.out.println("This a Eight Constructor with parameters");
	}
	ConstructorOverloading(int a,String name,double c)
	{
		System.out.println("This a Ninth Constructor with parameters");
	}
	ConstructorOverloading(Boolean a)
	{
		System.out.println("This a Tenth Constructor with parameters");
	}
public static void main(String[] args) 
{
	new ConstructorOverloading();
	new ConstructorOverloading("Pooja",27,"Female");
	new ConstructorOverloading(5,48,"Pooja");
	new ConstructorOverloading("Subbu",30,7);
	new ConstructorOverloading('m',22,4.5);
	new ConstructorOverloading("Sushumna");
	new ConstructorOverloading(2,"Sushank",'M');
	new ConstructorOverloading(5.5,"Sample",22);
	new ConstructorOverloading(22,"Sample",5.5);
	new ConstructorOverloading(true);
}		
}
