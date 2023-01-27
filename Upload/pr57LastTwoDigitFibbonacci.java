import java.util.*;

public class pr57LastTwoDigitFibbonacci {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        // int n = 5;
        int n = sc.nextInt();
        long x = 0;
        long y = 1;
        long sum = 0;
        for (int i = 0; i < n; i++) {
            // System.out.println(sum);
            x = y;
            y = sum;
            sum = x + y;
        }
        System.out.println(sum);
        // int sumlen = String.valueOf(sum).length();
        // char last = String.valueOf(sum).toCharArray()[sumlen - 1];
        // String res = "";
        // if (sumlen == 1) {
        // res = "0" + String.valueOf(last);
        // } else {
        // char secondlast = String.valueOf(sum).toCharArray()[sumlen - 2];
        // res = String.valueOf(secondlast) + String.valueOf(last);
        // }
        // System.out.println(res);
        if (sum < 10) {
            System.out.println("0" + sum);
        } else {
            System.out.println(String.valueOf(sum).substring(String.valueOf(sum).length() - 2));
        }
    }
}
