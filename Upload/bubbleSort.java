
import java.util.*;

public class bubbleSort {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        // input array size
        int size = sc.nextInt();
        int arr[] = new int[size];
        for (int i = 0; i < size; i++) {
            arr[i] = sc.nextInt();
        }

        // Bubble sort

        for (int i = 0; i < size - 1; i++) {// as the last element will always be sorted we are using size-1;
            for (int j = 0; j < size - 1 - i; j++) { // as the elements are beeing sorted one by one , we are decreasing
                                                     // the window size of j; by size-1-i
                if (arr[j] > arr[j + 1]) {
                    // swaping and taking the larger values to the right side;
                    int temp = arr[j];
                    arr[j] = arr[j + 1];
                    arr[j + 1] = temp;
                }
            }
        }

        for (int i = 0; i < size; i++) {
            System.out.print(arr[i] + " ");
        }

        // System.out.println("Hello World");
    }
}
// Algorithm
// we have to comapare the adjecent elements -->
// we have to swap maximum element to the right side -->
// if element is alrweady on the right side = no swap.

// pseudocode
// for i in range(size-1){
// for j in range(size-1){
// if(arr[j]>arr[j+1]){
// swapping and taking the larger element to the right side;
// swap(arr[j],arr[j+1]);
// }
// }
// }
// }

// public class bubbleSort {

// }
