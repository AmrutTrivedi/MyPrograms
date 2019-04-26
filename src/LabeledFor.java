
public class LabeledFor {
	public static void main(String args[]) {
		int i,j;
		aa:
			for(i=1;i<=3;i++) {
				bb:
					for(j=1;j<3;j++)
					{
						if(i==3&&j==3)
						{
							break bb;	
						}
						System.out.println(i+"  "+j);
						
					}
			}
	}

}
