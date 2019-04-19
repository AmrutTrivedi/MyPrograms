import java.util.*;
import java.util.Set.*;
public class HashMap1 {
public static void main(String args[])
{
	HashMap<Integer,String> hm = new HashMap<Integer,String>();
	System.out.println("Initial List of Elements:");
	hm.put(100,"Ajay");
	hm.put(105,"Rama");
	hm.put(106,"Jasprit");
	
	System.out.println("After Invoking Put Method");
	for(Map.Entry m:hm.entrySet())
	{
		System.out.println(m.getKey()+" "+m.getValue());
	}
	hm.putIfAbsent(104,"Gaurav");
	System.out.println("After Invoking Put Method");
	for(Map.Entry m:hm.entrySet())
	{
		System.out.println(m.getKey()+" "+m.getValue());
	}
	hm.remove(105);
	System.out.println("After Removing Method");
	for(Map.Entry m:hm.entrySet())
	{
		System.out.println(m.getKey()+" "+m.getValue());
	}
	HashMap<Integer,String> map = new HashMap<Integer,String>();
	map.put(104,"Rama");
	map.putAll(hm);
	System.out.println("After Invoking Put All Method");
	for(Map.Entry m:map.entrySet())
	{
		System.out.println(m.getKey()+" "+m.getValue());
	}
	hm.replace(104, "Gaurav","Ravi");
	for(Map.Entry m:hm.entrySet())
	{
		System.out.println(m.getKey()+" "+m.getValue());
	}
	hm.replaceAll((K,V)-> "Rajuuu");
	{
		for(Map.Entry m:hm.entrySet())
		{
			System.out.println(m.getKey()+" "+m.getValue());
		}
	System.out.println("After Replacing Everything");
	}
	hm.remove(106);
	for(Map.Entry m:hm.entrySet())
	{
		System.out.println(m.getKey()+" "+m.getValue());
	}
}}

