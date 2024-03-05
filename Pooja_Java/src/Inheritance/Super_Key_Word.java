package Inheritance;
class College_Class
{
	void bookstowrite()
	{
		System.out.println("writing to study");
	}
}
public class Super_Key_Word extends College_Class
{
	void bookstowrite()
	{
		
		System.out.println("writing to top the class");
		super.bookstowrite(); //for method overriding "Super keyword" execute first then execute others 
	}
	public static void main(String[] args) 
	{
		Super_Key_Word S1=new Super_Key_Word();
		S1.bookstowrite();
	

	}

}
