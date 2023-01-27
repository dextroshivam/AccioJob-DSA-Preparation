import java.util.*;

public class pr69PowerOfThree {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        // long n = ;
        long n = sc.nextLong();
        if (n == 0) {
            System.out.println("no");
            return;
        }
        long pow = 1;
        for (long i = 1; i < n; i++) {
            pow = pow * 3;
            if (pow == n) {
                System.out.println("yes");
                break;
            } else if (pow > n) {
                System.out.println("no");
                break;
            }
        }
        // System.out.println(pow);
    }
}
