// create file with PrintWritter

import java.io.PrintWriter;

public class Write3 {
    public static void main(String[] args) {
        try {
            PrintWriter file = new PrintWriter("text2.txt");
            file.println("Hello rohit...!");
            file.close();
            System.out.println("File created");
        } catch (Exception e) {
            System.out.println("File not created");
        }
    }
}