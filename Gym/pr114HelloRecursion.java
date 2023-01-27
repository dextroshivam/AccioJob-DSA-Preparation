import java.util.*;

public class pr114HelloRecursion {
    public static int recur(int arr[], int currentIndex) {
        if (currentIndex == arr.length) {
            return 0;
        }
        int sum = arr[currentIndex] + recur(arr, currentIndex + 1);

        return sum;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();

        int Case = 1;
        while (t > 0) {

            int n = sc.nextInt();
            int arr[] = new int[n];
            for (int i = 0; i < n; i++) {
                arr[i] = sc.nextInt();
            }
            System.out.println("Case " + Case + ": " + recur(arr, 0));
            Case++;

            t--;
        }

    }
}
