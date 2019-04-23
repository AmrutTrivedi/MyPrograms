
public class myobj2 {
int id;
String Name;

myobj2(int i,String n)
{
	id = i;
	Name = n;
}
myobj2(myobj2 m)
{
	id = m.id;
	Name = m.Name;
	
}
void display() {
	System.out.println(id+" "+Name);
}
public static void main(String args[])
{
	myobj2 mobj = new myobj2(253,"JAVA");
	myobj2 mobj1 = new myobj2(mobj);
	mobj.display();
	mobj1.display();
	
 }
}
