import java.util.*;
import java.math.*;

public class pr74MarcCakeWalk {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int arr[] = new int[n];
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }
        Arrays.sort(arr);
        long sum = 0;
        for (int i = arr.length - 1; i >= 0; i--) {
            sum += (long) Math.pow(2, n - i - 1) * arr[i];
        }
        System.out.println(sum);

    }
}
