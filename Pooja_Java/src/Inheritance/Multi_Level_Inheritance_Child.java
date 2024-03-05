package Inheritance;

class Grand_Parent
{
	void add()
	{
		System.out.println("addition");
	}
	void sub()
	{
		System.out.println("subraction");
	}
	
}
class Pooja extends Grand_Parent
{
	void mul()
	{
		System.out.println("multiplication");
	}
	void div()
	{
		System.out.println("division");
	}
	
}

public class Multi_Level_Inheritance_Child extends Pooja
{
	void mod()
	{
		System.out.println("modulus");
	}

	public static void main(String[] args) 
	{
		Multi_Level_Inheritance_Child m1=new Multi_Level_Inheritance_Child();
		m1.add();
		m1.sub();
		m1.mul();
		m1.div();
		m1.mod();
		
	}

}
