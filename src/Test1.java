
class Person {
 static int  empid;
 static String Name;
Person(int i,String n)
{
	empid=i;
	Name=n;	
}
}
class Emp1 extends Person{
	float salary;
	Emp1(int id,String nam,float s)
	{
		super(empid,Name);
		salary = s;
	}
void display()
{
	System.out.println(empid+" "+Name+" "+salary);
}
}
public class Test1{
	public static void main(String args[])
	{
		Emp1 e1 = new Emp1(1065,"Rajesh",50000F);
		Emp1 e2 = new Emp1(1064,"Ramesh",60000F);
		e1.display();
		e2.display();
	}
}