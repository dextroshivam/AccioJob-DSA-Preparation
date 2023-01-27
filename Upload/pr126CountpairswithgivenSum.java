import java.util.*;

public class pr126CountpairswithgivenSum {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int arr[] = new int[n];
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }
        int target = sc.nextInt();
        int count = 0;
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                if (arr[i] + arr[j] == target) {
                    count += 1;

                }
            }
        }
        System.out.println(count / 2);
    }
}
// 4 9
// 2 7 5 11
// pr126CountpairswithgivenSum