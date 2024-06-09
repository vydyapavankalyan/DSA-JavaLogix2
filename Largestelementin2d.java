import java.util.*;
class Largestelementin2d
{
	public static void main(String args[])
	{
		Scanner sc=new Scanner(System.in);

		int [][]=new int[10][10];

		int i,j,row,col,largest,r,c;

		System.out.println("enter the order of matrix a");
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
		largest=a[0][0];
		r=0;c=0;
		for(i=0;i<row;i++)
		{
			for(j=0;j<col;j++)
			{
				if(a[i][j]>largest)
				{
					largest=a[i][j];
					r=i;
					c=j;
				}
			}
		}
	System.out.println("largest element in 2d array a is"+largest+"found at"+r+","+c);
	}
}	
		