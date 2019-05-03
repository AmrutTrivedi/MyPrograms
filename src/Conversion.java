
public class Conversion {
public static void main(String args[]) {
	int value = 50;
	String S1 = String.valueOf(value);
	System.out.println(S1+10);
	
	boolean bol = true;
	boolean bol1 = false;
	String S3 = String.valueOf(bol);
	String S4 = String.valueOf(bol1);
	System.out.println(S3);
	System.out.println(S4);
	
	char ch ='A';
	char ch1 = 'B';
	String S5 = String.valueOf(ch);
	String S6 = String.valueOf(ch1);
	System.out.println(S5);
	System.out.println(S6);
}
}
