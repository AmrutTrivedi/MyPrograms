
public class wrapper {
public static void main(String args[]) {
	int i = 10;
	Integer i1 = i;		// Autoboxing
	char c='e';
	Character c1 ='c';
	double d =10.5;
	Double d1 = d;
	System.out.println("After Autoboxing the values are:\n" +i1+"\n"+c1+"\n"+d1);
	
	int i2 =i;				//Unboxing
	char c2 = c1;
	double d2 = d;
	System.out.println("After Autoboxing the values are:\n" +i2+"\n"+c2+"\n"+d2);
}
}
																		