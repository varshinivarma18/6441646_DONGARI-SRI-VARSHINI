public class q12_MethodOverloading {
    public static int add(int a, int b) {
        return a + b;
    }

    public static double add(double a, double b) {
        return a + b;
    }

    public static int add(int a, int b, int c) {
        return a + b + c;
    }

    public static void main(String[] args) {
        System.out.println(add(5, 10));
        System.out.println(add(3.5, 2.7));
        System.out.println(add(1, 2, 3));
    }
}
