import java.util.*;
import java.io.*;
class Generics2
{
	public static void main(String args[])
	{
		List<Object> c=new ArrayList<Object>();
		c.add(2);
		c.add(23.32f);
		c.add("java");

		String x=(String)c.get(2);

		System.out.println(x);
	}

}