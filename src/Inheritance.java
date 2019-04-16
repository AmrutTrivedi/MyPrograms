public class Inheritance {
	int a=10,b=20;
	void add() {
		int c=a+b;
		System.out.println("The added value is:"+c);
		}
}
class Hier extends Inheritance{
	public void Multiply()
	 {
		 int c=a*b;
		 System.out.println("Multiplied Value is:"+c); 
	 }	
}
class Single extends Inheritance {
public void Subtract() {
	int c=a-b;
	System.out.println("Subtracted Value is:"+c);
}	
}
 class Maininheritance{
	 public static void main(String args[])
	 {
		 Single I3 = new Single();
		 I3.add();
		 I3.Subtract();
	 }
 }