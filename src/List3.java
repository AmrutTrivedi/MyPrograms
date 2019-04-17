import java.util.ArrayList;
import java.util.List;
import java.util.ListIterator;
public class List3{
public static void main(String args[]){
List<String> l=new ArrayList<String>();  
	l.add("Sam");
	l.add("Mahi");
	l.add("Saurav");
	l.add("Raina");
	System.out.println("Traversing All The Elements through Iterator"+l);
	ListIterator<String> i = l.listIterator();
	while(i.hasNext())
	{
		System.out.println("index:"+i.nextIndex()+" value:"+i.next());
	}
	System.out.println("Traversing Forward");
	while(i.hasPrevious())
	{
		System.out.println("index:"+i.previousIndex()+" value:"+i.previous());	
	}
	System.out.println("Traversing Backward");
}}

