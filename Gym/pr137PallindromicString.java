import java.util.*;

public class pr137PallindromicString {

    public static int pdString(String s, int start, int end) {
        if (start < end) {
            if (s.charAt(start) == s.charAt(end)) {
                start++;
                end--;
                pdString(s, start, end);
            } else {
                return 0;
            }
        }
        return 1;
    }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        String s = sc.nextLine();
        String a = "";
        for (int i = 0; i < s.length(); i++) {
            if ((s.charAt(i) >= 'a' && s.charAt(i) <= 'z') || (s.charAt(i) >= 'A' && s.charAt(i) <= 'Z')
                    || (s.charAt(i) >= '0' && s.charAt(i) <= '9')) {
                a += s.charAt(i);
            }
        }
        // System.out.println(s.charAt(0) == s.charAt(1));
        System.out.println(pdString(s, 0, s.length() - 1));
    }
}
