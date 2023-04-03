package Inheritance;
//animal as animals ; dog as beer
//If the abstract class includes any abstract method, 
//then all the child classes inherited from the abstract superclass must provide the implementation of the abstract method.
abstract class animals {
	  abstract void makeSound();

	  public void eats() {
	    System.out.println("I can eat.");
	  }
	}

	class beer extends animals {

	  // provide implementation of abstract method
	  public void makeSound() {
	    System.out.println("Bark bark");
	  }
	}

	class implementingAbstractMethods {
	  public static void main(String[] args) {

	    // create an object of Dog class
	    beer d1 = new beer();

	    d1.makeSound();
	    d1.eats();
	  }
	}