import java.util.Scanner;
public class Encap {
private String name;
String getName()
{
	return name;	
}
void setName()
{
	name = "Johhn";	
}
public static void main(String args[]) {
	Encap c1 = new Encap();
	Scanner Sc = new Scanner(System.in);
	String name = Sc.nextLine();
	System.out.println("After getting the values : " +name);
	c1.setName();
}}