import java.util.*;

public class pr113MaximumProductOfThreeElements {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int arr[] = new int[n];
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }

        long max = Long.MIN_VALUE;
        Arrays.sort(arr);
        // for (int i = 1; i < n; i++) {
        // int cur = arr[i];
        // int j = i - 1;
        // while (j >= 0 && arr[j] > cur) {
        // arr[j + 1] = arr[j];
        // j--;
        // }
        // arr[j + 1] = cur;
        // }
        for (long i : arr) {
            max = Math.max(max, i);
        }
        long a1 = arr[n - 1] * arr[n - 2] * arr[n - 3];
        long a2 = arr[0] * arr[1] * arr[n - 1];
        if (a1 >= a2)
            System.out.println(a1);
        else
            System.out.println(a2);
    }
}
// 4 5 2 1