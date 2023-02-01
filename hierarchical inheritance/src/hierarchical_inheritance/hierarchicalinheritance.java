package hierarchical_inheritance;
class Animal{  
void run()
{
	System.out.println("running...");
	}  
}  
class Dog extends Animal{  
void bark()
{
	System.out.println("barking...");
	}  
}  
class Cat extends Animal{  
void meow()
{
	System.out.println("meowing...");
} 
}  
class hierarchicalinheritance{  
public static void main(String args[]){  
Cat c=new Cat(); 
c.run();
c.meow();
}
}

