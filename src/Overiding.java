
public class Overiding {
	void jump()
	{
		System.out.println("Vehicle is Running");
	}
}
class Run extends Overiding{
		void jump()
		{
			System.out.println("Vehicle Break-Down");
		}
public static void main(String args[])
{
	Run R1= new Run();
	R1.jump();
	
}
}
