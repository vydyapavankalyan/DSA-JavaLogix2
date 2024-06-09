import java.util.*;
class GCDoftwo
{
	public static void main(String args[])
	{
		Scanner sc=new Scanner(System.in);
		
		int a,b,num,den,rem;

		System.out.println("enter the values of a and b");
		a=sc.nextInt();
		b=sc.nextInt();

		if(a>b)
		{
		    num=a;
		    den=b;
		}
		else
		{
		    num=b;
		    den=a;
		}

		rem=num%den;

		while(rem!=0)
		{
			num=den;
			den=rem;
			rem=num%den;
		}

		System.out.println("GCD of two numbers="+den);
	}
}