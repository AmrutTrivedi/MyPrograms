import java.util.Scanner;
public class UsingAdder {
public static void main(String[] args) {
	Scanner Sc = new Scanner(System.in);
	int firstnumber,secondnumber ;
	int sum;
	System.out.println("Enter First Number :");
	firstnumber = Sc.nextInt();
	System.out.println("Enter Second Number :");
	secondnumber = Sc.nextInt();
	sum = firstnumber + secondnumber;
	System.out.println("After Adding all the values :"+sum);
}
}
