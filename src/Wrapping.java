
public class Wrapping {
public static void main(String args[])
{
byte a=1;
Byte boj = new Byte(a);

int b=2;
Integer ioj = new Integer(b);

char c='e';
Character coj =c;

System.out.println("Byte object byteobj:  " + boj); 
System.out.println("Byte object byteobj:  " + ioj); 
System.out.println("Byte object byteobj:  " + coj); 

byte bv=boj;
int iv=ioj;
char cv=coj;
System.out.println("After Converting from Wrapper to Primitive");
System.out.println("Byte object byteobj:  " + bv); 
System.out.println("Byte object byteobj:  " + iv); 
System.out.println("Byte object byteobj:  " + cv); 
}
}