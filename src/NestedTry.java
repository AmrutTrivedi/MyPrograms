
public class NestedTry {
public static void main(String args[]) {
	try {
		try {
			System.out.println("Going to Divide");
			int b = 30/0;
		}
		catch(ArithmeticException e)
		{
			System.out.println(e);
		}finally
		{
		System.out.println("Finally Block is Executed");
		}
		}
	finally
	{
	System.out.println("Finally Block is Executed");
	}
		try {
			int a[] = new int[5];
			a[5] =4;
		}catch(ArrayIndexOutOfBoundsException e)
		{
			System.out.println(e);
		}
		System.out.println("Other Statement");
		}
		catch(Exception e)
		{
			System.out.println("Handeled");
		}
		{
		System.out.println("Normal Flow");	
		}
		}

