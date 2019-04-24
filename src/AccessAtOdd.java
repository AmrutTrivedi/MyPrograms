
public class AccessAtOdd {
	public static void main(String args[])
	{
		int i;
		String s = new String("Welcome");
		for(i=0;i<s.length();i++)
		{
			if(i%2!=0)
			{
			System.out.println(" Char At Odd " + i + " Place " + s.charAt(i));
			}
			else if(i%2==0)
			{
				System.out.println(" Char At Even " + i + " Place " + s.charAt(i));
			}
			else 
			{
				System.out.println("None Of The Above can be printed");
			}
		}
	}

}
