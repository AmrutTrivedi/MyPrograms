
public class Overloading {
void add(int a ,int b)
{
	System.out.println(a+b);
	
}
void add(int a,int b,int c)
{
	System.out.println(a+b+c);
}
}
class overloaded{
	public static void main(String args[])
	{
		Overloading O1= new Overloading();
		O1.add(10,20);
		O1.add(10,20,30);
		
	}
}