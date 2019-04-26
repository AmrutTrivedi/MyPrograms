
abstract class Bike3 {
Bike3()
{
	System.out.println("Bike is Running");
}
abstract void run();
{
	System.out.println("Bike Runs safely");
}
void changegear()
{
	System.out.println("bike can change the gear");
	
}
}class Hero extends Bike3
{
	void run()
	{
		System.out.println("Hero is running safely");
	}
}
class TestBike{
	public static void main(String args[])
	{
		Bike3 B1 = new Hero();
		B1.run();
		B1.changegear();
		
	}
}