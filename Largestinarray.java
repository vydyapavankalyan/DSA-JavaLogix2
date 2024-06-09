import java.util.*;
class Largestinarray
{
	public static void main(String args[])
	{
		Scanner sc=new Scanner(System.in);
		
		int a[]=new int[20];
		int i,n,largest;

		System.out.println("enter the size of array a");
		n=sc.nextInt();
		
		System.out.println("enter the array a elements");
		for(i=0;i<n;i++)
		a[i]=sc.nextInt();

		largest=a[0];

		for(i=1;i<n;i++)
		{
			if(a[i]>largest)
			largest=a[i];
		}

		System.out.println("largest element in an array="+largest);
	}
}