package basicsjava;

public class Static_NonStatic_SameMethod 
{
	void add(int a,double b,double c)
	{
		System.out.println("Non-satic 1");
	}
	void add(int b,int a,double c)
	{
		System.out.println("Non-satic 2");
	}
	void add(double c,String gender,int a)
	{
		System.out.println("Non-satic 3");
	}
	void add(int d,int a,char gender)
	{
		System.out.println("Non-satic 3");
	}
	static void add(String name,int b,double c)
	{
		System.out.println("Satic 1");
	}
	static void add(char b,String name,double c)
	{
		System.out.println("Satic 2");
	}
	static void add(int n,double c,int a)
	{
		System.out.println("Satic 3");
	}
	static void add(char b,int a,String name)
	{
		System.out.println("Satic 4");
	}
public static void main(String[] args) 
{
	Static_NonStatic_SameMethod s1=new Static_NonStatic_SameMethod();
	s1.add(2,2.2,4.4);
	s1.add(3,3,5.5);
	s1.add(6.6,"female",4);
	s1.add(2.2,"pooja",4);
	add("pooja",3,4.5);
	add(2,3.3,3);
	add('m',4,"pooja");
	add('c',"sample",5.5);
}	
	
}
