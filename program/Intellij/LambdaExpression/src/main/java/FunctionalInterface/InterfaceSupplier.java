package FunctionalInterface;
//pass a type get() method does not take any input


import java.time.LocalDateTime;
import java.util.function.Supplier;

class SupplierImpl implements Supplier<LocalDateTime> {

    @Override
    public LocalDateTime get() {
        return LocalDateTime.now();
    }
}

public class InterfaceSupplier {

    public static void main(String[] args) {
       // Supplier<LocalDateTime> Supplier = new SupplierImpl();
        //System.out.println(Supplier.get());

        Supplier<LocalDateTime> supplier=()->  LocalDateTime.now();
        System.out.println(supplier.get());


    }


}
