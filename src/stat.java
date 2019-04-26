
public class stat {
int roll_no;
String name;
static String College ="MNM";

stat(int roll_no,String name){
	this.roll_no=roll_no;
	this.name=name;
}
void print()
{
	System.out.println(+roll_no);
	System.out.println(name);
	System.out.println(College);
	String College ="SSN";
	System.out.println(College);
}
}
class Stud{
public static void main(String argsp[])
{
	stat s1= new stat(110,"Rajesh");
	stat s2= new stat(110,"Mukesh");
	stat s3= new stat(110,"Ramesh");
	s1.print();
	s2.print();
	s3.print();
	
}}
