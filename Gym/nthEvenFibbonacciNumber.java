import java.util.*;

public class nthEvenFibbonacciNumber {
    public static int solution(int n) {

        if (n == 1) {
            return 0;
        }
        if (n == 2) {
            return 2;
        }
        return 4 * solution(n - 1) + solution(n - 2);
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        System.out.println(solution(n));
    }
}
