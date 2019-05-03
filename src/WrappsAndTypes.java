
public class WrappsAndTypes {
public static void main(String args[]) {
	
	int i = 20;
	Integer i1 = i;
	System.out.println("After Wrapping (AutoBoxing) the Primitive values: " +i1);
	
	Integer i2 = 30;
	int b = i2;
	System.out.println("After Wrapping (Unboxing) the Primitive values: " +b);
	
	int a = 20;
	long l = a;
	System.out.println("After type casting (i.e) after widening: " +l);
	
	double d = 10.4;
	int f = (int)d;
	System.out.println("After type casting (i.e) after Narrowing (I.e) after Explicit Conversion: " +f);	
}
}
