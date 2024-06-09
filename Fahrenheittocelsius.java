import java.util.*;
class Fahrenheittocelsius
{
	public static void main(String args[])
	{
		Scanner sc=new Scanner(System.in);

		float ft,ct;

		System.out.println("enter the fahrenheit temperature");
		ft=sc.nextFloat();

		ct=(ft-32.0f)*5/9;

		System.out.println("celsius temperature="+ct);

	}
}