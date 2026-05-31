// let's try append mode with FileWritter

import java.io.FileWriter;

public class Write2 {
    public static void main(String[] args) {
        try {
            FileWriter file = new FileWriter("text1.txt", true);
            file.write("\nok, see this is a totally another line");
            System.out.println("File append done");
            file.close();
        } catch (Exception e) {
            System.out.println("\nFile can't create");
        }
    }    
}
