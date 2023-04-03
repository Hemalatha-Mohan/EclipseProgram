package Inheritance;

//The major use of abstract classes and methods is to achieve abstraction in Java.

//Abstraction is an important concept of object-oriented programming that allows us to 
//hide unnecessary details and only show the needed information.

//This allows us to manage complexity by omitting or hiding details with a simpler, higher-level idea.

abstract class MotorBike {
	  abstract void brake();
	}

	class SportsBike extends MotorBike {
	    
	  // implementation of abstract method
	  public void brake() {
	    System.out.println("SportsBike Brake");
	  }
	}

	class MountainBike extends MotorBike {
	    
	  // implementation of abstract method
	  public void brake() {
	    System.out.println("MountainBike Brake");
	  }
	}

	class abstraction {
	  public static void main(String[] args) {
	    MountainBike m1 = new MountainBike();
	    m1.brake();
	    SportsBike s1 = new SportsBike();
	    s1.brake();
	  }
	}
	
	/*In the above example, we have created an abstract super class MotorBike.
	 *  The superclass MotorBike has an abstract method brake().

The brake() method cannot be implemented inside MotorBike. 
It is because every bike has different implementation of brakes.
 So, all the subclasses of MotorBike would have different implementation of brake().

So, the implementation of brake() in MotorBike is kept hidden.

Here, MountainBike makes its own implementation of brake() and SportsBike makes its own implementation of brake().*/
	
	