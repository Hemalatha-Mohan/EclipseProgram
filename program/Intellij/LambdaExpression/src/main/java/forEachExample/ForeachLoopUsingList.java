package forEachExample;

import java.util.ArrayList;
import java.util.List;

public class ForeachLoopUsingList {
    public static void main(String[] args) {
        List<Person> list = new ArrayList<Person>();
        list.add(new Person("Raghul",25));
        list.add(new Person("sunil",30));
        list.add(new Person("syed",23));

        //prior to java 8 for each method to iterate
        for (Person person : list){
            System.out.println(person.getName());
            System.out.println((person.getAge()));

        }

        //for each method by using lambda expression
        list.forEach((person) -> {
            System.out.println(person.getName());
            System.out.println(person.getAge());

        });

        //for each method with stream
        list.stream().forEach((person) -> {
            System.out.println(person.getName());
            System.out.println(person.getAge());

        });

    }
}
class Person{
    private String name;
    private int age;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public Person(String name, int age) {
        this.name = name;
        this.age = age;
    }
}