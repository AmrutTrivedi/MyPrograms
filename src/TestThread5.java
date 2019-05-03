
public class TestThread5 extends Thread {
public void run()
{
	System.out.println("Running a Thread");
	
}
public static void main(String args[])
{
	TestThread5 t1 = new TestThread5();
	TestThread5 t2 = new TestThread5();
	System.out.println("Name of Thread 1:"+t1.getName());
	System.out.println("Name of Thread 2:"+t2.getName());
	
	t1.start();
	t2.start();
	
	t1.setName("Rahul");
	t2.setName("Jai");
	System.out.println("After Updating the Name:"+t1.getName()+" & "+t2.getName());
}
}
