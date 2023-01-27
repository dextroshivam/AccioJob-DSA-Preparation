import java.util.*;

public class pr128FirstComeFirstServe {
    public static int Count(int arr[], int k) {
        int count = 0;
        for (int i : arr) {
            if (i == k) {
                count += 1;
            }
        }
        return count;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int k = sc.nextInt();
        int arr[] = new int[n];
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }
        int id = 0;
        for (int i : arr) {
            if (Count(arr, i) == k) {
                id = i;
                // System.out.println(i);
                break;
            }
        }
        if (id == 0) {
            System.out.println(-1);
        } else {
            System.out.println(id);
        }
    }
}
