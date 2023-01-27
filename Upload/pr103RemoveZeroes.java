import java.util.*;

// import org.w3c.dom.css.Counter;

public class pr103RemoveZeroes {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        for (int k = 0; k < t; k++) {
            String str = sc.next();
            int first = 0;
            for (int i = 0; i < str.length(); i++) {
                if (str.toCharArray()[i] == '1') {
                    first = i;
                    break;
                }
            }
            int last = 0;
            for (int i = str.length() - 1; i >= 0; i--) {
                if (str.toCharArray()[i] == '1') {
                    last = i;
                    break;
                }
            }
            // System.out.println(first);
            // System.out.println(last);
            if (first < last) {

                char arr[] = str.toCharArray();
                int count = 0;
                for (int i = first; i <= last; i++) {
                    if (arr[i] == '0') {
                        count += 1;
                    }
                }
                System.out.println(count);
            } else {
                System.out.println(0);
            }
        }
    }
}
