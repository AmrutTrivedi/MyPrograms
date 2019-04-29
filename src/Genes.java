import java.util.*;
import java.util.Map.Entry;
import java.util.Set;

public class Genes {
public static void main(String args[])
{
	Map m = new HashMap();
	m.put(1,"Mahesh");
	m.put(2, "Madhan");
	m.put(3,"Rahil");

	Set s = m.entrySet();
	Iterator i = s.iterator();
	while(i.hasNext())
	{
		Map.Entry e = (Map.Entry) i.next();
		System.out.println("Before Generics:"+" "+e.getKey()+" "+e.getValue());
	}
	Map<Integer,String> m1 = new LinkedHashMap<Integer,String>();
	m1.put(3, "Rahil");
	m1.put(5, "Rahul");
	m1.put(6, "Jai");
	
	for(Map.Entry e:m1.entrySet())
	{
		System.out.println("After Generics:"+" "+e);
		
	}
	m1.remove(3);
	for(Map.Entry e:m1.entrySet())
	{
		System.out.println("After Removing 3rd Element from Generics:"+" "+e);
		
	}
	m1.putAll(m);
	for(Map.Entry e:m1.entrySet())
	{
		System.out.println("After combining all the elements :"+" "+e);
	}
	m1.putIfAbsent(4, "Kamlesh");
	for(Map.Entry e:m1.entrySet())
	{
		System.out.println("After combining all the elements :"+" "+e);
	}
	
}
}
