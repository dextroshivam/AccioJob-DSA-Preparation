import java.util.*;

public class quickSort {
    public static int partition(int start, int end, int arr[]) {
        int pivot = arr[end];
        int i = start;
        int j = start;
        while (j <= end - 1) {
            if (arr[j] < pivot) {
                int temp = arr[j];
                arr[j] = arr[i];
                arr[i] = temp;
                i++;
                j++;
            } else {
                j++;
            }
        }
        // for (int j = start; j <= end - 1; j++) {
        // if (arr[j] < pivot) {
        // int temp = arr[i];
        // arr[i] = arr[j];
        // arr[j] = temp;
        // i++;
        // }
        // }
        int tem = arr[i];
        arr[i] = arr[end];
        arr[end] = tem;
        return i;
        // return 0;/
    }

    public static void quicksort(int start, int end, int arr[]) {
        if (start >= end) {
            return;
        }
        int indexOfpivot = partition(start, end, arr);
        quicksort(start, indexOfpivot - 1, arr);
        // quicksort(indexOfpivot + 1, end, arr);
    }

    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int arr[] = new int[n];
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }
        quicksort(0, n - 1, arr);
        for (int i = 0; i < n; i++) {
            System.out.print(arr[i] + " ");
        }
    }
}
