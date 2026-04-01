// multilevel inheritance

import java.util.Scanner;

class Order {
    double amount;
    Order(double amount) {
        this.amount = amount;
    }
}

class OnlineOrder extends Order {
    double delevary_charge;
    OnlineOrder(double amount) {
        super(amount);
        this.delevary_charge = 0;
    }

    void add_delevary_charge() {
        if (this.amount > 500) {
            this.delevary_charge = this.amount * 5 / 100;
        } else {
            this.delevary_charge = 50;
        }
    }
}

class ExpressOrder extends OnlineOrder {
    ExpressOrder(double amount) {
        super(amount);
    }

    double total_amout() {
        add_delevary_charge();
        return this.amount + this.delevary_charge + 100;
    }
}

public class File2 {
    public static void main(String[] arg) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter Amout: ");
        double amout = sc.nextDouble();
        
        ExpressOrder ex = new ExpressOrder(amout);
        double total_amount = ex.total_amout();

        System.out.println("\nTotal amount : " + total_amount);

        sc.close();
    }
}
