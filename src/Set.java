import java.util.*;

public class Set {
public static void main(String args[])
{
	ArrayList<String> list= new ArrayList<String>();
	list.add("Raj");
	list.add("Roopak");
	list.add("Ram");
	System.out.println("Before Update:"+list.get(0));
	list.set(0,"Roopesh");
	System.out.println("After Update:"+list.get(0));
	
}}
