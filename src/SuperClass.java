
public class SuperClass {
String Color="White";
}
class dog extends SuperClass
{
	String Color="Blue";
	void printcolor()
	{
		System.out.println("Print  the color");
		System.out.println(super.Color);		
	}}
class TestSuper{
	public static void main(String args[])
	{
		dog d = new dog();
		d.printcolor();
		
	}
}
