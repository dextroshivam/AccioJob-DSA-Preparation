import java.util.*;

public class pr119CountABC {
    public static int CountABC(int start, int end, String s) {
        // base case
        if (end >= s.length()) {
            return 0;
        }

        if ((s.substring(start, end + 1).equals("abc") || s.substring(start, end + 1).equals("aba"))) {
            return 1 + CountABC(start + 1, end + 1, s);
        } else {
            return CountABC(start + 1, end + 1, s);
        }
        // recur

    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s = sc.next();
        System.out.println(CountABC(0, 2, s));
    }
}
