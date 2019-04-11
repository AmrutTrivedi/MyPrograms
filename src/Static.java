
public class Static {
 
	     int rollno;  
	     String name;  
	     static String college = "ITS"; 
	     String Address = "Chennai";
	     
	     static void change(){  
	     college = "BBDIT";  
	     }  
	     
	     Static(int r, String n,String c)
	     {  
	     rollno = r;  
	     name = n;  
	     Address = c;
	     }  
	    
	     void display()
	     {
	    	 System.out.println(rollno+" "+name+" "+college);
	     }  
	}   
class TestStaticMethod{  
	    public static void main(String args[]){  
	    Static s1 = new Static(111,"Karan","chennai");  
	    Static s2 = new Static(222,"Aryan","chennai");
	    Static s3 = new Static(333,"Sonoo","chennai");
	    Static.change();
	    s1.display();  
	    s2.display();  
	    s3.display();  
	    }  
	}  
