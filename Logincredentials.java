import java.util.*;
class Logincredentials
{
	public static void main(String args[])
	{
		Scanner sc=new Scanner(System.in);
		
		String str="satya@tech.com",s;
		int password=12345678,pwd;

		System.out.println("enter the username");
		s=sc.next();

		System.out.println("enter the password");
		pwd=sc.nextInt();


		if(s.equals(str))
		{
			if(password==pwd)
			{
				System.out.println("Valid Credentials! Login Succeesful");
			}
			else
			{
				System.out.println("Invalid password! Please try again");
			}
		}
		else
		{
			System.out.println("Invalid username! Please try again");
		}
		
	}
}
