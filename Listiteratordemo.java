import java.util.*;
class Listiteratordemo
{
	public static void main(String args[])
	{
		List<Integer> l=new ArrayList<Integer>();
		
		l.add(10);
		l.add(20);
		l.add(30);
		l.add(40);
		l.add(50);

		ListIterator itr=l.listIterator(3);

		while(itr.hasPrevious())
		{
			System.out.println(itr.previous());
		}
	}
}
		