import java.util.*;

public class pr102SpecialMatrix {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        for (int k = 0; k < t; k++) {

            int rows = sc.nextInt();
            int cols = rows;
            int arr[][] = new int[rows][cols];
            for (int i = 0; i < rows; i++) {
                for (int j = 0; j < cols; j++) {
                    arr[i][j] = sc.nextInt();
                }
            }
            // boolean flag = true;
            for (int i = 0; i < rows; i++) {
                for (int j = 0; j < cols; j++) {
                    if (i == j) {
                        if (arr[i][j] == 0) {
                            System.out.println("false");
                            return;
                        }
                    } else if ((i + j) == rows - 1) {
                        if (arr[i][j] == 0) {
                            System.out.println("false");
                            return;
                        }
                    } else {
                        if (arr[i][j] != 0) {
                            System.out.println("false");
                            return;
                        }
                    }

                }
            }
            System.out.println("true");

        }
    }
}

// 2
// 2
// 2 3
// 4 1
// 3
// 1 0 2
// 0 1 0
// 2 0 1