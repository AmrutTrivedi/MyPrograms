import java.util.*;
public class Linkeed {
public static void main(String args[])
{
	LinkedList<String> list = new LinkedList<String>();
	list.add("Rahul");
	list.add("Jai");
	list.add("Ramesh");
	list.add("Roopesh");
	System.out.println("The list of elements are:"+list);
	list.add(4,"Raamesh");
	System.out.println("The list of elements are:"+list);
	LinkedList<String> list1 = new LinkedList<String>();
	list1.add("John");
	list1.add("raju");
	list.addAll(1,list1);
	System.out.println("The list of elements are:"+list);
	list.remove(2);
	System.out.println("The list of elements are:"+list);
	list.removeFirst();
	System.out.println("The list of elements are:"+list);
}	
}
