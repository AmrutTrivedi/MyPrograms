import java.util.ArrayList;
import java.util.Iterator;

public class ArraayList {
public static void main(String args[])
{
	ArrayList<String> list = new ArrayList<String>();
	{
		list.add("Rajesh");
		list.add("Ramesh");
		list.add("Yogesh");
		
		Iterator<String> i = list.iterator();
		while(i.hasNext())
		{
			System.out.println(i.next());
		}
		
		
		list.add("Umesh");
		list.add("Sailesh");
		for(String S:list)
		{
			System.out.println(S);
		}
		list.remove(3);
		System.out.println(list);
		list.removeAll(list);
		System.out.println(list);
	}}}
