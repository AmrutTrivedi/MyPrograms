import java.util.*;
public class ListInterface {
public static void main(String args[])
{
	List<String> al=new LinkedList<String>();  
	al.add("Amit");  
	al.add("Vijay");  
	al.add("Kumar");  
	al.add(1,"Sachin");  
	System.out.println("An element at 2nd position: "+al.get(3));  
	for(String s:al){  
	System.out.println(s);  
	}   	
}
}
