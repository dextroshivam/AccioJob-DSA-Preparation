import java.util.*;

public class factorialRecursively {
    public static int fac(int n) {
        if (n == 0)
            return 1;
        int f = fac(n - 1) * n;
        return f;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        System.out.println(fac(n));
    }
}
