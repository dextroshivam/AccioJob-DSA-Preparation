import java.util.*;

public class pr64SumOfDigits {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int sum = 0;
        while (n != 0) {
            int unit = n % 10;
            n = n / 10;
            sum += unit;
        }
        System.out.println(sum);
    }
}
