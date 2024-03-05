package Arrays_Functions;

public class Count_of_AlphaNumberic {

	public static void main(String[] args) 
	{
		String name="Sky is 144*&%$#";
		char[] c1=name.toCharArray(); //count each char
		int count_of_alpha=0;         //no.of alpha 
		int count_of_numeric=0;       //no.of numeric
		int count_of_space=0;         //no.of space
		int count_of_specialchar=name.length()-(count_of_alpha+count_of_numeric+count_of_space);
		
		for(int i=0;i<=name.length()-1;i++)
		{
			
			boolean answer=Character.isAlphabetic(c1[i]);
			boolean answer1=Character.isDigit(c1[i]);
			boolean answer2=Character.isSpaceChar(c1[i]);
			if(answer==true)
			{
				count_of_alpha++;
			}
			if(answer1==true)
			{
				count_of_numeric++;
			}
			if(answer2==true)
			{
				count_of_space++;
			}
		}
			System.out.println("count of alpha in the given string"+count_of_alpha++);
			System.out.println("count of numeric in the given string"+count_of_numeric++);
			System.out.println("count of space in the given string"+count_of_space++);
			System.out.println("count of specialchar in the given string"+count_of_specialchar++);
			
		}

	

}
