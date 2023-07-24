import java.util.Arrays;
import java.util.Comparator;
import java.util.List;

public class StreamMain {
    public static void streamMain(List<Integer> intList) {
        intList.stream()
                .filter(value -> value > 0 && value % 2 == 0)
                .sorted(Comparator.naturalOrder())
                .forEach(System.out::println);
    }
}