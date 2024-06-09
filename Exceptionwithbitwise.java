import java.util.*;
import java.io.*;
class Exceptionwithbitwise
{
	public static void main(String args[])
	{
		try
		{
			int a[]={1,2,3,4,5};
			a[10]=5/0;
			System.out.println(a[10]);
		}
		catch(Exception e)
		{
				System.out.println(e.getMessage());
		}
		catch(ArithmeticException ae)
		{
				System.out.println(ae.getMessage());
		}
		catch(ArrayIndexOutOfBoundsException ae1)
		{
				System.out.println(ae1.getMessage());
		}
	}
}	
 		