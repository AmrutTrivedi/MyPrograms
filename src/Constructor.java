
public class Constructor {
int age;
String S;
char Initial;

Constructor(int n,String Name,char init){
	age = n;
	S = Name;
	Initial = init;
	System.out.println("The Given Values are"+"\n"+age+"\n"+S+"\n"+Initial);
}
Constructor(int n1,String Name1)
{
		age = n1;
		S = Name1;
		System.out.println("The Given Values are"+"\n"+age+"\n"+S+"\n"+Initial);
}
public static void main(String args[]) {
	Constructor C1= new Constructor(21,"Raj",'S');
	Constructor C2= new Constructor(21,"Ram");
	
}}
	