public class Examplle {
	String Name;
     int Roll_No;
	
	static String Clg_Name;
	static int Counter = 0;
	
	Examplle(String n)
	{
		Name = n;
		Roll_No = Roll_No();
	}
	static int Roll_No()
	{	
		Counter++;
		return Counter;
	}
	
	static String Clg_Name()
	{
		return Clg_Name;
	}
	void info()
	{
		System.out.println("Name :"+Name);
		System.out.println("Roll_No :"+Roll_No);
		System.out.println("College Name :"+Clg_Name);
		
	}
public static void main(String args[]) {
	
	Examplle.Clg_Name = "SRM";
	
	
	Examplle e1 = new Examplle("Sunil");
	Examplle e2 = new Examplle("Gaurav");
	
	e1.info();
	e2.info();
}
}
