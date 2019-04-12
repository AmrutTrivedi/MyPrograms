
public class Enum {
	public enum s{Winter, Spring, Summer, Fall, Rainy}
	public static void main(String args[])
	{
		for(s s1:s.values())
			System.out.println(s1);		
	}
}
