import java.util.*;
class Exchangecolumns
{
	public static void main(String args[])
	{
		Scanner sc=new Scanner(System.in);
		
		int a[][]=new int[10][10];
		int i,j,row,col,temp,n1,n2;

		System.out.println("enter the order of the matrix");
		 row=sc.nextInt();
		 col=sc.nextInt();

		System.out.println("enter the elements of matrix a");
		for(i=0;i<row;i++)
		{
			for(j=0;j<col;j++)
			{
				a[i][j]=sc.nextInt();
			}
		}

		System.out.println("enter the columns to be exchanged");
		n1=sc.nextInt();
		n2=sc.nextInt();

		for(i=0;i<col;i++)
		{
			temp=a[i][n1-1];
			a[i][n1-1]=a[i][n2-1];
			a[i][n2-1]=temp;	
		}

		for(i=0;i<row;i++)
		{
			for(j=0;j<col;j++)
			{
				System.out.print(a[i][j]+" ");
			}
			System.out.println("");
		}
		
	}
}