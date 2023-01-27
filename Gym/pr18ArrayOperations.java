import java.util.*;

public class pr18ArrayOperations {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int arr[] = new int[n];
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }
        int sum = 0;
        int max = arr[0];
        for (int i : arr) {
            sum += i;
            if (i > max) {
                max = i;
            }

        }
        System.out.print(sum + " ");
        System.out.print((sum / n) + " ");
        System.out.println(max);

    }
}
