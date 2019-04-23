
public class Cons2 {
int age;
String Name;

Cons2(int a,String S)
{
	age = a;
	Name = S;
	
}
void Display()
{
	System.out.println(+age+" "+Name);
	
}
public static class cons3{
public static void main(String args[]){
	{
		Cons2 obj = new Cons2(50,"Raju");
		obj.Display();
	}
}}}


