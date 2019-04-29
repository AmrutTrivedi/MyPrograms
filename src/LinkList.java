import java.util.*;
public class LinkList {
	public static void main(String[] arg)
	{
		LinkedList<String> a = new LinkedList<String>();
		a.add("Ravi");
		a.add("Ajay");
		a.add("Ramesh");
		System.out.println("The List is:"+a);
		a.addFirst("Raju");
		a.addLast("Raj");
		a.add(2, "Rahul");
		System.out.println("The List is:"+a);
		Iterator i = a.iterator();
		while(i.hasNext())
		{
			System.out.println(i.next());
			
		}
		for(String S:a)
		{
			System.out.println(S);
			
		}
		LinkedList<String> a1 = new LinkedList<String>();
		a1.add("Saurabh");
		a1.add("Arvind");
		a1.addAll(a);
		System.out.println("The List is:"+a1);
		Iterator<String> i1 = a1.descendingIterator();
		while(i1.hasNext())
		{
			System.out.println(i1.next());	
		}
		ListIterator<String> i2 = a1.listIterator();
		
	}

}
