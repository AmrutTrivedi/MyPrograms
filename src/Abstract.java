
 abstract class Abstract {
	abstract void draw();
}
class rectangle extends Abstract{
	void draw()
	{
		System.out.println("Drawing the rectangle");
	}}
	class circle extends Abstract{
		void draw()
		{
			System.out.println("Drawing the circle");
		}
	}
 class TestMyAbstraction{
		public static void main(String args[])
		{
			Abstract s1 = new circle();
			s1.draw();
			
		}
	}
	
