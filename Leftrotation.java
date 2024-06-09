import java.util.*;
class Leftrotation
{
	public static void main(String args[])
	{
		Scanner sc=new Scanner(System.in);

		int a[]=new int[10];
		int n,i,j,temp,nr;

		System.out.println("enter the size of array a and b");
		n=sc.nextInt();

		System.out.println("enter the array a elements");
		for(i=0;i<n;i++)
		a[i]=sc.nextInt();

		System.out.println("enter the number of rotations");
		nr=sc.nextInt();

		for(i=0;i<nr;i++)
		{
			temp=a[0];
			for(j=0;j<n-1;j++)
			   a[j]=a[j+1];
			a[n-1]=temp;
		}

		
		for(i=0;i<n;i++)
			System.out.print(a[i]+" ");

		
	}
}