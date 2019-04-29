
public class Exp extends Thread {
public void run()
{
	System.out.println("Thread is Running...");
	
}
public static void main(String args[])
{
	Exp E1 = new Exp();
	E1.start();
	E1.start();
	}
}
