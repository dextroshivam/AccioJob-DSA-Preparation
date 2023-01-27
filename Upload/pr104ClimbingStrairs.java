import java.util.*;

public class pr104ClimbingStrairs {
    public static int solve(int n) {
        if (n == 1 || n == 0) {
            return 1;
        }
        int case1 = solve(n - 1);
        int case2 = solve(n - 2);
        return case1 + case2;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        System.out.println(solve(n));
    }
}
