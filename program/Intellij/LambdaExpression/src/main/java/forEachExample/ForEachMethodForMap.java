package forEachExample;

import java.util.HashMap;
import java.util.Map;

public class ForEachMethodForMap {
    public static void main(String[] args) {
        Map<Integer,Person> map = new HashMap<Integer, Person>();
        map.put(1,new Person("Hema",34));
        map.put(2,new Person("appu",3));
        map.put(3,new Person("luee",5));

        //prior to java 8 for each loop

        for(Map.Entry<Integer,Person> entry: map.entrySet()){
            System.out.println(entry.getKey());
            System.out.println(entry.getValue().getName());
        }

    //for each method + lambda expression
        map.forEach((k,v)->
        {
            System.out.println(k);
            System.out.println(v.getName());
        });


    }
}
