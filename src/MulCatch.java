
public class MulCatch {
	public static void main(String args[])
	{
		try {
			int a[]=new int [10];
			a[10] = 30/0;
			System.out.println(a[20]);
			}
		catch(ArrayIndexOutOfBoundsException e)
		{
	    System.out.println("Arithmetic Exceptions Occurs");
		}
		catch(ArithmeticException e)
		{
	    System.out.println("Arithmetic Exceptions Occurs");
		}
		catch(NullPointerException e)
		{
	    System.out.println("Arithmetic Exceptions Occurs");
		}
	System.out.println("Rest Of The Code");
	}
}

