import java.util.*;

public class pr110MaxConsecutiveOnes {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int arr[] = new int[n];
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }

        int ans = 0;
        int count = 0;
        for (int i : arr) {
            if (i == 1) {
                count += 1;
                if (count > ans) {
                    ans = count;
                }
            } else {
                count = 0;
            }
        }
        System.out.println(ans);
    }
}
