abstract class abs {
abstract void run();
}
class Muscle extends abs{
	void run()
	{
		System.out.println("My Muscle gets Build");
	}
	public static void main(String args[]) {
	abs M1 = new Muscle();
	{
		M1.run();
	}
}
}