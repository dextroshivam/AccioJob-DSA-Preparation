import java.util.*;

public class pr58AverageCalc {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int arr[] = new int[n];
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }
        int sum = 0;
        for (int i : arr) {
            sum += i;
        }
        System.out.println(sum / n);
    }
}
