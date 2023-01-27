import java.util.*;

public class pr12WaterBill {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int bill = 0;
        if (n <= 100) {
            bill += n * 15;
        } else if (n > 100 && n <= 200) {
            bill += 100 * 15 + (n - 100) * 14;
        } else if (n > 200) {
            bill += 100 * 15 + 100 * 14 + (n - 200) * 12;
        }
        System.out.println(bill);
    }
}
