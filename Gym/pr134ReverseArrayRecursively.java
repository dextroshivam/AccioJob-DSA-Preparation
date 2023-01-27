import java.util.*;

public class pr134ReverseArrayRecursively {
    public static void revArray(int arr[], int idx) {

    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int arr[] = new int[n];
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }
        revArray(arr, n - 1);
    }
}
