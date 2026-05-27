interface InnerFile2 {
    int sum_method(int num1, int num2);
}

class Sum implements InnerFile2 {
    public int sum_method(int num1, int num2) {
        return num1 + num2;
    }
}

public class File2 {
    public static void main(String[] args) {
        Sum s = new Sum();
        System.out.println(s.sum_method(10, 20));
    }
}
