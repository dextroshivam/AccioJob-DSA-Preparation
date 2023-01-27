import java.util.*;

public class pr65FindTheFactorialRecursively {

    public static long fac(Long n) {
        if (n == 0) {
            return 1;
        }
        return n * fac(n - 1);

    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        long n = sc.nextLong();
        System.out.println(fac(n));
    }
}
