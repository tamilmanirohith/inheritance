package multiple_inheitance;
interface Animalplay {
	   void play();
	}
	interface AnimalSleep {
	   void sleep();
	}
	class Animal implements Animalplay, AnimalSleep {
	   public void play() {
	      System.out.println("Animal is playing");
	   }
	   public void sleep() {
	      System.out.println("Animal is sleeping");
	   }
	}
	public class multiple_inheritance {
	   public static void main(String args[]) {
	      Animal a = new Animal();
	a.play();
		a.sleep();
	   }
	}