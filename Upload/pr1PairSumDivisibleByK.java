import java.util.*;
import java.util.Scanner;

/**
 * pr1PairSumDivisibleByK
 */
public class pr1PairSumDivisibleByK {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int k = sc.nextInt();

        int arr[] = new int[n];
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }
        int count = 0;
        for (int i : arr) {
            for (int j = 0; j < n; j++) {
                if ((arr[j] + i) % k == 0) {
                    count += 1;
                }
            }
        }

        System.out.println(count);

    }
}
// 2, 2, 1, 7, 5, 3
// 5 3 1 2 3 4 5

// Sample Output 4