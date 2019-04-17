import java.util.LinkedList;

public class Linkedlist1 {
public static void main(String args[])
	{
		LinkedList<String> list = new LinkedList<String>();
		System.out.println("Initial List Of Elements:");
		list.add("Raju");
		list.add("Roopal");
		list.add("Gomathi");
		System.out.println("After Adding Initial List Of Elements:"+list);
		LinkedList<String> list1 = new LinkedList<String>();
		list1.add("Ramesh");
		list1.add("Akbar");
		list.addAll(list1);
		System.out.println("After Adding Initial List Of Elements:"+list);
		LinkedList<String> list3 = new LinkedList<String>();
		list3.add("John");
		list.addAll(3,list3);
		System.out.println("After Adding Initial List Of Elements:"+list);
		list.remove(3);
		System.out.println("After Adding Initial List Of Elements:"+list);
		
	}


}


