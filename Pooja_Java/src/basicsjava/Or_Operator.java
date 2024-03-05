package basicsjava;

public class Or_Operator 
{
	public static void main(String[] args) 
	{
		int age=19;
		char gender='M';
		if(age<18 || gender!='M') //"OR" operator if any one condition is true then o/p becomes true
		{                         //if both condition age and gender false then the o/p is false  
			System.out.println("elligible for vote");
		}
		else
		{
			System.out.println("not elligible for vote");
		}
		
	}

}

