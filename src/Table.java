
public class Table {
synchronized void printable(int n)
{
	for(int i=1;i<=5;i++)
	{
		System.out.println(n*i);
		try {
			Thread.sleep(100);
		}catch(Exception e) {
			System.out.println(e);
		}
	}
class Mythread extends Thread{
	Table t;
	Mythread(Table t)
	{
		this.t=t;
	}
	public void run()
	{
		t.printable(5);
	}
}}}
class Mythread1 extends Thread{
	Table t;
	Mythread1(Table t)
	{
		this.t=t;
	}
	public void run()
	{
		t.printable(1000);
	}}
 class Testt1{
	public static void main(String args[]) {
		Table o1 = new Table();
		Mythread1 t1 = new Mythread1(o1);
		Mythread1 t2 = new Mythread1(o1);
		t1.start();
		t2.start();
	}
}

