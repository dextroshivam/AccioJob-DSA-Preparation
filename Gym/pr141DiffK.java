
import java.util.*;
import java.lang.*;
import java.io.*;

class Solution {
    public static int diffPossible(int[] arr, int target) {

        int i = 0;
        int j = i + 1;
        while (j < arr.length) {
            if (arr[j] - arr[i] == target) {
                return 1;
            } else if (arr[j] - arr[i] > target) {
                i++;
            } else {
                j++;
            }
        }
        return 0;
    }
}

public class pr141DiffK {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] A = new int[n];
        for (int i = 0; i < n; i++)
            A[i] = sc.nextInt();
        int k = sc.nextInt();
        Solution Obj = new Solution();
        System.out.println(Obj.diffPossible(A, k));
    }
}