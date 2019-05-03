
public class MultiDimensional {
public static void main(String args[])
{
	int[][] a = new int[3][3];
	int a1[][]= {{1,2,3},{2,4,5},{4,3,5}};
	
	for(int i=0;i<a1.length;i++)
	{
		for(int j=0;j<a1.length;j++)
		{
			System.out.println(a1[i][j]+" ");
		}
		System.out.println();
	}
}
}
