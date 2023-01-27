import java.util.*;

public class pr43FindElement {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt(), k = sc.nextInt();
        int arr[] = new int[n];
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }
        boolean flag = false;
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == k) {
                flag = true;
                break;
            }
        }
        if (flag) {
            for (int i = 0; i < arr.length; i++) {
                if (arr[i] == k) {
                    System.out.print(i + " ");
                }
            }
        } else {
            System.out.println("NOT FOUND");
        }
    }
}
