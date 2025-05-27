public class q8_OperatorPrecedence {
    public static void main(String[] args) {
        // Example 1: Multiplication has higher precedence than addition
        int result1 = 10 + 5 * 2;
        System.out.println("Result of 10 + 5 * 2 = " + result1);
        System.out.println("Explanation: 5 * 2 is evaluated first, then added to 10 → 10 + 10 = 20");

        // Example 2: Parentheses alter precedence
        int result2 = (10 + 5) * 2;
        System.out.println("\nResult of (10 + 5) * 2 = " + result2);
        System.out.println("Explanation: (10 + 5) is evaluated first → 15 * 2 = 30");

        // Example 3: Mixing division and subtraction
        int result3 = 20 - 4 / 2;
        System.out.println("\nResult of 20 - 4 / 2 = " + result3);
        System.out.println("Explanation: 4 / 2 is evaluated first → 20 - 2 = 18");

        // Example 4: More complex expression
        int result4 = 10 + 2 * 3 - 4 / 2;
        System.out.println("\nResult of 10 + 2 * 3 - 4 / 2 = " + result4);
        System.out.println("Explanation: 2 * 3 = 6, 4 / 2 = 2 → 10 + 6 - 2 = 14");
    }
}
