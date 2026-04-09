public class file2 {
    public static void main(String[] args) {
        int num = 10;
        int div = 0;

        try {
            int result = num / div; // This will throw ArithmeticException
            System.out.println("Result: " + result);
        } catch (ArithmeticException e) {
            System.out.println("Cannot divide by zero: " + e.getMessage());
        }
    }
}
