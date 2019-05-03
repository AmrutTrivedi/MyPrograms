
public class TestThread4 extends Thread {
public void run()
{
	System.out.println(Thread.currentThread().getName());
}
public static void main(String args[])
{
	TestThread4 t1 = new TestThread4();
	TestThread4 t2 = new TestThread4();
	t1.start();
	t2.start();
}}