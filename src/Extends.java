
class Extends {
void run()
{
	System.out.println("The Vehicle is Running");
}
}
class Bike extends Extends{
	void run()
	{
		System.out.println("Vehicle Called Bike is Running");
	}}

 class Running{
	public static void main(String args[]){
		Extends B1 = new Bike();
		B1.run();
	}}
