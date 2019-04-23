
public class MyObj {
int x=10;
public static void main(String args[]) {
	MyObj myobj = new MyObj();
	MyObj myobj1 = new MyObj();
	myobj1.x = 40;
	System.out.println(myobj.x);
	System.out.println(myobj1.x);
}
}
