import java.util.*;

public class pr17MaximumProductSubarray {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        for (int i = 0; i < t; i++) {
            int n = sc.nextInt();
            int arr[] = new int[n];
            // array creation
            for (int j = 0; j < n; j++) {
                arr[j] = sc.nextInt();
            }
            int maxpro = 1;
            for (int p = 0; p < n; p++) {
                for (int r = p; r < n; r++) {
                    int pro = 1;

                    for (int q = p; q <= r; q++) {
                        pro *= arr[q];
                    }
                    if (pro > maxpro) {
                        maxpro = pro;
                    }
                }

            }
            System.out.println(maxpro);
        }
    }
}
