import java.util.*;
class Fibonaccirec
{
	public static void main(String args[])
	{
		Scanner sc=new Scanner(System.in);
		int i,limit;

		System.out.println("enter the limit");
		limit=sc.nextInt();

		for(i=0;i<limit;i++)
			System.out.print(fib(i)+" ");

	
	}
	static int fib(int n)
		{
			if(n==0) return 0;
			else if(n==1) return 1;
			else
				return (fib(n-1)+fib(n-2));
		}
}