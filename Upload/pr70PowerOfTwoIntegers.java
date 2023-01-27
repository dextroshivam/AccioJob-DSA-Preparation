import java.util.*;

public class pr70PowerOfTwoIntegers {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        // long n = 25;
        int n = sc.nextInt();
        if (n == 0) {
            System.out.println(1);
            return;
        } else if (n == 1) {
            System.out.println(1);
            return;
        } else if (n == 2) {
            System.out.println(0);
            return;
        }
        long pow = 1;
        boolean flag = false;
        for (long i = 2; i < n; i++) {
            while (!(pow > n)) {
                // System.out.println(i);
                pow = pow * i;
                // System.out.println("d2");
                if (pow == n) {
                    flag = true;
                    System.out.println(1);
                    break;
                }
            }
            pow = 1;
        }
        if (!flag) {
            // System.out.println("d1");
            System.out.println(0);
        }
        // System.out.println(pow);/
    }
}
