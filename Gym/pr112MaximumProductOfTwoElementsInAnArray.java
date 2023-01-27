import java.util.*;

public class pr112MaximumProductOfTwoElementsInAnArray {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int arr[] = new int[n];
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }
        // // first approach -- wrong because maximum could be a negetive

        // long max = Long.MIN_VALUE;
        // long smax = Long.MIN_VALUE;

        // for (int i : arr) {
        // if (i >= max) {
        // smax = max;
        // max = i;
        // }
        // }
        // // System.out.println((max - 1) * (smax - 1));
        // System.out.println(max);
        // System.out.println(smax);

        // second approach
        int max = Integer.MIN_VALUE;
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                if (i != j) {

                    int sum = (arr[i] - 1) * (arr[j] - 1);
                    if (sum > max) {
                        max = sum;
                    }
                }
            }
        }
        // System.out.println(max);
    }
}
