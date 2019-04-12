public class A {
	int roll_no;
	String Name;
	float Fee;
	A(int rollno,String Name,float Fee)
	{
		this.roll_no=rollno;
		this.Name=Name;
		this.Fee=Fee;
	}
	void output()
	{
		System.out.println(roll_no+"\t"+Name+"\t "+Fee);
	}
}
		class Testthis{
			public static void main(String args[])
			
			{
				A a1= new A(312,"Raj",80000);
				A a2= new A(314,"Urav",80000);
				a1.output();
				a2.output();
}}
		