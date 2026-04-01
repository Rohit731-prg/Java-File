import java.util.Scanner;

class Shape {
    int shape;
    Shape (int shape) {
        this.shape = shape;
    }
}

class Circle extends Shape {
    Circle(int shape) {
        super(shape);
    }

    double Area() {
        return (this.shape * this.shape) * 3.14; 
    }
}

class Square extends Shape {
    Square(int shape) {
        super(shape);
    }

    double Area() {
        return this.shape * this.shape;
    }
}

class Cube extends Shape {
    Cube(int shape) {
        super(shape);
    }

    double Area() {
        return this.shape * this.shape * this.shape;
    }
}

public class File3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter the shape: ");
        int shape = sc.nextInt();
        Circle c = new Circle(shape);
        double ar = c.Area();
        System.out.println("Circle Area: " + ar);

        Square sq = new Square(shape);
        ar = sq.Area();
        System.out.println("Square Area: " + ar);

        Cube cb = new Cube(shape);
        ar = cb.Area();
        System.out.println("Cube Area: " + ar);

        sc.close();
    }    
}
