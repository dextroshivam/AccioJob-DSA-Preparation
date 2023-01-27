import java.util.*;
import java.util.HashMap;

public class pr3ContainsDuplicate {
    public static boolean st = false;

    public static void main(String[] args) {
        HashSet<Integer> hs = new HashSet<>();
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int arr[] = new int[n];
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }
        for (int i : arr) {
            if (!hs.add(i)) {
                st = true;
                System.out.println("true");
                break;

            }
        }
        if (st == false) {
            System.out.println("false");

        }
    }
}
