
/**
 * pr32HCFOfTwoNumbers
 */
import java.util.*;

public class pr32HCFOfTwoNumbers {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int a = input.nextInt(), b = input.nextInt();
        int max = 0;
        if (a > b) {
            max = a;
        } else {
            max = b;
        }
        int hcf = 1;
        for (int i = 1; i <= max; i++) {
            if (a % i == 0 && b % i == 0) {
                hcf = i;
            }
        }
        System.out.println(hcf);

    }

}