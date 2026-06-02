import MyPackages2.Integer.Palindrom;
import MyPackages2.String.Palindrom_str;

public class File2 {
    public static void main(String[] args) {
        String str = "Madamk";
        int num = 12321;

        Palindrom_str palindromStrChecker = new Palindrom_str();
        Palindrom palindromIntChecker = new Palindrom();

        System.out.println(str + " is a " + (palindromStrChecker.palindrom_ckecker(str) ? "palindrome" : "not a palindrome"));
        System.out.println(num + " is a " + (palindromIntChecker.palindrom_ckecker(num) ? "palindrome" : "not a palindrome"));
    }
}
