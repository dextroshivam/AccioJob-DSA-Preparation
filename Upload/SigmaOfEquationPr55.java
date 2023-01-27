import java.util.*;

public class SigmaOfEquationPr55 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Long n = sc.nextLong();
        long sum = 0;
        for (long i = 1; i <= n; i++) {
            sum += ((i + 1) * (i + 1) - (3 * i + 1) + i);
        }
        System.out.println(sum);
    }
}
