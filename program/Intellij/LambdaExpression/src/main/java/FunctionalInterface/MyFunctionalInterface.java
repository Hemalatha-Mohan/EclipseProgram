package FunctionalInterface;

@FunctionalInterface

public interface MyFunctionalInterface {
    void print(String msg);

    //trying to add another abstract method it will throw compile time error
    // void display();

    default void m1(){
        System.out.println("default Method");
    }

    static void m2(){
        System.out.println("static Method");
    }
}
