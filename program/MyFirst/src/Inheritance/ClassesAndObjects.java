package Inheritance;

//Java Class and Objects

/*class Lamp {
	  
	  // stores the value for light
	  // true if light is on
	  // false if light is off
	  boolean isOn;

	  // method to turn on the light
	  void turnOn() {
	    isOn = true;
	    System.out.println("Light on? " + isOn);

	  }

	  // method to turnoff the light
	  void turnOff() {
	    isOn = false;
	    System.out.println("Light on? " + isOn);
	  }
	}

	class ClassesAndObjects {
	  public static void main(String[] args) {

	    // create objects led and halogen
	    Lamp led = new Lamp();
	    Lamp halogen = new Lamp();

	    // turn on the light by
	    // calling method turnOn()
	    led.turnOn();

	    // turn off the light by
	    // calling method turnOff()
	    halogen.turnOff();
	  }
	}*/
	//-------------------------------------------------------------------------------//

//Example: Create objects inside the same class

class ClassesAndObjects {
	  
	  // stores the value for light
	  // true if light is on
	  // false if light is off
	  boolean isOn;

	  // method to turn on the light
	  void turnOn() {
	    isOn = true;
	    System.out.println("Light on? " + isOn);

	  }

	  public static void main(String[] args) {
	    
	    // create an object of Lamp
	    ClassesAndObjects led = new ClassesAndObjects();

	    // access method using object
	    led.turnOn();
	  }
	}
