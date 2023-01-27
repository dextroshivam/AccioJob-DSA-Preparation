
/**
 * pr100CalculateTheBill
 */
import java.util.*;

public class pr100CalculateTheBill {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        if (n <= 100) {
            System.out.println(n * 10);
        } else if (n > 100 && n <= 200) {
            System.out.println(100 * 10 + (n - 100) * 15);
        } else if (n > 200 && n <= 300) {
            System.out.println(100 * 10 + 100 * 15 + (n - 200) * 20);
        } else if (n > 300) {
            System.out.println(100 * 10 + 100 * 15 + 100 * 20 + (n - 300) * 25);
        }

    }

}
// 1 to 100 units – Rs. 10/unit 100 to 200 units – Rs. 15/unit 200 to 300 units
// – Rs. 20/unit above 300 units – Rs. 25/unit