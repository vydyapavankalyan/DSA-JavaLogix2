import java.util.*;
class Factors
{
	public static void main(String args[])
	{
		Scanner sc=new Scanner(System.in);
		int i,n;

		System.out.println("enter the value of n");
		n=sc.nextInt();

		for(i=1;i<=n;i++)
		{
			if(n%i==0)
			  System.out.print(i+" ");
		} 
		
	}
}