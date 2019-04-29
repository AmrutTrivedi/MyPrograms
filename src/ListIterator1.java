import java.util.*;

public class ListIterator1 {
public static void main(String aargs[])
{
	List<String> a = new LinkedList<String>();
	
	a.add("Jayesh");
	a.add("Roopesh");
	a.add("Romesh");
	System.out.println("After adding the elements:"+a);
	System.out.println("Traversing in forward direction:");
	ListIterator<String> i= a.listIterator();
	while(i.hasNext())
	{
		System.out.println("Index: "+i.nextIndex()+" "+"Value: "+i.next());
		
	}
	System.out.println("Traversing in Backward direction:");
	while(i.hasPrevious())
	{
		System.out.println("Index: "+i.previousIndex()+" "+"Value: "+i.previous());
	}
}
}
