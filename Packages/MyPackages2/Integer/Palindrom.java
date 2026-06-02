package MyPackages2.Integer;

public class Palindrom {
    public boolean palindrom_ckecker(int num) {
        int temp = num;
        int re, sum = 0;
        while (temp > 0) {
            re = temp % 10;
            sum = (sum * 10) + re;
            temp = temp / 10; 
        }

        return num == sum;
    }
}
