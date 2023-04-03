package Overloading;

class Animal {
	   protected void displayInfo() {
	      System.out.println("I am an animal.");
	   }
	}

	class Dog extends Animal {
	   public void displayInfo() {
	      super.displayInfo();
		   
	      System.out.println("I am a dog.");
	   }
	}

	public class Main {
	   public static void main(String[] args) {
		  // Animal a = new Animal();
		      //a.displayInfo();
	      Dog d1 = new Dog();
	      d1.displayInfo();
		 
	     
	      
	   }
	}
