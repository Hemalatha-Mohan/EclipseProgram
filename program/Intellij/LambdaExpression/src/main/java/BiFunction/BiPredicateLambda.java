package BiFunction;

import java.util.function.BiPredicate;

public class BiPredicateLambda {
    public static void main(String[] args) {
        BiPredicate<String ,String> biPredicate = ( s,  s2) -> s.equals(s2);
        System.out.println(biPredicate.test("ramesh","ramesh"));
        System.out.println(biPredicate.test("Ramesh","ramesh"));

        BiPredicate<Integer,Integer> biPredicate1 = (x,y)->x>y;
        BiPredicate<Integer,Integer> biPredicate2 = (x,y)->x==y;

        boolean result = biPredicate1.and(biPredicate2).test(20,10);
        System.out.println(result);

        boolean result1 = biPredicate1.or(biPredicate2).test(20,10);
        System.out.println(result1);

    }
}
