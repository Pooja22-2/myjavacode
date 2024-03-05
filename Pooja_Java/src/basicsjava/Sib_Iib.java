package basicsjava;

public class Sib_Iib 
{
	static
	{
		System.out.println("SIB");
	}
	Sib_Iib() 
	{
		System.out.println("constructor");
	}
	{
		System.out.println("IIB");
	}
	public static void main(String[] args) 
	{
		System.out.println("main method");
		new Sib_Iib ();
	}
}
