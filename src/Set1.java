import java.util.HashSet;

public class Set1 {
	public static void main(String args[])
	{
		HashSet<String> set = new HashSet<String>();
		set.add("Ravi");
		set.add("Ramesh");
		set.add("Mohan");
		System.out.println("An Initial List Of Elements: "+set);
		HashSet<String> set2 = new HashSet<String>();
		set2.add("Ramesh");
		set2.add("Rahul");
		System.out.println("An Initial List Of Elements: "+set2);
		set.addAll(set2);
		System.out.println("An Initial List Of Elements: "+set);
		set.removeAll(set2);
		System.out.println("An Initial List Of Elements: "+set);	
	}
}
