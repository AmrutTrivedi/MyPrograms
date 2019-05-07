
public class Vehicle {
void run()
{
	System.out.println("My Vehicle is Running");	
}
}
class Bike5 extends Vehicle{
	void run()
	{
		System.out.println("It is not my vehicle");
	}
	public static void main(String args[]) {
		Vehicle V1 = new Bike5();
		V1.run();
	}
}