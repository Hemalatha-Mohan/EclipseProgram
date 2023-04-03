package BiFunction;

import java.util.LinkedHashMap;
import java.util.Map;
import java.util.function.BiConsumer;

public class BiConsumerwithLambda {
    public static void main(String[] args) {
        //anonymous implementation
       /* BiConsumer<Integer,Integer> biConsumer = new BiConsumer<Integer, Integer>() {
            @Override
            public void accept(Integer a, Integer b) {
                System.out.println(a+b);

            }
        };

        */
        BiConsumer<Integer,Integer> biConsumer = ( a,  b) -> System.out.println(a+b);
        biConsumer.accept(10,20);

        //Map
        Map<Integer,String> map = new LinkedHashMap<>();
        map.put(1,"Java");
        map.put(2,"c++");
        map.put(3,"rust");
        map.put(4,"python");
        map.put(5,"Go");

        map.forEach((k,v)->{
            System.out.println(k);
            System.out.println(v);

        });


    }
}
