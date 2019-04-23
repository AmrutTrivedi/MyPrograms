
abstract class Abstract2 {
		String Name = "John";
		int age = 25;
		abstract void study();
}
 class Student extends Abstract2{
		int graduation_year = 2019;
			void study()
			{
				System.out.println("Studying all day long");
			}
		}
 class myclasss{
	 public static void main(String argsp[])
	 {
		 Student myobj = new Student();
		 System.out.println("Name:" +myobj.Name);
		 System.out.println("Age:" +myobj.age);
		 System.out.println("Graduation Year:" +myobj.graduation_year);
		 myobj.study(); 
	 }	
 }

