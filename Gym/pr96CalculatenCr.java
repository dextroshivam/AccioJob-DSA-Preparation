import java.util.*;

public class pr96CalculatenCr {
    public static long fact(int n) {
        long fac = 1;
        for (int i = 1; i <= n; i++) {
            fac *= i;
        }
        return fac;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt(), r = sc.nextInt();

        long res = fact(n) / (fact(r) * fact(n - r));
        System.out.println(res);
    }
}
