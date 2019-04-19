import java.util.*;
import java.util.Set;
class MapExample {
	public static void main(String args[])
	{
		Map<Integer,String> map = new HashMap<Integer,String>();
		map.put(1, " Rohan ");
		map.put(2, " Raj ");
		map.put(4, " Rohan ");
		map.put(10, "Rajesh");
		
		Set set= map.entrySet();
		Iterator<Map.Entry<Integer,String>>  i = set.iterator();
		while(i.hasNext())
		{
			Map.Entry<Integer,String> map1 = i.next();
			System.out.println(map1.getKey()+" "+map1.getValue());
		}
		
		System.out.println("By Using ForEach Loop");
		for(Map.Entry<Integer,String> m:map.entrySet())
			System.out.println(m.getKey()+" "+m.getValue());
		
		}
		}
