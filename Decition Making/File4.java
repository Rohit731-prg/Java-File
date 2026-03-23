import java.util.Random;

public class File4 {
    public static void main(String[] arg) {
        Random rd = new Random();

        int num1 = rd.nextInt(10, 99);
        int num2 = rd.nextInt(10, 99);
        int num3 = rd.nextInt(10, 99);

        int smallest = (num1 < num2 && num1 < num3) ? num1 : (num2 < num1 && num2 < num3) ? num2 : num3;

        System.out.print("\n1st number is : " + num1);
        System.out.print("\n2ns number is : " + num2);
        System.out.print("\n3rd number is : " + num3);
        System.out.print("\n\nSmallest number is : " + smallest);
    }
}
