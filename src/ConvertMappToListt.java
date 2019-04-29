import java.util.*;
import java.util.Set.*;
import java.util.LinkedList;
import java.util.stream.Collectors;

public class ConvertMappToListt {
public static void main(String args[])
{
	Map<Integer,String> a = new HashMap<Integer,String>();
	a.put(1,"Raju");
	a.put(2,"Raj");
	a.put(3,"Urav");
	
	System.out.println("Export map Keys to List keys:");
	
	List<Integer> a1 = new ArrayList<Integer>(a.keySet());
	for(Integer a2:a1)
	{
		System.out.println(a2);
	}
	
	System.out.println("Export map values to List Values:");
	List<String> s1 = new ArrayList<String>(a.values());
	for(String a3:s1)
	{
		System.out.println(a3);
		
	}
	System.out.println("After JAVA 8:");
	
	List<Integer> s2 = a.keySet().stream().collect(Collectors.toList());
	System.out.println(s2);
	
	List<String> s3 = a.values().stream().collect(Collectors.toList());
	System.out.println(s3);
	
}
}
