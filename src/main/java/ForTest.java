import java.util.function.Consumer;

public class ForTest {
    public static void main(String[] args) {
//        Optional<String> test = Optional.ofNullable(null);
//        test.ifPresent(System.out::println);
//        System.out.println(test);
        Consumer<String> d = System.out::println;
        d.accept("Bla");
    }
}
