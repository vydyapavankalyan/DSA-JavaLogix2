import java.util.*;
import java.lang.*;
class Demo
{
     public void finalize() throws Throwable
	{
	try
	{
		System.out.println("welcome to java");
	}
	catch(Throwable t)
	{
		throw t;
	}
	finally
	{
		super.finalize(); //Cleaner
	}
	}
}

class Garbagecollection
{
	public static void main(String args[]) throws Throwable
	{
		Demo d=new Demo();
		d.finalize();
	}
}