import java.util.*;

public class pr107MinimumWordLength {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String str = sc.nextLine();
        str = str + " ";
        int i = 0;
        int j = 0;
        int minlen = Integer.MAX_VALUE;
        String minstr = "";
        while (j < str.length()) {
            if (str.charAt(j) == ' ') {
                int len = j - i;
                if (len < minlen) {
                    minlen = len;
                    minstr = str.substring(i, j);
                    // System.out.println(minstr);
                }
                i = j + 1;
                j++;
            }
            j++;
        }
        System.out.println(minstr);
    }
}
// shivam will be as good as kusum