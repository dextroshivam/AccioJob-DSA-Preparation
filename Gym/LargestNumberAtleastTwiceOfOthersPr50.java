import java.util.*;

public class LargestNumberAtleastTwiceOfOthersPr50 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int arr[] = new int[n];
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }

        int max = arr[0];
        int index = 0;
        for (int i = 0; i < n; i++) {
            if (arr[i] > max) {
                max = arr[i];
                index = i;
            }
        }
        // System.out.println(max);
        // System.out.println(index);
        boolean flag = false;
        for (int i : arr) {
            if (i != max) {
                if (!(max >= 2 * i)) {
                    flag = false;
                    break;
                } else {
                    flag = true;
                }
            }
        }
        if (flag) {
            System.out.println(index);
        } else {
            System.out.println(-1);
        }

    }
}
