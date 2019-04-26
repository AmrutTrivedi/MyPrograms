
abstract class Bank1 {
abstract void getrate(float x);
}
class SBII extends Bank1{
	void getrate(float x)
	{
		System.out.println("The rate of Interest is:"+x);
	}
	}
class ICICII extends Bank1{
	void getrate(float x)
	{
		System.out.println("The rate of Interest is:"+x);
	}
}
class TestBank{
	public static void main(String args[])
	{
		Bank1 b1= new ICICII();
		Bank1 b2 = new SBII();
		b1.getrate(6.9F);
		b2.getrate(7.8F);
	}
}