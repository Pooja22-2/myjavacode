package String;

public class String_Functions 
{

public static void main(String[] args) 
{   
	String name=" Pooja Jairam ";     //String lenght
	int c1=name.length();
	System.out.println(c1);
	
	String c2=name.toUpperCase(); //touppercase
	System.out.println(c2);
	
	String c3=name.toLowerCase();
	System.out.println(c3);       //toLowercase
	
	char c4=name.charAt(2);     //CharAt(Index)
	System.out.println(c4); 
	
	String c5=name.trim();       //trim
	System.out.println(c5); 
	
	String name1="Sai";          //concat - to combain both the names
	String surname="Raj";
	String space=" ";            //if we need space between name and surname
	String fullname=name1.concat(space).concat(surname);
	System.out.println(fullname);
	
	
	
	
			
	

}
}

