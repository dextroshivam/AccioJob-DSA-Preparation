import java.nio.channels.ScatteringByteChannel;
import java.util.*;

public class pr80DivisibleSumPairs {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        long k = sc.nextLong();
        int arr[] = new int[n];
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }
        long count = 0;
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                if (i < j) {

                    if ((arr[i] + arr[j]) % k == 0) {
                        count += 1;
                    }
                }
                // System.out.println(i + " " + j);
                // // System.out.print(j);
                // System.out.println(arr[i] + arr[j]);
            }
            // System.out.println();
        }
        System.out.println(count);
    }
}
