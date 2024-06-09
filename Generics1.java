import java.util.*;
import java.io.*;
class Generics1
{
	public static void main(String args[])
	{
		Collection<Integer> c=new ArrayList<Integer>();
		c.add(2);
		c.add(20);
		c.add(2000);

		for(Object x:c)
			System.out.println(x);
	}
}