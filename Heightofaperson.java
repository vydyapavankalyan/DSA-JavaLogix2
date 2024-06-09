import java.util.*;
class Heightofaperson
{
	public static void main(String args[])
	{
		Scanner sc=new Scanner(System.in);
		float ht;

		System.out.println("enter the height of a person");
		ht=sc.nextFloat();

		if(ht<150.0f)
			System.out.println("Dwarf");
		else if(ht>=150.0f && ht<165.0f)
			System.out.println("Average height");
		else if(ht>=165.0f && ht<180.0f)
			System.out.println("Taller person");
		else
			System.out.println("Abnormal Height");
	}
}