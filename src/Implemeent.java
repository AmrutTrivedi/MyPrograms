
public class Implemeent implements Runnable{
	
public void run()
{
	System.out.println("Thread is running Safely...");
	
}
public static void main(String args[])
{
	Implemeent I1 = new Implemeent();
	Thread t1 = new Thread(I1);
		t1.start();
		
}
}
