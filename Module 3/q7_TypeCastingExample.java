public class q7_TypeCastingExample {
    public static void main(String[] args) {
        // Declare a double variable with a decimal value
        double myDouble = 9.78;
        // Cast it to an int (explicit casting)
        int myInt = (int) myDouble;

        // Display the result
        System.out.println("Original double value: " + myDouble);
        System.out.println("After casting to int: " + myInt);

        // Declare an int variable
        int anotherInt = 42;
        // Cast it to a double (implicit casting)
        double anotherDouble = anotherInt;

        // Display the result
        System.out.println("Original int value: " + anotherInt);
        System.out.println("After casting to double: " + anotherDouble);
    }
}
