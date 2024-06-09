import java.util.*;
class Lcm
{
	public static void main(String args[])
	{
		Scanner sc=new Scanner(System.in);
		int a,b,largest,i,lcm=0;

		System.out.println("enter the value of a and b");
		a=sc.nextInt();
		b=sc.nextInt();

		largest=(a>b)?a:b;

		for(i=1;i<=largest;i++)
		{
			if(largest%a==0 && largest%b==0)
			{
				lcm=largest;
				break;
			}
			largest++;
		}
		System.out.println("lcm of two numbers="+lcm);
	}
}