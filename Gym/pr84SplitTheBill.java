import java.util.*;

public class pr84SplitTheBill {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        long k = sc.nextLong();
        int arr[] = new int[n];
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }
        int bcharged = sc.nextInt();
        // for (int i : arr) {
        // System.out.println(i);
        // }
        long bactual = 0;
        for (int i = 0; i < n; i++) {
            if (i != k) {
                bactual += arr[i];
            }
        }
        // System.out.println(bcharged);
        // System.out.println(bactual);
        if (bcharged == bactual / 2) {
            System.out.println("Bon Appetit");
        } else {
            System.out.println((int) (bcharged - bactual / 2));
        }
        // Arrays.toString(arr);
    }
}
