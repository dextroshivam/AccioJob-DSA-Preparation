import java.util.*;

public class pr16SortTheHalfSorted {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int size = sc.nextInt();
        int halfsize = 0;
        int arr[] = new int[size];
        for (int i = 0; i < size; i++) {
            arr[i] = sc.nextInt();
        }
        int i = 0;
        for (int s = 0; s < size - 1; s++) {
            if (arr[s] > arr[s + 1]) {
                halfsize = s + 1;
            }
        }
        int j = halfsize;
        int res[] = new int[size];
        int k = 0;
        while ((i <= halfsize - 1) && (j <= size - 1)) {
            if (arr[i] >= arr[j]) {
                // System.out.print(arr[j] + " ");
                res[k] = arr[j];
                j++;
            } else if (arr[j] >= arr[i]) {
                res[k] = arr[i];
                // System.out.print(arr[i] + " ");
                i++;
            }
            k++;
            // 6
            // 0 2 1 7 3 4
            // -4, 6, 9, -1, 3
            // 38, 27, 43, 3, 9, 82, 10
        }
        if (i == halfsize) {
            for (int p = j; p < size; p++) {
                // System.out.print(arr[p] + " ");
                res[k] = arr[p];
                k++;
            }
        } else if (j == size) {
            for (int p = i; p < halfsize; p++) {
                // System.out.print(arr[p] + " ");
                res[k] = arr[p];
                k++;
            }
        }
        // System.out.println(Arrays.toString(res));
        for (int g = 0; g < size; g++) {
            System.out.print(res[g] + " ");
        }

    }
}
