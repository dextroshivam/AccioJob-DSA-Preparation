import java.util.*;

public class pr120Array11 {
    public static int Array11(int currentIndex, int arr[]) {
        if (currentIndex == arr.length) {
            return 0;
        }

        if (arr[currentIndex] == 11) {
            return 1 + Array11(currentIndex + 1, arr);
        } else {
            return Array11(currentIndex + 1, arr);
        }

    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int arr[] = new int[n];
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }
        System.out.println(Array11(0, arr));
    }
}
