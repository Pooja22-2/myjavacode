package ThisKeyword;

public class This_Keyword 
{
	String name;
	int age;
	double salary;
	void employee(String name,int age,double salary)
	{
		this.name=name;
		this.age=age;
		this.salary=salary;
	} 

	public static void main(String[] args) 
	{
		This_Keyword T1=new This_Keyword();
		T1.employee("Pooja", 28, 40000.0);
		System.out.println(T1.name);
		System.out.println(T1.age);
		System.out.println(T1.salary);
		

	}

}
