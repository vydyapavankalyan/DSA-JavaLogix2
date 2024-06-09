import java.util.*;
class Geometricalshapes
{
	public static void main(String args[])
	{
		Scanner sc=new Scanner(System.in);
		
		float area,radius,side,breadth,length,base,height;
		int fig_code;

		System.out.println("*****GEOMETRICAL SHAPES***********");
		System.out.println("001:AREA OF CIRCLE");
		System.out.println("002:AREA OF SQUARE");
		System.out.println("003:AREA OF RECTANGLE");
		System.out.println("004:AREA OF TRIANGLE");

		System.out.println("Enter the figure code");
		fig_code=sc.nextInt();

		switch(fig_code)
		{
			case 001:System.out.println("enter the radius");
				 radius=sc.nextFloat();
				 area=3.142f*radius*radius;
				 System.out.println("area of circle="+area);
				 break;
			case 002:System.out.println("enter the side");
				 side=sc.nextFloat();
				 area=side*side;
				 System.out.println("area of square="+area);
				 break;
			case 003:System.out.println("enter the length and breadth");
				 length=sc.nextFloat();
				 breadth=sc.nextFloat();
				 area=length*breadth;
				 System.out.println("area of rectangle="+area);
				 break;
			case 004:System.out.println("enter the base and height");
				 base=sc.nextFloat();
				 height=sc.nextFloat();
				 area=0.5f*base*height;
				 System.out.println("area of triangle="+area);
				 break;
			default: System.out.println("Invalid option");
		}
		

	}
}
		
	
