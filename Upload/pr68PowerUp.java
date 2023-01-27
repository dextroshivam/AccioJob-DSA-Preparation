import java.util.*;
import java.math.*;

public class pr68PowerUp {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        long a = sc.nextLong(), b = sc.nextLong();
        long d = sc.nextInt();
        long pow = 1;
        for (int i = 0; i < b; i++) {
            pow = pow * a;
        }
        System.out.println(pow);
        // System.out.println((long) Math.abs(Math.pow(a, b) % d));
        // System.out.println(Math.abs(pow % d));
    }
}
