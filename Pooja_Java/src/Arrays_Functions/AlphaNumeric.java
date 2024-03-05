package Arrays_Functions;

public class AlphaNumeric {

	public static void main(String[] args) 
	{
		String name="poojasubbs123";
		char[] c1=name.toCharArray(); 
		for(int i=0;i<name.length();i++)
		{
		boolean answer=Character.isAlphabetic(c1[i]);
		if(answer==true)
		{	
		    System.out.println("Index position"+i +"is "+"Alphabet");
	    }
		else
		{
			System.out.println("Index position"+i +"is "+"Numeric");
		}
		
	}
	}
}



	


