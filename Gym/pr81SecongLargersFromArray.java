import java.util.*;

public class pr81SecongLargersFromArray {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int arr[] = new int[n];
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }
        long max = arr[0];
        long count = 0;
        for (int i : arr) {
            if (i > max) {
                max = i;
            }
        }
        for (int i : arr) {
            if (i == max) {
                count += 1;
            }
        }
        // System.out.println(count);
        long secondmax = arr[0];
        for (int i : arr) {
            if (count == 1) {
                if (i != max && i > secondmax) {
                    secondmax = i;
                }
            } else {
                secondmax = max;
                break;
            }
        }
        System.out.println(secondmax);

    }
}
