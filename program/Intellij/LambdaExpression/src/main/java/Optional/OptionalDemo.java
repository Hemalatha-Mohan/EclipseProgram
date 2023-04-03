package Optional;

import java.util.Optional;

public class OptionalDemo {
    public static void main(String[] args) {
        //options to get optional method -of,empty,ofnullable
        //emplty()
        String email = "hemalatha@gmail.com";
        String email2 = null;

        Optional<Object> emptyOptional = Optional.empty();
        System.out.println(emptyOptional);

        //of
        Optional<String> stringOptional = Optional.of(email);
        System.out.println(emptyOptional);

        //ofnullable

        Optional<String> stringOptional1 = Optional.ofNullable(email2);
        System.out.println(email2);
        //to check if mail is present or not

        if(stringOptional.isPresent()){
            System.out.println(stringOptional.get());
        }
        else{
            System.out.println("no value present");
        }
    //default value of optional class takes String
        Optional<String> stringOptional2 = Optional.ofNullable(email2);
        String defaultOptional = stringOptional2.orElse("default@gmail.com");
        System.out.println(defaultOptional);

        //orelse get()-type of supplier
        String defaultOptional2 = stringOptional2.orElseGet(()->"default@gmail.com");
        System.out.println(defaultOptional2);

        //or else throe () for exception
      // String optionalObject = stringOptional2.orElseThrow(()->new IllegalArgumentException("Email does not exists"));
       //System.out.println(optionalObject);

    //if present method()
        Optional<String> gender = Optional.of("Male");
        Optional<String> emptyOptional1 = Optional.empty();

        gender.ifPresent((s)->System.out.println("value is present"));


        //filter()
        String result = "abc";
        if(result != null && result.contains("abc")){
            System.out.println(result);
        }
        Optional<String> optionalStr = Optional.of(result);
        optionalStr.filter(res->res.contains("abc")).ifPresent((res->System.out.println(res)));
        //map method in optional provides a way to transform value in Optional from one type to another
    }
}
