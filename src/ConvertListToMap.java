import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class ConvertListToMap {
 Integer id;
 String Name;
 
 ConvertListToMap(Integer i,String n){
	 id = i;
	 Name = n;
 }
 Integer getId()
 {
	 return id;
 }
 String getName()
 {
	 return Name;
 }
}	
class ConversionMap{
	public static void main(String args[]) {
		List<ConvertListToMap> al = new ArrayList<ConvertListToMap>();
		al.add(new ConvertListToMap(1,"Rajesh"));
		al.add(new ConvertListToMap(2,"Raju"));
		al.add(new ConvertListToMap(3,"Ramesh"));
		
		Map<Integer,String> map = al.stream().collect(Collectors.toMap(ConvertListToMap::getId,ConvertListToMap::getName));
		System.out.println(map);
		
	}
}
