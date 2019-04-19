import java.util.*;
import java.util.Set;
public class TreeMap1 {
public static void main(String args[])
{
	TreeMap<Integer,String> m = new TreeMap<Integer,String>();
	m.put(5,"Jose");
	m.put(4,"Raja");
	m.put(10,"Ram");
	
	Set set = m.entrySet();
	Iterator<Map.Entry<Integer,String>> i = set.iterator();
	while(i.hasNext())
	{
	Map.Entry m1 = i.next();
	System.out.println(m1.getKey()+" "+m1.getValue());
	}
	
	m.remove(4);
	System.out.println(m);
	
	
	for(Map.Entry<Integer,String> m1:m.entrySet())
	{
		System.out.println(m1.getKey()+" "+m1.getValue());
	}
}	
}
