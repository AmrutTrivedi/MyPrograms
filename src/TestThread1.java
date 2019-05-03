public class TestThread1 extends Thread {
public void run()
{
	for(int i=0;i<5;i++)
	{
		try {
			Thread.sleep(500);
			
		}catch(InterruptedException e)
			{
			System.out.println(e);
			}
	}}
	public static void main(String args[])
	{
		TestThread1 t1 = new TestThread1();
		TestThread1 t2 = new TestThread1();
		t1.run();
		t2.run();	
	}
}
