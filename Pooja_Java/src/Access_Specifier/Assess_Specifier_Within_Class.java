//We can Access all the methods present in the class to main method

package Access_Specifier;

public class Assess_Specifier_Within_Class 
{
	public static void add() //public Access specifier
	{
		
	}
	private static void sub() //private Access specifier
	{
		
	}
	protected void mul() //protected Access specifier
	{
		
	}
	void div() //default/package Access specifier
	{
		
	}

	public static void main(String[] args) 
	{
		add();
		sub();
		Assess_Specifier_Within_Class A1=new Assess_Specifier_Within_Class();
		A1.mul();
		A1.div();
		
		

	}

}
