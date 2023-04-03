package BiFunction;

import java.util.function.BiFunction;


public class BiFunctionDemo implements BiFunction<Integer,Integer,Integer> {
    @Override
    public Integer apply(Integer t, Integer u) {
        return (t+u);
    }

    public static void main(String[] args) {

        BiFunction<Integer,Integer,Integer> biFunction = new BiFunctionDemo();
        System.out.println(biFunction.apply(10,20));

    }
}
