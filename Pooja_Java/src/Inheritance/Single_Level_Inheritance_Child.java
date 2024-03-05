//one Parent one child using static

package Inheritance;
class Parent
{
	static void add(int a,int b)
	{
		System.out.println(a+b);
	}
}
public class Single_Level_Inheritance_Child extends Parent
{
	static void sub(int a,int b)
	{
		System.out.println(a-b);
	}
	public static void main(String[] args) 
	{
		add(1,4);
		sub(5,1);
	}

}
