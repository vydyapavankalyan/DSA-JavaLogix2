import java.io.*;
class Largestofthree
{
	public static void main(String args[])
	{
		int a=37,b=99,c=45,largest;

		largest=((a>b)&&(a>c))?a:((b>c)?b:c);

		System.out.println("largest of three numbers="+largest);
	}
}