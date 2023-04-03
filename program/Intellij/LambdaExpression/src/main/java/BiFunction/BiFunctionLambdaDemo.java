package BiFunction;

import java.util.function.BiFunction;
import java.util.function.Function;

public class BiFunctionLambdaDemo  {

    public static void main(String[] args) {


       /* BiFunction<Integer,Integer,Integer> biFunction = new BiFunction<Integer,Integer,Integer>(){

            @Override
            public Integer apply(Integer t, Integer u) {
                return (t+u);
            }
        };
        System.out.println(biFunction.apply(10,20));
        System.out.println((biFunction.apply(100,300)));

        */
        BiFunction<Integer,Integer,Integer> biFunction = (t,u) ->(t+u);
        BiFunction<Integer,Integer,Integer> sub = (t,u) ->(t-u);

        // passing Single argument and calling the bifuntion and storing
        Function<Integer,Integer> function = (number)->number*number;
        Integer integer =biFunction.andThen(function).apply(10,20);
        System.out.println(integer);

        System.out.println(biFunction.apply(10,20));
        System.out.println((biFunction.apply(100,300)));
        System.out.println((sub.apply(200,100)));

    }
}
