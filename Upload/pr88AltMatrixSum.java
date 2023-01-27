import java.util.*;

public class pr88AltMatrixSum {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int arr[][] = new int[n][n];
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                arr[i][j] = sc.nextInt();
            }
        }
        int bsum = 0;
        int wsum = 0;
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                if ((i + j) % 2 == 0) {
                    bsum += arr[i][j];
                } else {
                    wsum += arr[i][j];
                }
            }
        }
        System.out.println(bsum);
        System.out.println(wsum);
    }
}

// pr88AltMatrixSum