
public class StudentName {
private String Name;
StudentName(String Name1)
{
	Name = Name1;
	
}
String getName()
{
	return Name;
	
	}
void setname() {
	Name ="Rahul";
}
}
class Test13{
	public static void main(String args[]) {
		StudentName S1 = new StudentName("Rahul1");
		System.out.println(S1.getName());
		
		
	}
}
