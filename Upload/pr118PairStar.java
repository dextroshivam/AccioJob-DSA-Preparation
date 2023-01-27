import java.util.*;

public class pr118PairStar {

    public static String PairStar(int currentIndex, String s) {
        if (s.charAt(currentIndex) == ' ') {
            return "";
        }

        if (s.charAt(currentIndex) == s.charAt(currentIndex + 1)) {
            return String.valueOf(s.charAt(currentIndex)) + '*' + PairStar(currentIndex + 1, s);
        } else {
            return String.valueOf(s.charAt(currentIndex)) + PairStar(currentIndex + 1, s);
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s = sc.next();
        // PairStar(0, s);
        System.out.println(PairStar(0, s + ' '));
    }
}
