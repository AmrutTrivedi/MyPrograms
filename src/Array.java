
public class Array {
public static void main(String args[])
{
int arr1[]= new int[]{1,2,3,4,5};
int arr2[]=new int[arr1.length];
for(int i=0;i<arr1.length;i++)
{
	arr2[i]=arr1[i];
}
System.out.println("The Given Values Are:");

for(int i=0;i<arr1.length;i++)
{
	System.out.println("Elements of 1st Array's are"+arr1[i]+"");
		
}

System.out.println("The Second Values are");

for(int i=0;i<arr2.length;i++)
{
	System.out.println("\nElements of 2nd Array's are"+arr2[i]+"");
}
}
}
