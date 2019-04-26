
public class MethodOverride {
void run()
{
	System.out.println("Hello Java");
}
class Method extends MethodOverride{
void run()
{
	System.out.println("Hello Boss");
	
}
}
public static void main(String args[])
{
	MethodOverride M = new MethodOverride();
	M.run();
}
}
