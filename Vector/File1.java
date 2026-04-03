import java.util.Vector;

public class File1 {
    public static void main(String[] args) {
        Vector<Integer> numbers = new Vector<>(); // this will only allow Integer objects to be added to the vector
        for (int i = 0; i < 5; i++) {
            numbers.add(i); // adding integers to the vector
        }

        for (Integer number : numbers) {
            System.out.println(number); // printing each number in the vector
        }

        Vector mixed = new Vector<>(); // this vector can hold any type of objects
        mixed.add(1); // adding an integer
        mixed.add("Hello"); // adding a string
        mixed.add(3.14); // adding a double

        for (Object obj : mixed) {
            System.out.println(obj); // printing each object in the mixed vector
        }
    }
}
