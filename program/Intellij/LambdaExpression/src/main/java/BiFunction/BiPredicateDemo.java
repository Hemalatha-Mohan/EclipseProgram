package BiFunction;

import java.util.function.BiPredicate;

//tradition way of implementing Bipredicate
public class BiPredicateDemo implements BiPredicate<String,String> {
    public static void main(String[] args) {
        BiPredicate<String,String> biPredicate = new BiPredicateDemo();
        System.out.println(biPredicate.test("HemaRajan","HemaRajan"));
        System.out.println(biPredicate.test("HemaRajan","Hemarajan"));

    }

    @Override
    public boolean test(String s, String s2) {
        return s.equals(s2);
    }
}
