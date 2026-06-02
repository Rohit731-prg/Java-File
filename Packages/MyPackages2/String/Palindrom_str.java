package MyPackages2.String;

public class Palindrom_str {
    public boolean palindrom_ckecker(String str) {
        if (str == null) return false;

        String updated_string = str.toLowerCase();
        int left = 0;
        int right = updated_string.length() - 1;

        while (left < right) {
            if (updated_string.charAt(left) != updated_string.charAt(right)) {
                return false;
            }
            left++;
            right--;
        }

        return true;
    }
}
