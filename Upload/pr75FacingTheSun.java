import java.lang.reflect.Field;
import java.util.*;

public class pr75FacingTheSun {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int arr[] = new int[n];
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }
        // long first_ele = arr[0];
        long count = 0;
        long max = arr[0];
        for (int i : arr) {
            if (i >= max) {
                count += 1;
                max = i;
            }
        }
        System.out.println(count);

    }

}
