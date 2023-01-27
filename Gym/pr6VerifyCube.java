import java.util.*;
// import java.math.*;

public class pr6VerifyCube {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        long a = sc.nextLong();
        long b = sc.nextLong();
        long lhs = (a + b) * (a + b) * (a + b);
        long rhs = a * a * a + b * b * b + 3 * (a * a) * b + 3 * a * b * b;
        System.out.println(rhs);
        System.out.println(lhs);
        if (rhs == lhs) {
            System.out.println("VERIFIED");
        } else {
            System.out.println("NOT VERIFIED");
        }
    }
}
