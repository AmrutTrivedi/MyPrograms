
public class Encapsulation {
private String name;
Encapsulation(String n)
{
	name = n;
}
String getName()
{
	return name;
}
void setName()
{
name = "John";
}
public static void main(String args[])
{
	Encapsulation E1 = new Encapsulation("Rajesh");
	System.out.println(E1.getName());
}
}

