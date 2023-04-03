package FunctionalInterface;

import java.util.function.Function;

//Funtion key for functional Interface-traditional way
/* class FunctionImpl implements Function<String,Integer> {

     @Override
     public Integer apply(String s) {
         return s.length();
     }

 }

 */
public class Funtiondemo{
    public static void main(String[] args) {
       //traditional way
       /* Function<String,Integer> function = new FunctionImpl();
        System.out.println(function.apply("Hemalatha"));


        */

        //using lambda expression

        Function<String,Integer> function = (String s)-> s.length();
        System.out.println(function.apply("Ramesh"));






    }
}