import java.util.LinkedHashMap;
public class LinkedHashMapp {
public static void main(String args[])
{
	LinkedHashMap<Integer,String> m = new LinkedHashMap<Integer,String>();
	m.put(100,"Jai");
	m.put(102,"Adarsh");
	m.put(102,"Raja");
	m.put(105,"Rajesh");
	System.out.println("Keys:"+m.keySet());
	System.out.println("Values:"+m.values());
	System.out.println("KeyValuePairs:"+m.entrySet());
	m.remove(102);
	System.out.println("Keys:"+m.keySet());
	System.out.println("Keys:"+m.values());
	System.out.println("KeyValuePairs:"+m.entrySet());
}}
