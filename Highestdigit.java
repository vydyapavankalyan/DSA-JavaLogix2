import java.util.*;
class Highestdigit
{
	public static void main(String args[])
	{
		String s="sathya@8456396";
		int i,x=0,y=0;
		char ch;

		for(i=0;i<s.length();i++)
		{
			ch=s.charAt(i);
			if(ch>='0' && ch<='9')
				x=ch-48;
			if(x>y)
			  y=x;
		}
		System.out.println("highest digit in the given string="+y);
		
	}
}