
/**
 * pr22CheckIfArrayIsIncreasing
 */
import java.util.*;

public class pr22CheckIfArrayIsIncreasing {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        for (int z = 0; z < t; z++) {
            int n = sc.nextInt();
            int arr[] = new int[n];
            for (int i = 0; i < n; i++) {
                arr[i] = sc.nextInt();
            }

            Boolean st = true;
            for (int i = 0; i < n - 1; i++) {
                if (arr[i] < arr[i + 1]) {
                    st = true;
                } else {
                    st = false;
                    break;

                }
            }
            if (st) {
                System.out.println("YES");

            } else {
                System.out.println("NO");
            }

        }

    }

}