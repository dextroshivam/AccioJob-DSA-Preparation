import java.util.*;

public class pr116RecursiveDigitSum {
    public static int recurDigitSum(int currentIndex, String string) {
        // base case
        if (currentIndex == string.length() - 1) {
            return Integer.parseInt(String.valueOf(string.charAt(currentIndex)));
        }
        // recursive case
        int sum = Integer.parseInt(String.valueOf(string.charAt(currentIndex)))
                + recurDigitSum(currentIndex + 1, string);
        // int ansk = recurDigitSum(0, String.valueOf(sum));
        // System.out.println(sum);
        if (sum >= 10) {
            sum = recurDigitSum(0, String.valueOf(sum));
        }
        return sum;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s = sc.next();
        int k = sc.nextInt();
        String str = "";
        for (int i = 0; i < k; i++) {
            str += s;
        }
        System.out.println(recurDigitSum(0, str));
    }
}