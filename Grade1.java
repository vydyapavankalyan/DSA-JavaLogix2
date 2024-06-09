import java.util.*;
class Grade1
{
	public static void main(String args[])
	{
		Scanner sc=new Scanner(System.in);
		
		char grade;

		System.out.println("Enter the grade of a student");
		grade=sc.next().charAt(0);

		switch(grade)
		{
			case 's':
			case 'S': System.out.println("EXCELLENT");
				  break;
			case 'a':
			case 'A': System.out.println("VERY GOOD");
				  break;
			case 'b': 
			case 'B': System.out.println("GOOD");
				  break;
			case 'c': 
			case 'C': System.out.println("POOR");
				  break;
			case 'y': 
			case 'Y': System.out.println("ABSENT");	
				  break;
			case 'f':
			case 'F': System.out.println("FAIL");
				  break;
		
			default:  System.out.println("INVALID OPTION");
		}
	}
}
		
	
