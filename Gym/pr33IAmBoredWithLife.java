import java.util.*;

public class pr33IAmBoredWithLife {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int a = input.nextInt(), b = input.nextInt();
        int f_a = 1;
        int f_b = 1;
        for (int i = 1; i <= a; i++) {
            f_a *= i;
        }
        for (int i = 1; i <= b; i++) {
            f_b *= i;
        }
        // System.out.println(f_a);
        // System.out.println(f_b);
        int max;
        if (f_a > f_b) {
            max = f_a;
        } else {
            max = f_b;
        }
        int hcf = 1;
        for (int i = 1; i <= max; i++) {
            if (f_a % i == 0 && f_b % i == 0) {
                hcf = i;
            }
        }
        System.out.println(hcf);
    }
}
