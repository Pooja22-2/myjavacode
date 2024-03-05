package basicsjava;

public class And_With_Not_Operator 
{
	public static void main(String[] args) {
		int rating=8;
		String progress="good";
		if(!(rating<8 && progress=="Excellent")) 
		{
			System.out.println("Good Rating");
		}
		else 
		{
			System.out.println("Bad Rating");
		}
	}

}
