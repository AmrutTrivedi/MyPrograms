interface printableable{
	void print();
}
interface showableable{
	void print();
	}
class testinterface1 implements printableable,showableable{
	public void print()
	{
		System.out.println("Hello");
	}
	public static void main(String args[])
	{
		testinterface1 obj = new testinterface1();
		obj.print();
		
	}
}
