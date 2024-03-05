package basicsjava;

public class Static_NonStatic_Constructor 
{
	Static_NonStatic_Constructor()
	{
		System.out.println("This is a Constructor");
	}
void a(String a,char c,double d)
{
	System.out.println("Non_Static_1 Method");
}
void b(char c,double d,String a)
{
	System.out.println("Non_Static_2 Method");
}
static void add()
{
	int a=2;
	int b=3;
	System.out.println(a+b);
}
static void sub()
{
	int a=2;
	int b=3;
	System.out.println(a-b);
}

 public static void main(String[] args) 
 {
     add();
     sub();
     Static_NonStatic_Constructor s1=new Static_NonStatic_Constructor();
     s1.a("String",'P',1.22);
     s1.b('P',1.22,"String");
     
    // Static_NonStatic_Constructor s2=new Static_NonStatic_Constructor();
     
     
 }
{
	
}
}
