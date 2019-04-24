
public class CharFrequency {
public static void main(String args[])
{
	String s = "Welcome to the World of JAVA";
	int count=0;
	for (int i=0;i<s.length();i++)
	{
		if(s.charAt(i)== 'l')
			count++;
	}
	System.out.println("Frequency of 0 Character is :" +count);
}
}
