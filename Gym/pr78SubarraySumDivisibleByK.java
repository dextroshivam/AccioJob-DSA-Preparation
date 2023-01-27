import java.util.*;

public class pr78SubarraySumDivisibleByK {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt(), k = sc.nextInt();
        int arr[] = new int[n];
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }
        // for (int i : arr) {
        // System.out.println(i);
        // }
        long count = 0;
        long sum = 0;
        for (int i = 0; i < n; i++) {
            // System.out.print("i = " + i);
            for (int j = i; j < n; j++) {
                // System.out.print("j = " + j);
                sum = 0;
                for (int l = i; l <= j; l++) {
                    // System.out.print("k = " + k);
                    // System.out.print(arr[l] + " ");
                    sum += arr[l];
                }
                // System.out.println();
                // System.out.println(sum);
                if (sum % k == 0) {
                    count += 1;
                }
                // sum = 0;
                // System.out.println();
            }
        }
        System.out.println((long) count);
    }
}
