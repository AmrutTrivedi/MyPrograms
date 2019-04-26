import java.util.Scanner;

class App {
int roll_no;
int age;
String Name;
String College_Name;
	public static void main(String args[]){
	Scanner a1 = new Scanner(System.in);
	int roll_no = a1.nextInt();
	int age = a1.nextInt();
	String Name = a1.nextLine();
	String College_Name = a1.nextLine();
	System.out.println(roll_no+" "+age);
	System.out.println(Name+" "+College_Name);
	
	}
}

