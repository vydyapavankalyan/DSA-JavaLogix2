import java.util.*;
class Factorialrec
{
	public static void main(String args[])
	{
		Scanner sc=new Scanner(System.in);
		int n,result;
		System.out.println("enter the value of n");
		n=sc.nextInt();

		result=fact(n); //calling method
		System.out.println("factorial of given number="+result);
		

	}

	static int fact(int n)  //called method
	{
			if(n==0)
			   return 1;
			else
			   return(n*fact(n-1));
	}
		
}