
public class StriBuff {
public static void main(String args[])
{
	StringBuffer sb = new StringBuffer("Hello Boss");
	sb.append(" Java");
	System.out.println(sb);
	sb.insert(1,"Java");
	System.out.println(sb);
	sb.replace(2, 6, "Null");
	System.out.println(sb);
	sb.delete(2, 6);
	System.out.println(sb);
	sb.reverse();
	System.out.println(sb);

	
}
}
