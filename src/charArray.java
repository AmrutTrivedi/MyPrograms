
public class charArray {
public static void main(String args[]) {
	String S1 ="Hello Java";
	char ch[] = S1.toCharArray();
	for(int i=0;i<ch.length;i++)
	{
		System.out.println("Char At " + i + " Index Is: " +ch[i]);	
	}
	String S2 = "Hello";
	StringBuilder Sb = new StringBuilder(S2); 
	Sb.reverse();
	String rev = Sb.toString();
	System.out.println("String Is:"+S2);
	System.out.println("StringBuilder Reverse is: "+rev);
}
}
