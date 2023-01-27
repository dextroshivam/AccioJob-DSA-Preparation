import java.util.*;

public class pr108LongestPalindromicSubstring {
    public static boolean isSubString(String str) {
        if (str.length() < 2) {
            return true;
        }
        String rev = "";
        for (int i = str.length() - 1; i >= 0; i--) {
            rev += str.charAt(i);
        }
        if (rev.equals(str))
            return true;
        else
            return false;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        for (int k = 0; k < t; k++) {

            String str = sc.next();
            int maxlen = Integer.MIN_VALUE;
            String maxstr = "";
            for (int i = 0; i <= str.length(); i++) {
                for (int j = i + 1; j <= str.length(); j++) {
                    String cursubString = str.substring(i, j);
                    if (isSubString(cursubString)) {
                        int len = cursubString.length();
                        if (len > maxlen) {
                            maxlen = len;
                            maxstr = cursubString;
                        }
                    }
                }
            }
            System.out.println(maxstr);
        }
    }
}
// abccbc
