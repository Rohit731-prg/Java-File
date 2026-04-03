class Cal implements ExternalInterface {
    public void display(double num) {
        double area = pi * num * num;
        System.out.println("Area of circle with radius " + num + " is: " + area);
    }
}

public class Area {
    public static void main(String[] args) {
        double radious = 5.0;
        Cal c = new Cal();
        c.display(radious);
    }
}
