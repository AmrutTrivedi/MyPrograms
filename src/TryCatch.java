
public class TryCatch {
public static void main(String args[]) {
	int i=50,j=2;
	int data;
	try 
	{
		data =i/j;
	}
	catch(ArithmeticException e)
	{
		System.out.println(i/(j+2));
		
	}
}
}
