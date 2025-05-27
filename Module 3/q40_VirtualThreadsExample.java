public class q40_VirtualThreadsExample {
    public static void main(String[] args) throws InterruptedException {
        long start = System.currentTimeMillis();
        Thread[] threads = new Thread[100_000];
        for (int i = 0; i < 100_000; i++) {
            threads[i] = Thread.startVirtualThread(() -> System.out.print(""));
        }
        for (Thread t : threads) t.join();
        long end = System.currentTimeMillis();
        System.out.println("Virtual threads took: " + (end - start) + " ms");
    }
}
