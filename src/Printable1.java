
public interface Printable1 {
int a=10;
void print();
}
interface Showable1 extends Printable1{
	void print();
}
class TestInterface implements Printable1,Showable1{
	public void print()
	{
		System.out.println("Helooo Boss");
	}
public static void main(String args[]) {
	TestInterface f1 = new TestInterface();
	f1.print();
}}