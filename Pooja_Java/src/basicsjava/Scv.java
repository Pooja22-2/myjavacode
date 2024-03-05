package basicsjava;
import java.util.*;
public class Scv 
{ 
static int s1;
static int s2;

	static void add()
	{
		
		System.out.println(s1+s2);
	}
	static void sub()
	{

		System.out.println(s1-s2);
	}
	static void mul()
	{
		
		System.out.println(s1*s2);
	}
	static void div()
	{
		
		System.out.println(s1/s2);
	}
	static void mod()
	{
		
		System.out.println(s1%s2);
	}

	public static void main(String[] args) 
	{
		Scanner s3=new Scanner(System.in);
		System.out.println("Enter the number for Addition");
		s1=s3.nextInt();
		s2=s3.nextInt();
		add();
		System.out.println("Enter the number Substaction");
		s1=s3.nextInt();
		s2=s3.nextInt();
		sub();
		System.out.println("Enter the number Multiplication");
		s1=s3.nextInt();
		s2=s3.nextInt();
		mul();
		System.out.println("Enter the number Division");
		s1=s3.nextInt();
		s2=s3.nextInt();
		div();
		System.out.println("Enter the number Modulus");
		s1=s3.nextInt();
		s2=s3.nextInt();
		mod();
		
		
		
	}

}
