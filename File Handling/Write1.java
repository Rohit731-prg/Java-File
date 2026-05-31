import java.io.FileNotFoundException;
import java.io.FileWriter;
import java.io.IOException;

public class Write1 {
    public static void main(String[] args) {
        try {
            FileWriter f1 = new FileWriter("text2.txt");

            f1.write("Hey there ! My name is Rohit Singha");
            System.out.println("File creation is complite");
            f1.close();
        } catch (FileNotFoundException e) {
            System.out.println("Could not create file");
        } catch (IOException e) {
            System.out.println("Could not create file");
        }
    }
}
