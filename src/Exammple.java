
 class Exammple {
static int a =10;
static int b;

static {
	System.out.println("Static block Initialized :");
	b=a*4;
	
public static void main(String args[])
{
	System.out.println("Before Callng Static Block :"+a);
	System.out.println("After calling the static block :"+b);
}
}
}
