import java.util.*;

public class printArrayRecursively {
    public static void ans(int arr[], int size) {
        if (size == 0) {
            System.out.println(arr[size]);
            return;
        }
        ans(arr, size - 1);
        System.out.println(arr[size]);
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int arr[] = new int[n];
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }
        ans(arr, n - 1);
    }
}
