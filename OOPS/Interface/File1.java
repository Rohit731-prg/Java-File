interface Music {
    void play();
}

interface Camera {
    void click();
}

class Mobile implements Music, Camera {
    public void play() {
        System.out.println("Playing music...");
    }

    public void click() {
        System.out.println("Clicking photo...");
    }
}

public class File1 {
    public static void main(String[] args) {
        Mobile mb = new Mobile();
        mb.play();
        mb.click();
    }
}
