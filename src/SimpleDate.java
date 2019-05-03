import java.text.SimpleDateFormat;
import java.util.Date;

public class SimpleDate {
public static void main(String args[])throws Exception {
String Da = "31/12/1998";
Date date1 = new SimpleDateFormat("dd/MM/yyyy").parse(Da);
System.out.println(Da+"\t"+date1);

String S1 = "06/09/1993";
String S2 = "31-Dec-1998 05:07:45";
SimpleDateFormat formatter1 = new SimpleDateFormat("dd/MM/yyyy");
SimpleDateFormat formatter2 = new SimpleDateFormat("dd-MMM-yyyy HH:MM:SS");
Date d1 = formatter1.parse(S1);
Date d2 = formatter2.parse(S2);
System.out.println(S1+"\t"+d1);
System.out.println(S2+"\t"+d2);
String S3 = "Hello";
char c = S3.charAt(4);
System.out.println(c);
} 
}
