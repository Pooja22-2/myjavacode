//Arrary of length 3 of int datatype and add its value of rum time

package Arrays_Functions;

import java.util.Arrays;
import java.util.Scanner;

public class ManualEnter_Int {

	public static void main(String[] args) 
	{
		int[] rollno=new int[3]; //length of 3 int datatype
		Scanner s1=new Scanner(System.in); //runtime
		for(int i=0;i<3;i++)
		{
			System.out.println("Enter the rollno");
			rollno[i]= s1.nextInt();
		}
			Arrays.sort(rollno);
			System.out.println(Arrays.toString(rollno));
		}
		
	}

