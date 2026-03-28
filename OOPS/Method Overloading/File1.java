class Addition {
    int add(int num1, int num2) {
        return num1 + num2;
    }

    int add(int num1, int num2, int num3) {
        return num1 + num2 + num3;
    }
}

public class File1 {
    public static void main(String[] arg) {
        Addition a = new Addition();

        int add1 = a.add(15, 45);
        System.out.println("Result from 1st methos: " + add1);

        int add2 = a.add(15, 45, 45);
        System.out.println("Result from 1st methos: " + add2);
    }
}
