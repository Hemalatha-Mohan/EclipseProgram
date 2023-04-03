package BiFunction;

import java.util.function.BiConsumer;

//traditional way

public class BiConsumerDemo implements BiConsumer<Integer,Integer> {

    public static void main(String[] args) {
        BiConsumer<Integer,Integer> biConsumer = new BiConsumerDemo();
        biConsumer.accept(10,20);

    }
    @Override
    public void accept(Integer a, Integer b) {
        System.out.println(a+b);

    }
}
