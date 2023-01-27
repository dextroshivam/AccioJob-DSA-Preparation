import java.util.*;

public class pr15SumAndProductOfMaxAndMinOfArray {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        for (int j = 0; j < n; j++) {
            int k = sc.nextInt();
            // int k = sc.nextInt();
            int arr[] = new int[k];
            for (int i = 0; i < k; i++) {
                arr[i] = sc.nextInt();
            }
            int min = arr[0];
            int max = arr[0];
            for (int i : arr) {
                if (i < min) {
                    min = i;
                }
                if (i > max) {
                    max = i;
                }
            }
            System.out.print(min + max + " ");
            System.out.print(min * max);
        }
    }
}
