package FunctionalInterface;
//lambda expression to implement functional interface

interface Shape{
    void draw();
}

public class FunctionalInterfaceWithLambda {

    public static void main(String[] args) {
        Shape square = ()->System.out.println("draw a square");
        square.draw();
    }
}
