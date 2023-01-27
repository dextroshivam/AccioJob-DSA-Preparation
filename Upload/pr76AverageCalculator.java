import java.util.*;

public class pr76AverageCalculator {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        // int n = 1;
        int n = sc.nextInt();
        int arr[] = new int[n];

        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }
        long sum = 0;
        for (int i : arr) {
            sum += i;

            // System.out.println(i);
        }
        System.out.println(sum / arr.length);

    }
}
