package basicsjava;

import Access_Specifier.Access_Outside_Package;

public class Access_other_Package_Class extends Access_Outside_Package
{

	public static void main(String[] args) 
	{
		Access_other_Package_Class A1=new Access_other_Package_Class();
		A1.mul();
		A1.add();
		//not be able to access Private and default method from the other package
		//direction of the...package Access Specifier-->Access_Outside_Package

	}

}
