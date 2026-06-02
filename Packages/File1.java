import MyPackages.Calculator;

public class File1 {
    public static void main(String[] args) {
        Calculator calc = new Calculator();
        int a = 10, b = 5;
        System.out.println("Sum: " + calc.sum(a, b));
        System.out.println("Subtraction: " + calc.sub(a, b));
        System.out.println("Multiplication: " + calc.mul(a, b));
        System.out.println("Division: " + calc.div(a, b));
    }
}
