package basicsjava;

public class Static4_NonStatic4 
{
	Static4_NonStatic4()
	{
		System.out.println("This a constructor and non-parameterized");
	}
void add()
{
	int a=2;
	int b=4;
	System.out.println(a+b);
}
void sub()
{
	int c=5;
	int d=3;
	System.out.println(c-d);
}
void mul()
{
	int a=9;
	int b=2;
	System.out.println(a*b);
}
void div()
{
	int c=6;
	int d=2;
	System.out.println(c/d);
}
static void even()
{
	int number=64;
	if(number%2==0)
	{
		System.out.println("Even Number");
	}
	else 
	{
		System.out.println("Odd Number");
	}
}	
static void age()
{
	int age=22;
	int weight=50;
	if(age>22 && weight>=50)
	{
		System.out.println("can donate blood");
	
    }
	else
	{
		System.out.println("cannot donate blood");
	}
	
}
static void gender()
{
	String gender="Female";
	System.out.println(gender);
}
static void gender1()
{
	String gender1="Male";
	System.out.println(gender1);
}
public static void main(String[] args) 
{
	Static4_NonStatic4 s1=new Static4_NonStatic4();
	s1.add();
	s1.sub();
	s1.mul();
	s1.div();
	even();
	age();
	gender();
	gender1();
}

}
