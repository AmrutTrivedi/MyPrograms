class Animal4mal{  
		void eat(){System.out.println("eating...");}  
		}  
		class Dog1 extends Animal4mal{  
		void bark(){System.out.println("barking...");}  
		} 
		class Cat extends Animal4mal{  
		void meow(){System.out.println("meowing...");}  
		}  
		class TestInheritance3{  
		public static void main(String args[]){  
		Cat c=new Cat();  
		c.meow();  
		c.eat();
		}
		}
		