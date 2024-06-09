import java.io.*;
class Incdecprograms
{
	public static void main(String args[])
	{
		int a=12,b=13,c=11;

		a= a++ + --b + c++;
		b= b++ + ++a*2;
		c= c++ + a++ *(++b);

		System.out.println(a+" "+b+" "+c);
	}
}