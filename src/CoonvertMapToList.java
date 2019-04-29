import java.util.*;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;
import java.util.ArrayList;
public class CoonvertMapToList {
public static void main(String args[])
{
	Map<Integer,String> m = new HashMap<Integer,String>();
	m.put(101,"Tcs");
	m.put(102,"Infosys");
	m.put(103,"Wipro");
	m.put(102,"Google");
	
	System.out.println("\n 1. Export Map to Key List");
	
	List<Integer> List1 = new ArrayList<Integer>(m.keySet());
	
	for(Integer list2:List1);
	{
	System.out.println(List1);
	}
	
	System.out.println("\n 2. Export Map Value to List");
	List<String> List3 = new ArrayList<String>(m.values());
	for(String list4:List3);
	{
	System.out.println(List3);
}}}

