import java.util.*;

public class pr117NoX {
    public static String NoX(int currentIndex, String s) {
        // base case
        if (currentIndex == s.length()) {
            return "";
        }
        String ans;
        if (s.charAt(currentIndex) == 'x') {
            return NoX(currentIndex + 1, s);
        } else {
            return s.charAt(currentIndex) + NoX(currentIndex + 1, s);
        }
        // return ans;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s = sc.next();
        // NoX(0, s);
        System.out.println(NoX(0, s));
    }
}
