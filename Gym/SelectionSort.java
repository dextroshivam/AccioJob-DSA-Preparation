
// importing required libraries
import java.util.*;

public class SelectionSort {
    public static void main(String args[]) {
        // making Scanner object
        Scanner sc = new Scanner(System.in);
        int size = sc.nextInt(); // array size input
        int arr[] = new int[size];
        // input array elements
        for (int i = 0; i < size; i++) {
            arr[i] = sc.nextInt();
        }

        for (int i = 0; i < size - 1; i++) {
            int minindex = i;
            for (int j = i; j < size; j++) {
                if (arr[j] < arr[i]) {
                    minindex = j;
                }
            }
            if (minindex != i) {

                int temp = arr[minindex];
                arr[minindex] = arr[i];
                arr[i] = temp;
            }
        }

        // printint array
        for (int i = 0; i < size; i++) {
            System.out.print(arr[i] + " ");
        }

    }
}
