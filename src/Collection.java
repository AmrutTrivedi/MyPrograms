import java.util.*;
class Collection {
public static void main(String args[])
{
	ArrayList<String> list = new ArrayList<String>();
	list.add("Raj");
	list.add("Masum");
	list.add("Raj");
	list.add("Rahil");
    list.add("Ranjeet");
    Iterator itr=list.iterator();
    while(itr.hasNext())
    {
   		System.out.println(itr.next());
   		
}
}}

