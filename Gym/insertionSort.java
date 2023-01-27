
/******************************************************************************

                            Online Java Compiler.
                Code, Compile, Run and Debug java program online.
Write your code in this editor and press "Run" button to execute it.

*******************************************************************************/
import java.util.*;

public class insertionSort {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        // input array size
        int size = sc.nextInt();
        int arr[] = new int[size];
        for (int i = 0; i < size; i++) {
            arr[i] = sc.nextInt();
        }

        // Selection sort
        for (int i = 1; i < size; i++) {

            int j = i - 1;
            int cur = arr[i];
            while (j >= 0 && cur < arr[j]) {
                // int temp = arr[j + 1];
                arr[j + 1] = arr[j];
                // arr[j] = temp;
                j--;

            }
            if (j != i - 1) {
                arr[j + 1] = cur;
            }

            for (int k = 0; k < size; k++) {
                System.out.print(arr[k] + " ");
            }
            System.out.println();
        }
        // 1 5 2 4 3

        for (int i = 0; i < size; i++) {
            System.out.print(arr[i] + " ");
        }
    }
}

// // Algorithm
// 1.pick element one by one from the array with pointer i -->
// 2. place them to there resective sorted postion till the latest traversed
// index.
// 2.1 ---> traverse in negetive direction with pointer j, until we find any
// smaller or equal element
// 2.2 ---> swap the ith element with the j+1 element

// // pseudo code
// for i in range(1,size-1){
// int j=i;
// while(arr[i]<arr[j]){
// j--;
// }

// if(j!=i){
// swap(arr[j+1],arr[i]);
// }
// }
