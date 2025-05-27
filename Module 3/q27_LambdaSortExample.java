import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class q27_LambdaSortExample {
    public static void main(String[] args) {
        List<String> names = new ArrayList<>();
        names.add("Charlie");
        names.add("Alice");
        names.add("David");
        names.add("Bob");

        Collections.sort(names, (a, b) -> a.compareTo(b));

        for (String name : names) {
            System.out.println(name);
        }
    }
}
