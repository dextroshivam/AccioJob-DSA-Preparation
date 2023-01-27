import java.util.*;
import java.util.Scanner;
import java.util.Arrays;
// import java.math.*;

public class pr2SortingProblem3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int arr[] = new int[n];
        for (int i = 0; i < n; i++) {
            int ele = sc.nextInt();
            ele = ele * ele;
            arr[i] = ele;
            // arr[i] = Math.pow((arr[i]), 2);
        }

        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n - 1; j++) {
                if (arr[j] > arr[j + 1]) {
                    int temp = arr[j];
                    arr[j] = arr[j + 1];
                    arr[j + 1] = temp;
                }
            }
        }

        for (int i : arr) {
            System.out.print(i + " ");
        }
        // System.out.println(Arrays.toString(arr));
    }

}
