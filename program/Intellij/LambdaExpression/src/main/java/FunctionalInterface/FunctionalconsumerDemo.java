package FunctionalInterface;


import java.util.function.Consumer;

/*class ConsumerImpl implements Consumer<String>{

    @Override
    public void accept(String s) {
        System.out.println(s);

    }
}

 */
public class FunctionalconsumerDemo {
    public static void main(String[] args) {
       // Consumer<String> consumer = new ConsumerImpl();
        //consumer.accept("Hello world");


        Consumer<String> consumer=(s) -> System.out.println(s);
        consumer.accept("Hello world");



    }




}
