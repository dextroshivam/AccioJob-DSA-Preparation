import java.util.*;

public class pr82SortedInsertPosition {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        long k = sc.nextLong();
        int arr[] = new int[n];
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }
        boolean flag = false;
        for (int i = 0; i < n; i++) {
            if (arr[i] == k) {
                flag = true;
                System.out.println(i);
                break;
            }
        }
        if (!flag) {
            // System.out.println("done");
            if (k > arr[n - 1]) {
                System.out.println(n);
            } else {

                for (int i = 0; i < n; i++) {
                    if (arr[i] > k) {
                        System.out.println(i);
                        break;
                    }
                }
            }
        }
    }
}
