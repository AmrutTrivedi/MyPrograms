
public class UsingStatMeth {
int roll_no;
String Name;
static String College = "Srm";
static void change() {
	College = "MNM";
}
UsingStatMeth(int r,String n)
{
roll_no = r;
Name = n;
}
void display()
{
	System.out.println(roll_no+" "+Name+" "+College);
}
}
class Using{
	public static void main(String args[])
	{
		UsingStatMeth a1 = new UsingStatMeth(123,"Raju");
		UsingStatMeth a2 = new UsingStatMeth(132,"Ramesh");
		UsingStatMeth a3 = new UsingStatMeth(133,"Romesh");
		a1.change();
		a2.change();
		a3.change();
		a1.display();
		a2.display();
		a3.display();
		
	}
}
