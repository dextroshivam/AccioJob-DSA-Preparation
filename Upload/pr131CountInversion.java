import java.util.*;

public class pr131CountInversion {
    public static int conquer(int start, int mid, int end, int arr[]) {
        int[] merged = new int[end - start + 1];
        int i = start;
        int j = mid + 1;
        int k = 0;
        int swaps = 0;
        while (i <= mid && j <= end) {
            if (arr[i] <= arr[j]) {
                merged[k++] = arr[i++];
            } else {

                swaps += mid - i + 1;

                merged[k++] = arr[j++];
                // swaps++;

            }
        }
        while (i <= mid) {
            merged[k++] = arr[i++];
            // swaps++;
            // 8 5 3 4 1 6 2

        }
        while (j <= end) {
            merged[k++] = arr[j++];
            // swaps++;

        }
        for (int p = 0; p < merged.length; p++) {
            arr[start + p] = merged[p];
        }
        return swaps;
    }

    public static int divide(int start, int end, int arr[]) {
        int swaps = 0;
        if (start < end) {
            int mid = (start + end) / 2;
            // 8
            // 1 2 3 4 5 6 7 8
            divide(start, mid, arr);
            divide(mid + 1, end, arr);
            swaps += conquer(start, mid, end, arr);
            // return swaps;
        }
        return swaps + 1;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int arr[] = new int[n];
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }
        System.out.println(divide(0, n - 1, arr));
        // for (int i = 0; i < n; i++) {
        // System.out.print(arr[i] + " ");
        // }

    }
}