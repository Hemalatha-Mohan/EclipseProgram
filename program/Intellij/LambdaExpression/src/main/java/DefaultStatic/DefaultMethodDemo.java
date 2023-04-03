package DefaultStatic;

interface Vehicle {
    String getBrand();

    String speed();

    String slowDown();

    default String turnAlaramOn() {
        return "Alaram is on";
    }

    default String turnOfAlaram() {
        return "Alaram is off";

    }
    static  String getCompany(){
        return "BMW";
    }
}

class Car implements Vehicle{

    @Override
    public String getBrand() {
        return "BMW";
    }

    @Override
    public String speed() {
        return "the car is speeding up";
    }

    @Override
    public String slowDown() {
        return "the car is slowing down";
    }
}

//the  default method defined in vehicle interface is automatically available to car implementation class
// in this way we can preserve backward compatability
public class DefaultMethodDemo {
    public static void main(String[] args) {
        Car vehicle = new Car();
        System.out.println(vehicle.getBrand());
        System.out.println(vehicle.speed());
        System.out.println(vehicle.slowDown());
        System.out.println(vehicle.turnAlaramOn());
        System.out.println(vehicle.turnOfAlaram());

        //static method is called by the interface name
        System.out.println(Vehicle.getCompany());
    }
}
