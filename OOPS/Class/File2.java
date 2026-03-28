// constractor in java

import java.util.Scanner;

class Calculator {
    int num1, num2;
    Calculator(int num1, int num2) {
        this.num1 = num1;
        this.num2 = num2;
    }

    int sum() {
        return this.num1 + this.num2;
    }

    int sub() {
        return this.num1 - this.num2;
    }
}

public class File2 {
    public static void main(String[] arg) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter 1st number: ");
        int num1 = sc.nextInt();
        System.out.println("Enter 2nd number: ");
        int num2 = sc.nextInt();

        Calculator c = new Calculator(num1, num2);
        int add = c.sum();
        int sub = c.sub();

        System.out.println("Addition: " + add);
        System.out.println("Subtraction: " + sub);

        sc.close();
    }
}
