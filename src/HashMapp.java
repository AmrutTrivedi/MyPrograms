import java.util.*;

public class HashMapp {
public static void main(String args[])
{
	HashMap<Integer,String> m = new LinkedHashMap<Integer,String>();
	m.put(1,"Sailesh");
	m.put(2,"Sanket");
	m.put(3,"Rajesh");
	System.out.println("Keys:"+m.keySet());
	System.out.println("Values:"+m.values());
	System.out.println("Key and Value Pairs:"+m.entrySet());
	
	System.out.println("After Adding values in HashMap"+m);
	for(Map.Entry e:m.entrySet())
	{
		System.out.println("After Iterating Elements in:"+" "+e);
	}
	m.putIfAbsent(0, "Ajay");
	for(Map.Entry e:m.entrySet())
	{
		System.out.println("After Iterating Elements in:"+" "+e);
	}
	m.put(4, "Sripal");
	for(Map.Entry e:m.entrySet())
	{
		System.out.println("After Iterating Elements in:"+" "+e);
	}
	HashMap<Integer,String> m1 = new HashMap<Integer,String>();
	m1.put(5,"Ronaldo");
	m1.putAll(m);
	for(Map.Entry e:m1.entrySet())
	{
		System.out.println("After Iterating Elements in:"+" "+e);
	}
	m1.remove(0, "Ajay");
	for(Map.Entry e:m1.entrySet())
	{
		System.out.println("After Iterating Elements in:"+" "+e);
	}
	m1.replace(5, "Ronaldo", "Parajay");
	for(Map.Entry e:m1.entrySet())
	{
		System.out.println("After Iterating Elements in:"+" "+e);
	}
	m1.replaceAll((k,v)-> "Parajay");
	for(Map.Entry e:m1.entrySet())
	{
		System.out.println("After Iterating Elements in:"+" "+e);
	}
}
}
