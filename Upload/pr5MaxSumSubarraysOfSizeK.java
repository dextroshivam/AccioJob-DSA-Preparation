
/**
 * pr5MaxSumSubarraysOfSizeK
 */
import java.util.*;

public class pr5MaxSumSubarraysOfSizeK {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int k = sc.nextInt();

        int arr[] = new int[n];
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }

        int sum = 0, i;
        for (i = 0; i < k; i++) {
            sum += arr[i];

        }
        int maxsum = sum;
        int start = 0;
        for (int j = i; j < arr.length; j++) {
            sum += arr[j] - arr[start++];
            if (maxsum < sum) {
                maxsum = sum;
            }
        }
        System.out.println(maxsum);
    }
}
// -2,1,-3,4,-1,2,1,-5,4