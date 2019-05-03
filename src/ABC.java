
public class ABC {
public void run() {
	System.out.println("Tortoise is Running");
	
}
class XYZ extends ABC {
	public void run()
	{
		System.out.println("Rabbit is running");
		
	}
}
	public static void main(String args[])
	{
		ABC obj1 = new ABC();
		obj1.run();
		
		ABC obj2 = 	obj1.new XYZ();
		obj2.run();
		
	}
}
