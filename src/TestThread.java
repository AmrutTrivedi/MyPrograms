
public class TestThread extends Thread {
public void run()
{
	System.out.println("Running");
	
}
public static void main(String args[])
{
	TestThread T1 = new TestThread();
	T1.run();
	
}
}

