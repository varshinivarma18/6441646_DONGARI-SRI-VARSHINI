import java.util.concurrent.*;
import java.util.*;

public class q41_CallableExample {
    public static void main(String[] args) throws Exception {
        ExecutorService executor = Executors.newFixedThreadPool(5);
        List<Callable<String>> tasks = new ArrayList<>();
        for (int i = 1; i <= 10; i++) {
            int id = i;
            tasks.add(() -> "Task " + id + " done");
        }
        List<Future<String>> results = executor.invokeAll(tasks);
        for (Future<String> f : results) {
            System.out.println(f.get());
        }
        executor.shutdown();
    }
}
