package Inheritance;
public class Single_Level_Inheritance_Child2 extends Single_Level_Inheritance_Child
{
	static void mul(int a,int b)
	{
		System.out.println(a*b);
	}
	public static void main(String[] args) 
	{
		add(1,4); //parent from Single_Level_Innheritance(Parent class)
		mul(5,1); //Child2)
	    sub(2,5); 
		
	}

}