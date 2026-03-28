import java.util.Scanner;

class Emp {
    String name;
    int salary;

    Emp (String name, int salary) {
        this.name = name;
        this.salary = salary;
    }
}

class Manager extends Emp {
    int bonas;
    int total_salary;
    Manager(String name, int salary) {
        super(name, salary);
    }

    void calculate_bonas() {
        if (this.salary > 50000) {
            this.total_salary = this.salary + this.salary * 10 / 100;
        } else {
            this.total_salary = this.salary + this.salary * 20 / 100;
        }
    }

    void display() {
        System.out.println("Emp Name: " + this.name);
        System.out.println("Emp Salary: " + this.salary);
        System.out.println("Total Salary: " + this.total_salary);
    }
}

public class File1 {
    public static void main(String[] arg) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter Employee Name: ");
        String name = sc.next();
        System.out.print("\nEnter Employee salary: ");
        int salary = sc.nextInt();

        Manager mg = new Manager(name, salary);
        mg.calculate_bonas();
        mg.display();
        sc.close();
    }
}
