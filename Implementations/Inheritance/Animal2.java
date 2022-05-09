package Inheritance;

//Multilevel inheritance
public class Animal2 {
	
	 
		void eat(){System.out.println("eating...");}  
		}  
		class Dog extends Animal{  
		void bark(){System.out.println("barking...");}  
		}  
		class Cat extends Animal2{  
		void meow(){System.out.println("meowing...");}  
		}  
		class TestInheritance3{  
		public static void main(String args[]){  
		Cat c=new Cat();  
		c.meow();  
		c.eat();  
		//c.bark();//C.T.Error  
		}}  


