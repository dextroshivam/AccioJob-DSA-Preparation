import java.util.*;
import java.lang.*;
import java.io.*;

public class Main {
    public static void main(String[] args) throws java.lang.Exception {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        for (int z = 0; z < t; z++) {
            int n = sc.nextInt();
            int arr[] = new int[n];
            for (int i = 0; i < n; i++) {
                arr[i] = sc.nextInt();
            }

            Boolean st = true;
            int fele = arr[0];
            for (int i : arr) {
                if (i >= fele) {
                    fele = i;
                    st = true;
                } else {
                    st = false;
                    break;
                }
            }
            if (st) {
                System.out.println("YES");

            } else {
                System.out.println("NO");
            }

        }
    }
}
// 1
// 4
// 2 4 1 3
// 6
// 1 2 3 4 5 6