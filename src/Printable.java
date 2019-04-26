
public interface Printable {
int a=10;
void print();
}
interface Showable{
	int a=20;
	void show();
}
class A1 implements Printable,Showable{
public void print()
{
	System.out.println("Hello Boss");	
}
public void show()
{
	System.out.println(Showable.a);
	System.out.println(Printable.a);
}
public static void main(String args[])
{
A1 obj = new A1();
obj.print();
obj.show();
}
}  