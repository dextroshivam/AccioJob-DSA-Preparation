
/**
 * pr136CountXInAString
 */
import java.util.*;

public class pr136CountXInAString {
    static int count = 0;

    public static int CountX(String s) {
        int cur = (s.charAt(0) == 'x') ? 1 : 0;
        count += cur;
        CountX(s.substring(1));
        return count;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s = sc.next();
        System.out.println(CountX(s));
    }

}