import java.util.*;
import java.util.Scanner;

public class pr9AlternateMatrix {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int r = sc.nextInt();
        int c = sc.nextInt();
        int arr[][] = new int[r][c];
        for (int i = 0; i < r; i++) {
            for (int j = 0; j < c; j++) {
                arr[i][j] = sc.nextInt();
            }
        }
        for (int a = 0; a < r; a++) {
            if (a % 2 == 0) {
                for (int b = 0; b < c; b++) {
                    System.out.print(arr[a][b] + " ");
                }
                System.out.println();
            } else {
                for (int d = c - 1; d >= 0; d--) {
                    System.out.print(arr[a][d] + " ");
                }
                System.out.println();
            }
        }

    }
}
