class Data{
    private int value;

    public Data(int value) {
        this.value = value;
    }

    int getValue() {
        return value;
    }
}

class Access extends Data {
    Access(int value) {
        super(value);
    }

    void display() {
        System.out.println("Value: " + this.getValue());
    }
}

public class File1 {
    public static void main(String[] args) {
        Access access = new Access(50);
        access.display();
    }
}