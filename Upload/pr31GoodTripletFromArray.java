import java.util.*;
import java.math.*;

public class pr31GoodTripletFromArray {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int n = input.nextInt();
        int arr[] = new int[n];
        for (int i = 0; i < n; i++) {
            arr[i] = input.nextInt();
        }
        int count = 0;
        int a = input.nextInt(), b = input.nextInt(), c = input.nextInt();
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                for (int k = 0; k < n; k++) {
                    if ((0 <= i && i < j && j < k && k < arr.length) && (Math.abs(arr[i] - arr[j]) <= a)
                            && (Math.abs(arr[j] - arr[k]) <= b) && (Math.abs(arr[i] - arr[k]) <= c)) {
                        count += 1;
                    }
                }
            }
        }
        System.out.println(count);
    }
}
// 0<=K
// i<J
// j<K
