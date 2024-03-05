//declare and initialize all type of scanners
package basicsjava;
import java.util.*;
public class Thirth 
{

	public static void main(String[] args) 
	{
		Scanner s1=new Scanner(System.in);
		System.out.println("Enter no1 value");
		int no1=s1.nextInt();
		System.out.println("Enter no2 value");
		byte no2=s1.nextByte();
		System.out.println("Enter no3 value");
		short no3=s1.nextShort();
		System.out.println("Enter no4 value");
		long no4=s1.nextLong();
		System.out.println("Enter no5 value");
		double no5=s1.nextDouble();
	}

}
