// dynamic array in java

import java.util.ArrayList;
import java.util.Random;

public class File3 {
    public static void main(String[] args) {
        Random rd = new Random();
        ArrayList<Integer> list = new ArrayList<>();

        for (int i = 0; i < 10; i++) {
            list.add(rd.nextInt(100)); // random number between 0 and 99
        }
        System.out.println("ArrayList: " + list);
    }
}
