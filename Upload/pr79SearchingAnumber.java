import java.util.*;

public class pr79SearchingAnumber {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        long k = sc.nextLong();
        int arr[] = new int[n];
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }
        boolean flag = false;
        long posi = -1;
        for (int i = 0; i < n; i++) {
            if (arr[i] == k) {
                flag = true;
                posi = i + 1;
                break;
            }
        }
        if (flag) {
            System.out.println(posi);
        } else {
            System.out.println(posi);
        }

    }
}