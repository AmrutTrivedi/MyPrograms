
public class IntegerParse {
public static void main(String args[]) {
	int a = Integer.parseInt("20");
	int b = Integer.parseInt("180");
	int c = Integer.parseInt("220");
	System.out.println("Value = "+a);
	System.out.println("Value = "+b);
	System.out.println("Value = "+c);
	String S = "300";
	int i =Integer.parseInt(S);
	System.out.println(S+100);
	System.out.println(i+200);
	String S1 = "100";
	Integer i1 = Integer.valueOf(S1);
	System.out.println(i1);
	
}
}
