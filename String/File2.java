public class File2 {
    public static void main(String[] args) {
        String name = "  Jane Smith  is my name";

        String trimName = name.trim();
        String ReplaceName = trimName.replace(" ", "");
        System.out.println("Original name: " + name);
        System.out.println("Trimmed name: " + trimName);
        System.out.println("Name with spaces removed: " + ReplaceName);
    }
}
