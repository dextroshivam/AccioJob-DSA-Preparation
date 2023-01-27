import java.util.*;

public class pr63GCDOfMaximumAndMinimum {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int arr[] = new int[n];
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }
        int min = arr[0];
        long max = arr[0];
        for (int i : arr) {
            if (i > max) {
                max = i;
            }
            if (i < min) {
                min = i;
            }
        }
        int res = 1;
        for (int i = 1; i < min + 1; i++) {
            if (min % i == 0 && max % i == 0) {
                res = i;
            }
        }
        System.out.println((long) res);

    }
}
