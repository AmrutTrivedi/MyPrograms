
 class Multiple extends Thread{
	 public void run()
	 {
		 System.out.println("Thread is running");  
	 }

	public void start() {
		
	}  
public static void main(String args[])
{
	Multiple M1 = new Multiple();
	M1.start();	
}
}
