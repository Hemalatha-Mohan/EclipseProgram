package Inheritance;
//Though abstract classes cannot be instantiated, we can create subclasses from it. 
//We can then access members of the abstract class using the object of the subclass. For example,


abstract class Language {

	  // method of abstract class
	  public void display() {
	    System.out.println("This is Java Programming");
	  }
	}

	class abstractClassAndMethod extends Language {

	  public static void main(String[] args) {
	    
	    // create an object of Main
		  abstractClassAndMethod obj = new abstractClassAndMethod();

	    // access method of abstract class
	    // using object of Main class
	    obj.display();
	  }
	}
	
	//In the above example, we have created an abstract class named Language. 
	//The class contains a regular method display().




