import java.util.*;
class Largestdigit
{
	public static void main(String args[])
	{
		Scanner sc=new Scanner(System.in);
	
		int n,rem,x=0;

		System.out.println("enter the value of n");
		n=sc.nextInt();

		while(n>0)
		{
			rem=n%10;
			if(rem>x)
			    x=rem;
			n=n/10;
		}
		System.out.println("largest digit="+x);
		
	}
}