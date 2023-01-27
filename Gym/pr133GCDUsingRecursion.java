import java.util.*;

public class pr133GCDUsingRecursion {
    public static void ans(int a, int b, int min) {
        if (a == 0) {
            return;
        }
        int cur = a;
        if (a % (cur - 1) == 0 && b % (cur - 1) == 0) {
            System.out.println(cur);
            return;
        } else {
            ans(cur - 1, b, b);
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();
        if (a >= b) {
            ans(a, b, b);
        } else {
            ans(a, b, b);
        }
    }
}
