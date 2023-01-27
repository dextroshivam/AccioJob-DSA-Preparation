// import java.util.*;

// public class pr101SpirallyTraversingAMatrix {
//     public static void main(String[] args) {
//         Scanner sc = new Scanner(System.in);
//         int rows = sc.nextInt();
//         int cols = sc.nextInt();
//         int arr[][] = new int[rows][cols];
//         for (int i = 0; i < rows; i++) {
//             for (int j = 0; j < cols; j++) {
//                 arr[i][j] = sc.nextInt();
//             }
//         }
//         if (rows == 1 && cols == 1) {
//             System.out.println(arr[0][0]);
//             return;
//         }
//         int starta = 0;
//         int enda = cols - 1;
//         // System.out.println(enda);
//         // ------
//         int startb = 0;
//         int endb = rows - 1;
//         // ------
//         int startc = cols - 1;
//         int endc = 0;
//         // ------
//         int startd = rows - 1;
//         int endd = 0;
//         // -------------
//         int a = 0;
//         int b = cols - 1;
//         int c = rows - 1;
//         int d = 0;
//         // ---------
//         while (a <= c && d <= b) {
//             // System.out.println("done1");
//             for (int i = starta; i < enda; i++) {
//                 System.out.print(arr[a][i] + " ");
//                 // System.out.println("done1 " + a + " " + i);
//             }
//             starta++;
//             enda--;
//             a++;
//             for (int i = startb; i < endb; i++) {
//                 System.out.print(arr[i][b] + " ");
//             }
//             startb++;
//             endb--;
//             b--;
//             if (a <= c) {
//                 System.out.println("Done 1 ");
//                 for (int i = startc; i > endc; i--) {
//                     System.out.print(arr[c][i] + " ");
//                 }
//             }
//             startc--;
//             endc++;
//             c--;
//             if (d <= b) {

//                 for (int i = startd; i > endd; i--) {
//                     System.out.print(arr[i][d] + " ");
//                 }
//             }
//             startd--;
//             endd++;
//             d++;
//         }
//     }
// }

// 4 4
// 1 2 3 4
// 5 6 7 8
// 9 10 11 12
// 13 14 15 16

// // 4 3
// // 1 2 3
// // 4 5 6
// // 7 8 9
// // 10 11 12

import java.util.*;

/**
 * pr101SpirallyTraversingAMatrix
 */
public class pr101SpirallyTraversingAMatrix {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int rows = sc.nextInt();
        int cols = sc.nextInt();
        int arr[][] = new int[rows][cols];
        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < cols; j++) {
                arr[i][j] = sc.nextInt();
            }
        }

        int left = 0, right = cols - 1;
        int top = 0, bottom = rows - 1;

        while (left <= right && top <= bottom) {
            for (int i = left; i <= right; i++) {
                System.out.print(arr[top][i] + " ");
            }
            top++;
            for (int i = top; i <= bottom; i++) {
                System.out.print(arr[i][right] + " ");
            }
            right--;
            if (top <= bottom)
                for (int i = right; i >= left; i--) {
                    System.out.print(arr[bottom][i] + " ");
                }
            bottom--;
            if (left <= right)
                for (int i = bottom; i >= top; i--) {
                    System.out.print(arr[i][left] + " ");
                }
            left++;
        }
    }
}
