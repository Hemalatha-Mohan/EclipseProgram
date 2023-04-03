package Inheritance;
//1. Access Overridden Methods of the superclass

/*class Bird {

	  // overridden method
	  public void display(){
	    System.out.println("I am an animal");
	  }
	}

	class parrot extends Bird {

	  // overriding method
	  @Override
	  public void display(){
	    System.out.println("I am a dog");
	  }

	  public void printMessage(){
	    display();
	  }
	}

public class Overriding {

	public static void main(String[] args) {
		parrot parrot1 = new parrot();
	    parrot1.printMessage();
	}

}*/

//*output

/*I am a dog*/
//---------------------------------------------------------------

// super to Call Superclass Method

/*class Bird {

	  // overridden method
	  public void display(){
	    System.out.println("I am an animal");
	  }
	}

	class parrot extends Bird {

	  // overriding method
	  @Override
	  public void display(){
	    System.out.println("I am a dog");
	  }

	  public void printMessage(){
		// this calls overriding method
		    display();

		    // this calls overridden method
		    super.display();
	  }
	}

public class Overriding {

	public static void main(String[] args) {
		parrot parrot1 = new parrot();
	    parrot1.printMessage();
	}

}*/
/* output
 * I am a dog
I am an animal
*/
//-------------------------------------------------------------------------
//2. Access Attributes of the Superclass
//The superclass and subclass can have attributes with the same name.
//We use the super keyword to access the attribute of the superclass.

/*class Bird {
	  protected String type="animal";
	}

	class Parrot extends Bird {
	  public String type="mammal";

	  public void printType() {
	    System.out.println("I am a " + type); 
	    //type refers to the attribute of the subclass Dog.
	    
	    //super.type refers to the attribute of the superclass Animal.
	    System.out.println("I am an " + super.type);
	  }
	}

	class Overriding {
	  public static void main(String[] args) {
	    Parrot parrot = new Parrot();
	    parrot.printType();
	  }
	}*/
//3. Use of super() to access superclass constructor
//use of super()
/*class Bird {

	  // default or no-arg constructor of class Animal
	  Bird() {
	    System.out.println("I am an animal");
	  }
	}

	class parrot extends Bird {

	  // default or no-arg constructor of class Dog
	 parrot() {

	    // calling default constructor of the superclass
	   // super();
	   /*However, using super() is not compulsory. Even if super() is not used in the subclass constructor, 
		 the compiler implicitly calls the default constructor of the superclass.*/
	    
		 /*System.out.println("I am a dog");
	  }
	}

	class Overriding {
	  public static void main(String[] args) {
	    parrot parrot1 = new parrot();
	  }
	}*/

// output
	//I am an animal
	//I am a dog
//------------------------------------------------------------------------
//Example 5: Call Parameterized Constructor Using super()

class Bird {

	  // default or no-arg constructor
	  Bird() {
	    System.out.println("I am an animal");
	  }

	  // parameterized constructor
	  Bird(String type) {
	    System.out.println("Type: "+type);
	  }
	}

	class Parrot extends Bird {

	  // default constructor
	  Parrot() {
		 
	    // calling parameterized constructor of the superclass
	    super("Bird");

	    System.out.println("I am a Parrot");
	  }
	}

	class Overriding {
	  public static void main(String[] args) {
	    Parrot Parrot1 = new Parrot();
	  }
	}

