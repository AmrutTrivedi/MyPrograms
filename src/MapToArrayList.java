import java.util.*;
import java.util.Set.*;
import java.util.LinkedList;
import java.util.stream.Collectors;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;
import java.util.stream.Collectors;
import java.util.Iterator;
import java.util.HashMap;
import java.util.ArrayList;

public class MapToArrayList {
	public static void main(String args[]) {
		Map<Integer,String> maps = new HashMap<Integer,String>();
		
		maps.put(104, "Arvind");
		maps.put(105, "Darshan");
		maps.put(106, "Deepak");
		maps.put(107, "Chahar");
		{
		System.out.println(maps);
		}
		maps.remove(107);
		ArrayList<Integer> l = new ArrayList<Integer>(maps.keySet());
		ArrayList<String> S = new ArrayList<String>(maps.values());

		System.out.println("Key List: "+l);
		System.out.println("Values: "+S);
		
	}}
		
		
		