
interface AbstractInterface {
void draw();
}
class Area implements AbstractInterface{
	public void draw() {
	System.out.println("Drawing Rectangle");
	}
class Areae implements AbstractInterface{
	public void draw() {
		System.out.println("Drawing Circle Along With the Radius");
	}
}
}
class InterfaceTest{
	public static void main(String args[]) {
	Area A1 = new Area();
		A1.draw();
	}
}
