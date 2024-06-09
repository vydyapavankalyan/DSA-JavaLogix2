import java.util.*;
class Grade
{
	public static void main(String args[])
	{
		Scanner sc=new Scanner(System.in);

		int a,b,c,d,e,f,sum;
		float avg;

		System.out.println("enter the six subject marks of a student");
		a=sc.nextInt();
		b=sc.nextInt();
		c=sc.nextInt();
		d=sc.nextInt();
		e=sc.nextInt();
		f=sc.nextInt();

		sum=a+b+c+d+e+f;

		avg=sum/6.0f;

		if(a<35||b<35||c<35||d<35||e<35||f<35)
			System.out.println("fail");
		else if(avg>=35 && avg<50)
			System.out.println("Third Division");
		else if(avg>=50 && avg<60)
			System.out.println("Second Division");
		else if(avg>=60 && avg<70)
			System.out.println("First Division");
		else
			System.out.println("Distinction");
	}
}
