
public class ThisKeyword {
ThisKeyword()
{
	System.out.println("Hello This Keyword");
}
ThisKeyword(int x)
{
this();
System.out.println(x);
}
}
class This{
	public static void main(String args[]) {
		ThisKeyword T = new ThisKeyword(50);
	}
}
