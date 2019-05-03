
public class TestThread6 extends Thread{
	public void run()
	{
		if(Thread.currentThread().isDaemon()) {
			System.out.println("Daemon Thread Work");
		}
		else {
			System.out.println("User Thread Works ");
			
		}
	}
	public static void main(String args[])
	{
		TestThread6 t1 = new TestThread6();
		TestThread6 t2 = new TestThread6();
		TestThread6 t3 = new TestThread6();
		
		t1.setDaemon(true);
		
		t1.start();
		t2.setDaemon(false);
		t3.setDaemon(true);
		t2.start();
		t3.start();
	}

}
