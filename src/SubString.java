
public class SubString {
public static void main(String args[])
{
	String S1 = "Difficult to find world without java";
	String S2 = "Difficult to find world without java";
	int i,i1;
	char ch = 'A';
	char ch1 = 'B';
	String i2 = S1.substring(0,16);
	i=S1.indexOf("find",12);
	i1=S1.indexOf('f', 3);
	String replaceAll=S1.replaceAll("f", "u");
	String replaceString=S2.replaceAll("\\S","");
	System.out.println("The Index value is:\n"+i);
	System.out.println("The Index value is:\n"+i1);		
	System.out.println(replaceAll);
	System.out.println(replaceString);
	System.out.println(i2);
	System.out.println(S1.valueOf(ch));
	System.out.println(S2.valueOf(ch1));
}
}
