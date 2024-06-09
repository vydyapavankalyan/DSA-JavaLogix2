import java.util.*;
import java.io.*;
class Finallyexample
{
	public static void main(String args[])
	{
		FileInputStream fis=null;
		try
		{
		
		fis=new FileInputStream("E:hello.java");
			System.out.println("file opened");
		}
		catch(FileNotFoundException fe)
		{
			System.out.println("file does not exists");
		}
		finally
		{
			try
			{
			  fis.close();
			  System.out.println("resource released");
			}
			catch(IOException ie)
			{
				System.out.println("IO ERROR");
			}
			catch(NullPointerException ne)
			{
				System.out.println("file cannot be closed");
			}
		}
		
	}
}