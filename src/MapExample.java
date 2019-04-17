import java.util.*;
import java.util.Set.*;
 class MapExample {
	public static void main(String args[])
	{
		Map map = new HashMap();
		map.put(1,"Rohan");
		map.put(2,"Raj");
		map.put(3,"Rohan");
		map.put(10,"Rajesh");
		Set set= (Set) map.entrySet();
		Iterator<String> i = set.iterator<String>();
		while(i.hasNext())
		{
			Map.Entry entry = (Map.Entry)i.next();
			System.out.println(entry.getKey()+""+entry.getValue());
		}
		}

}
