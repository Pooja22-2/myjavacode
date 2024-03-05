
package Arrays_Functions;

public class Boolean {

	public static void main(String[] args) 
	{
		String name="pooja jairam";
		char[] c1=name.toCharArray(); 
		for(int i=0;i<name.length();i++)
		{
		boolean answer=Character.isSpaceChar(c1[i]);
		if(answer==true)
		System.out.println("There ia a space in a given string");
	}
	}

}
