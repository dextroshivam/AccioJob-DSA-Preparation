import java.util.*;

public class pr77SumOfArrayExceptSelt {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int arr[] = new int[n];
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }
        int res[] = new int[n];
        // int cur = 0;
        for (int i = 0; i < n; i++) {
            int sum = 0;
            for (int j = 0; j < n; j++) {
                if (j != i) {
                    sum += arr[j];
                }
            }
            res[i] = sum;
            sum = 0;
        }
        for (int i : res) {
            System.out.print(i + " ");
        }
    }
}
