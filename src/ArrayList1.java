
import java.util.ArrayList;

public class ArrayList1 {
	public static void main(String args[])
	{
		ArrayList<String> list= new ArrayList<String>();
		System.out.println("Initial List Of Elements:");
		list.add("Raju");
		list.add("Ravi");
		list.add("Ramesh");
		list.add("Rajesh");
		System.out.println("After Adding Element into the list:"+list);
		list.add(2,"Raj");
		System.out.println("After Adding Element into the list:"+list);
		ArrayList<String> list1= new ArrayList<String>();
		list1.add(0,"Amit");
		list1.add(1,"Ajay");
		System.out.println("After Adding Element into the list1:"+list1);
		list.addAll(list1);
		System.out.println("After Adding Element into the list1:"+list);
		ArrayList<String> list2= new ArrayList<String>();
		list2.add("Roopesh");
		list.addAll(0,list2);
		System.out.println("After Adding Element into the list1:"+list);
	}

	
	}

	