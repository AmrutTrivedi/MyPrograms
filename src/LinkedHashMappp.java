import java.util.*;
import java.util.Set;

public class LinkedHashMappp {
public static void main(String args[])
{
	LinkedHashMap<Integer,String> hm = new LinkedHashMap<Integer,String>();
	hm.put(1, "Raju");
	hm.put(2,"Ramesh");
	hm.put(3,"Gopal");
	
	Set s1 = hm.entrySet();
	Iterator i = s1.iterator();
	while(i.hasNext())
	{
		Map.Entry e = (Map.Entry) i.next();
		System.out.println("After Iterating:"+e);	
	}
	
	for(Map.Entry m:hm.entrySet())
	{
		System.out.println("After Iterating:"+m);
		
	}
	System.out.println("KEYS:"+hm.keySet());
	System.out.println("VALUES:"+hm.values());
	System.out.println("Key & Value Pairs :"+hm.entrySet());
	}
}

