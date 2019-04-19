import java.util.*;
public class Generic {
public static void main(String args[])
{
	Map<String,Integer> map = new HashMap<String,Integer>();
	map.put("Ajit",101); 
	map.put("Arun",102);
	map.put("Raman",103); 
for(Map.Entry m:map.entrySet())
{
	System.out.println(m.getKey()+" "+m.getValue());	
}
	
	
}}