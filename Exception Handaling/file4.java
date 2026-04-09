public class file4 {
    public static void main(String[] args) {
        try {
            String str = "Rohit";
            int num = Integer.parseInt(str); // This will throw NumberFormatException
            System.out.println("Parsed number: " + num);
        } catch (Exception e) {
            System.out.println("An error occurred: " + e.getMessage());
        }
    }
}