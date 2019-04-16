
public class Array1 {
static void min(int arr[])
{
	int min=arr[3];
	for(int i=1;i<arr.length;i++)
	{
		if(arr[3]>arr[i])
			min = arr[i];
		System.out.println(min);	
	}
}
public static void main(String args[])
{
	int arr[]= {33,3,4,5};
	min(arr);
	
}

}
