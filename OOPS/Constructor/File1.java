class Sum {
    int num1, num2, num3;
    Sum() {
        this.num1 = 100;
        this.num2 = 200;
    }

    Sum(int num1, int num2) {
        this.num1 = num1;
        this.num2 = num2;
    }

    void Result() {
        this.num3 = this.num1 + this.num2;
        System.out.println("Addition : " + this.num3);
    }
}

public class File1 {
    public static void main(String[] args) {
        Sum s = new Sum();
        Sum s2 = new Sum(50, 70);

        s.Result();
        s2.Result();
    }
}