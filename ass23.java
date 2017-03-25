import java.util.*;
import java.lang.*;
import java.io.*;

class ass23
{	
	public static void main(String args[])
	{
		int x,y,z,max;
		System.out.println("Enter three integers");
		Scanner in = new Scanner(System.in);
		
		x = in.nextInt();
		y = in.nextInt();
		z = in.nextInt();
		
	max = z > ((x > y) ? x : y) ? z : ((x > y) ? x : y);	
	System.out.println("The greatest of the three numbers is " + max);
	}
}