import java.util.*;

public class SubstringOfStringPr48 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        // String s = "abc";
        String s = sc.nextLine();

        for (int i = 0; i < s.length(); i++) {
            // String cur = "";
            for (int j = i + 1; j <= s.length(); j++) {
                System.out.println(s.substring(i, j));
            }

        }
    }
}
