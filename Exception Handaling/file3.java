public class file3 {
    public static void main(String[] args) {
        String str = null;

        try {
            System.out.println(str.length()); // This will throw NullPointerException
        } catch (NullPointerException e) {
            System.out.println("String is null: " + e.getMessage());
        }
    }
}
