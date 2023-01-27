// import java.util.*;

// public class pr130ImplementingMergeSort {
// public static void merge(int start, int mid, int end, int arr[]) {
// ArrayList<Integer> A = new ArrayList<>();
// ArrayList<Integer> B = new ArrayList<>();
// for (int i = start; i <= mid; i++) {
// A.add(arr[i]);
// }
// for (int i = mid + 1; i <= end; i++) {
// B.add(arr[i]);
// }
// ArrayList<Integer> c = new ArrayList<>();
// int i = 0, j = 0;
// while (i < A.size() && j < B.size()) {
// if (A.get(i) <= B.get(j)) {
// c.add(A.get(i));
// i++;
// } else {
// c.add(B.get(j));
// j++;
// }
// }
// while (i < A.size()) {
// c.add(A.get(i));
// i++;
// }
// while (j < B.size()) {
// c.add(B.get(j));
// j++;
// }
// // int v = start;
// for (int p = 0; p < c.size(); p++) {
// arr[start + p] = c.get(p);
// // v++;
// }
// }

// public static void mergeSort(int start, int end, int arr[]) {
// if (start == end) {
// return;
// }
// int mid = (start + end) / 2;
// mergeSort(start, mid, arr);
// mergeSort(mid + 1, end, arr);
// merge(start, mid, end, arr);
// }

// public static void main(String[] args) {
// Scanner sc = new Scanner(System.in);
// int n = sc.nextInt();
// int arr[] = new int[n];
// for (int i = 0; i < n; i++) {
// arr[i] = sc.nextInt();
// }
// mergeSort(0, arr.length - 1, arr);
// for (int i = 0; i < n; i++) {
// System.out.print(arr[i] + " ");
// }

// }
// }

/**
 * pr130ImplementingMergeSort
 */
import java.util.*;

public class pr130ImplementingMergeSort {
    public static void conquer(int start, int mid, int end, int arr[]) {
        int[] merged = new int[end - start + 1];
        int i = start;
        int j = mid + 1;
        int k = 0;
        while (i <= mid && j <= end) {
            if (arr[i] <= arr[j]) {
                merged[k++] = arr[i++];
            } else {
                merged[k++] = arr[j++];
            }
        }
        while (i <= mid) {
            merged[k++] = arr[i++];
        }
        while (j <= end) {
            merged[k++] = arr[j++];
        }
        for (int p = 0; p < merged.length; p++) {
            arr[start + p] = merged[p];
        }
    }

    public static void divide(int start, int end, int arr[]) {
        if (start < end) {

            int mid = (start + end) / 2;
            // 8
            // 1 2 3 4 5 6 7 8
            divide(start, mid, arr);
            divide(mid + 1, end, arr);
            conquer(start, mid, end, arr);
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int arr[] = new int[n];
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }
        divide(0, n - 1, arr);
        for (int i = 0; i < n; i++) {
            System.out.print(arr[i] + " ");
        }

    }
}