import java.awt.Frame;

public class Frame1 {
    public static void main(String[] args) {
        Frame f = new Frame("This is programm for frame applet");

        f.setSize(400, 300); // set the window size
        f.setLocation(200, 100); // set window possition in screen
        f.setVisible(true); // without this window is exist in memory, not gives output..
    }
}