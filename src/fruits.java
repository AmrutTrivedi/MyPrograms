
 class fruits {
	void orange()
	{
		System.out.println("Citrus Fruit");
		
	}
}
 class Veges extends fruits{
	void Carrot()
	{
		System.out.println("Carrot");
	}
}
class dryfruits extends fruits{
	void Cashew()
	{
		System.out.println("Groundnut");

	}		
	}
class fruits1{
	public static void main(String args[])
	{
		dryfruits F1 = new dryfruits();
		Veges F2 = new Veges();
		F1.orange();
		F2.Carrot();
		F1.Cashew();
		
	}
}
