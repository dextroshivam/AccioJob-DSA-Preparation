
/**
 * pr35DaimondPattern
 */
import java.util.*;

public class pr35DaimondPattern {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        // int t = 1;
        int t = sc.nextInt();
        for (int k = 0; k < t; k++) {
            // int n = 7;
            int n = sc.nextInt();
            for (int i = 0; i < n / 2; i++) {
                for (int j = 0; j < n / 2 - i; j++) {
                    System.out.print(" ");
                }
                for (int j = 0; j < 2 * i + 1; j++) {
                    System.out.print("*");
                }
                System.out.println();
            }
            for (int i = 0; i < n; i++) {
                System.out.print("*");
            }
            System.out.println();
            for (int i = 0; i < n / 2; i++) {
                for (int j = 0; j <= i; j++) {
                    System.out.print(" ");
                }
                for (int j = 0; j < 2 * (n / 2 - i) - 1; j++) {
                    System.out.print("*");
                }
                System.out.println();
            }
        }
    }

}