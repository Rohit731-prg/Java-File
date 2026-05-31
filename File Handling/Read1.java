import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class Read1 {
    public static void main(String[] args) throws IOException {
        try {
            BufferedReader br = new BufferedReader(new FileReader("text1.txt"));
            System.out.println("File exist");
            String line;
            while((line = br.readLine()) != null) {
                System.out.println(line);
            }
            br.close();
        } catch (Exception e) {
            System.out.println("File error");
        }
    }
}
