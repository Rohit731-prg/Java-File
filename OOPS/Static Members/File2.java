public class File2 {
    static {    // static block
        int num = 10;   // num can't use in other block not even in main
        System.out.println("Stack num: " + num);
    }

    public static void main(String[] args) {
        System.out.println(Display_details.sum(50, 30));
    }
}
