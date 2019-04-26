import java.util.Scanner;
import java.util.Arrays;
public class JaggedArray {
public static void main(String args[])
{
	Scanner sc = new Scanner(System.in);
	System.out.println("Enter the array length:");
	int length = sc.nextInt();
	int length1 = sc.nextInt();
	int arr[][] = new int[length][length1];
	System.out.println("Enter the elements of Array:");
	for(int i=0;i<length;i++)
	 for(int j=0;j<length1;j++)
	 { 
		arr[i][j] = sc.nextInt();	
	}
System.out.println(Arrays.toString(arr));
}
}

							