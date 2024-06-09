import java.util.*;
class Iteratordemo
{
	public static void main(String args[])
	{
		List<Integer> l=new ArrayList<Integer>();
		
		l.add(10);
		l.add(20);
		l.add(30);
		l.add(40);
		l.add(50);

		Iterator itr=l.iterator();

		while(itr.hasNext())
		{
			System.out.println(itr.next());
		}
	}
}
		