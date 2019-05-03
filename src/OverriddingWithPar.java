

class OverriddingWithPar {
	void add(int a,int b)
	{
		int c=a+b;
		System.out.println("Added values are: "+c);
	}
	
	class Para extends OverriddingWithPar{
		void add(int a,int b)
		{
			super.add(10, 20);
			int c=a-b;
			System.out.println("Subtracted Values are: "+c);
		}
	}
	public static void main(String args[])
	{
		OverriddingWithPar P1 = new OverriddingWithPar();
		P1.add(10,5);		
        
		OverriddingWithPar P2 = P1.new Para();
		P2.add(5, 2);
	}
}