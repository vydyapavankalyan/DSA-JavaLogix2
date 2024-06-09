import java.util.*;
import java.io.*;
class Generics
{
	public static void main(String args[])
	{
		Collection c=new ArrayList();
		c.add(2);
		c.add(323.43);
		c.add("sathya");

		for(Object x:c)
			System.out.println(x);
	}
}