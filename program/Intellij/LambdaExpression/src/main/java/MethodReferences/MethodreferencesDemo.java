package MethodReferences;

import java.awt.print.Printable;
import java.lang.reflect.Array;
import java.util.*;
import java.util.function.BiFunction;
import java.util.function.Function;


//2 . method we need to create a functional interface
@FunctionalInterface
interface Print{
    void print (String msg);
}


public class MethodreferencesDemo {
    //2.
    public void display(String msg){
       msg = msg.toUpperCase();
       System.out.println(msg);
    }

    public static int addition(int a, int b){
        return (a+b);

    }
    public static void main(String[] args) {
        //1.Method Reference to a static method
        //lambda expression
        Function<Integer,Double> function = (input)-> Math.sqrt(input);
        System.out.println(function.apply(4));

        //using method references
        Function<Integer,Double> functionMethodRef = Math::sqrt;
        System.out.println(functionMethodRef.apply(4));

        //BiFunction-lambda expression
        BiFunction<Integer,Integer,Integer> biFunctionLambda = (a,b)->MethodreferencesDemo.addition(a,b);
        System.out.println(biFunctionLambda.apply(10,20));

        //using method reference for bifunction
        BiFunction<Integer,Integer,Integer> biFunctionLambda1 = MethodreferencesDemo::addition;
        System.out.println("Method Reference"+ biFunctionLambda1.apply(10,40));

        //2. Method reference to an instance method of an object
        MethodreferencesDemo methodreferencesDemo = new MethodreferencesDemo();

       //using Lambda expression
        Print printable = (msg)-> methodreferencesDemo.display(msg);
        printable.print("Hello");

        //using method reference
        Print printable1 = methodreferencesDemo::display;
        printable1.print("world");

    //3.Reference to the instance method of an orbitary object
        // sometimes , we call a method ofargument in the lambda expressipon
        //In that case , we can use method reference to call an instance
        // method of an arbitary object of a specific type.

        Function<String, String> function1 = (String input)->input.toLowerCase();
        System.out.println(function1.apply("HEMA"));

        //using method reference
        Function<String, String> function2 = String::toLowerCase;
        System.out.println(function1.apply("HEMARajAN"));

        //Array
        String[] strArray = {"A","E","I","O","u","a","e","i","o","u"};
        //using Lambda
        Arrays.sort(strArray,(s1,s2)->s1.compareToIgnoreCase(s2));


        //using Method references
        Arrays.sort(strArray, String::compareToIgnoreCase);

        //4. reference to a constructor
        List<String> fruits = new ArrayList<>();
        fruits.add("Banana");
        fruits.add("watermelon");
        fruits.add("apple");
        fruits.add("mango");
        Function<List<String>, Set <String >> setFunction = (fruitsList)->new HashSet<>(fruitsList);
        System.out.println(setFunction.apply(fruits));

        //method reference
        Function<List<String>, Set <String >> setFunction1 = HashSet::new;
        System.out.println(setFunction1 .apply(fruits));








    }

}
