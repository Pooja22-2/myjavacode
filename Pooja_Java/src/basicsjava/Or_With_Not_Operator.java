package basicsjava;

public class Or_With_Not_Operator 
{
	public static void main(String[] args) 
	{
		int age=22;
		int salary=30000;
		if(!(age>23 || salary==30000)) //O/p displays opposite to the OR Operator
		{
			System.out.println("Be Ready");
		}
		else
		{
			System.out.println("Not Ready");
		}
			
		
	}

}
