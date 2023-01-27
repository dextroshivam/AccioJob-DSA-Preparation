import java.lang.reflect.Array;
import java.util.*;

public class pr125SecongLargest {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int arr[] = new int[n];
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }
        // if (n == 1) {
        // System.out.println(-1);
        // return;
        // }
        // int largest = arr[0];
        // int SecondLargest = arr[0];
        // // boolean flag = true;
        // for (int i = 0; i < n; i++) {
        // if (arr[i] > largest) {
        // SecondLargest = largest;
        // largest = arr[i];
        // }
        // // SecondLargest = Math.max(SecondLargest, largest);
        // // largest = Math.max(largest, arr[i]);
        // }
        // if (SecondLargest == largest) {
        // System.out.println(-1);
        // } else {
        // System.out.println(SecondLargest);
        // }
        if (n == 1) {
            System.out.println(-1);
            return;
        }
        Arrays.sort(arr);
        boolean flag = true;
        for (int i = 1; i < n; i++) {
            if (arr[i] != arr[i - 1]) {
                flag = false;
                break;
            }
        }
        if (flag) {
            System.out.println(-1);
        } else {
            System.out.println(arr[arr.length - 2]);
        }
    }
}
