 class Inheritance {
	int a=10,b=20;
	void add() {
		int c=a+b;
		System.out.println("The added value is:"+c);
		}
class Single extends Inheritance {
void sub() {
	int c=a-b;
	System.out.println("Subtracted Value is:"+c);
}	
}
 class A extends Inheritance{
	 void mul()
	 {
		 int c=a*b;
		 System.out.println("Subtracted Value is:"+c); 
	 }	
}
}
 class Maininheritance{
	 public static void main(String args[])
	 {
		 A I1 = new A();
		 I1.add();
		 I1.sub();
		 I1.mul();
		 
	 }
 }
 
