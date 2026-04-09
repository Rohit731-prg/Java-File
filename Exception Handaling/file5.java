// custom exception class
import java.util.Scanner;

class myOwnException extends Exception {
    public myOwnException(String message) {
        super(message);
    }
}

public class file5 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int age;
        System.out.print("Enter your age: ");
        age = sc.nextInt();

        try {
            if (age < 18) {
                throw new myOwnException("Age should be above 18");
            } else if (age > 60) {
                throw new myOwnException("Age should be between 18 and 60");
            } else {
                System.out.println("You are eligible to vote.");
            }
        } catch (Exception e) {
            System.out.println("An error occurred: " + e.getMessage());
        }
        sc.close();
    }
}
