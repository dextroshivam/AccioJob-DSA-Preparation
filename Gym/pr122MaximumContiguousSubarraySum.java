import java.util.*;

public class pr122MaximumContiguousSubarraySum {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int arr[] = new int[n];
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }
        int maxsum = Integer.MIN_VALUE;
        int cursum = 0;
        for (int i : arr) {
            int o1 = i;
            int o2 = i + cursum;
            cursum = Math.max(o1, o2);
            maxsum = Math.max(maxsum, cursum);
        }
        System.out.println(maxsum);
    }
}
