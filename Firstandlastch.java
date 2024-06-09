import java.util.*;
class Firstandlastch
{
	public static void main(String args[])
	{
		String a[]={"sachin is best batsman","dhoni","kapil","rahul","dravid"};
		String s1="";

		int i;
		
		for(i=0;i<a.length;i++)
		{
			s1=a[i];
			System.out.println(s1.charAt(0)+"      "+s1.charAt(s1.length()-1));
		}
			

	}
}