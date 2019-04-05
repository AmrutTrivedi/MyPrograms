interface printable{
	void print();
}
interface showable{
	void print();
	}
class testinterface implements printable,showable{
	public void print()
	{
		System.out.println("Hello");
	}
	public static void main(String args[])
	{
		testinterface obj = new testinterface();
		obj.print();
		
	}
}
