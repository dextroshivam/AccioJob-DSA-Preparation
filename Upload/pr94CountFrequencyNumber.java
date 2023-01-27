import java.util.*;

public class pr94CountFrequencyNumber {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt(), d = sc.nextInt();
        int count = 0;
        while (n > 0) {
            int unit = n % 10;
            n = n / 10;
            if (unit == d) {
                count += 1;
            }
        }
        System.out.println(count);

    }
}
