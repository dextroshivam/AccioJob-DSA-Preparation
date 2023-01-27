import java.util.*;

public class pr42ArmstrongNumber {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        for (int i = 1; i <= 500; i++) {
            int num = i;
            int sum = 0;
            while (num != 0) {
                int unit = num % 10;
                num = num / 10;
                sum += unit * unit * unit;
            }
            if (sum == i) {
                System.out.println(sum);
            }

        }
    }
}
