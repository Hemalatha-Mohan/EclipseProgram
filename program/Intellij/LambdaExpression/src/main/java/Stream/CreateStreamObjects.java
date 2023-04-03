package Stream;

import java.util.stream.Stream;

public class CreateStreamObjects {
    public static void main(String[] args) {
        //create a Stream
        Stream<String> stream = Stream.of("a","b","c");
        stream.forEach(System.out::println);
    }
}
