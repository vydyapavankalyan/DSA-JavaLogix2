import java.util.*;
class Insertion
{
	public static void main(String args[])
	{
		Scanner sc=new Scanner(System.in);
		
		int a[]=new int[20];
		int i,n,element,location;

		System.out.println("enter the size of array a");
		n=sc.nextInt();
		
		System.out.println("enter the array a elements");
		for(i=0;i<n;i++)
		a[i]=sc.nextInt();

		System.out.println("enter the element to be inserted");
		element=sc.nextInt();

		System.out.println("enter the location to be inserted");
		location=sc.nextInt();

		for(i=n;i>=location;i--)
			a[i]=a[i-1];	
		a[i]=element;
		n++;
		for(i=0;i<n;i++)
			System.out.print(a[i]+" ");
	}
}