package forEachExample;

import java.util.HashSet;
import java.util.Set;

public class ForEachMethodUsingSet {
    public static void main(String[] args) {
        Set<Person> set = new HashSet<>();
        set.add(new Person("Hema",34));
        set.add(new Person("Suji",38));
        set.add(new Person("keerthana",31));

        //prior to java 8 for each loop

        for (Person person : set){
            System.out.println(person.getName());
            System.out.println(person.getAge());
        }

        //for each method + lambda expression
        set.forEach((person) -> {
            System.out.println(person.getName());
            System.out.println(person.getAge());

        });

        //using stream with for each method

        set.stream().forEach((person) -> {
            System.out.println(person.getName());
            System.out.println(person.getAge());

        });

    }
}
