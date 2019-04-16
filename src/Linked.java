import java.util.*;
public class Linked {
public static void main(String args[])
{
	LinkedList<String> list = new LinkedList<String>();
	list.add("Raj");
	list.add("Roman");
	list.add("Raju");
	list.add("Raj");
	list.add("Ajay");
	Iterator i=list.iterator();
	while(i.hasNext())
	{
		System.out.println(i.next());
		
	}
	}
}
