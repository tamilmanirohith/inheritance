package hybrid_inheritance;
class Animal
{  
public void sleep()  
{  
System.out.println("All Animal will sleep");  
}  
}  
interface Dog
{  
public void eat();  
}  
interface Cat
{  
public void walk();  
}   
public  class Horse extends Animal implements Dog, Cat
{ 
public void run(){
System.out.println("I can run faster");
} 
public void eat()  
{  
System.out.println("I am going to eat");  
}    
public void walk()  
{  
System.out.println("I can walk");  
}   
public static void main(String args[])  
{  
Horse horse = new Horse();   
horse.eat();   
horse.sleep();
horse.walk();
horse.run();
} 
} 