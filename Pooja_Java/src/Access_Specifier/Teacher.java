package Access_Specifier;

public class Teacher {

	public static void main(String[] args) 
	{
		Student S1=new Student();
		S1.learningAT();
		S1.MT();
		S1.SQL();
		//S1.API(); will not be able to access Students Private method

	}

}
