public class file1 {
    public static void main(String[] args) {
        int num [] = new int[5];
        for (int i = 0; i < num.length; i++) {
            num[i] = (i + 1) * 10;
        }

        for (int i = 0; i < num.length; i++) {
            System.out.println(num[i]);
        }

        try {
            num[10] = 100; // This will throw ArrayIndexOutOfBoundsException
        } catch (ArrayIndexOutOfBoundsException e) {
            System.out.println("Array index is out of bounds: " + e.getMessage());
        }
    }
}
