
public class MyObj1 {	
String Name;
String LastName;
int age;
long Phone_No;
String State;
MyObj1(String N,String LN,int a,long P)
{
	Name = N;
	LastName = LN;
	age = a;
	Phone_No = P;	
}
MyObj1(String S)
{
	State = S;
}
void display()
{
	System.out.println("The Inputs are:\n"+Name+"\n"+LastName+"\n"+age+"\n"+Phone_No+"\n"+State);
}
public static void main(String args[])
{
MyObj1 myobj = new MyObj1("Rajaa","Lingaa",25,9887456123L);
MyObj1 myobj2 = new MyObj1("Chennai");
myobj2.Name = myobj.Name;
myobj2.LastName = myobj.LastName;
myobj2.age = myobj.age;
myobj2.Phone_No = myobj.Phone_No;
myobj.State = "Chennai";
myobj.display();
}}
