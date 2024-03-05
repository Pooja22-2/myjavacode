package Arrays_Functions;

import java.util.Arrays;

public class Int 
{
	public static void main(String[] args) 
	{
		int age[]=new int[3];
		age[0]=20;
		age[1]=50;
		age[2]=40;
		age[2]=30; //updated the value
		Arrays.sort(age);
		for(int i=0;i<=2;i++)
		{
			System.out.println(age[i]);
		}
		
	}
	

}
