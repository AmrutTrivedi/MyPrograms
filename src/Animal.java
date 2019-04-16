class Animal1{
	public static void main(String args[]){}
void eat()
{
	System.out.println("eating...");

} 
}
class Bark extends Animal1{  
void eat()
{
	System.out.println("barking...");
}  
}  
class TestInheritance{
{  
Animal1 d=new Bark();  
d.eat();  
d.eat();  
}}

