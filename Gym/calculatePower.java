
/**
 * calculatePower
 */
import java.util.*;

public class calculatePower {
    public static int ans(int a, int b) {
        if (b == 0) {
            return 1;
        }

        int ans = ans(a, b - 1) * a;
        return ans;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt(), b = sc.nextInt();
        System.out.println(ans(a, b));
    }

}