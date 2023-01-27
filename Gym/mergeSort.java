// public class mergeSort {

// }
/******************************************************************************

                            Online Java Compiler.
                Code, Compile, Run and Debug java program online.
Write your code in this editor and press "Run" button to execute it.

*******************************************************************************/
import java.util.*;

public class mergeSort {

    public static void merge(int start, int mid, int end, int arr[]) {
        int sorted[] = new int[end - start + 1];
        int i = start;
        int j = mid + 1;
        int k = 0;
        while (i <= mid && j <= end) {
            if (arr[i] < arr[j]) {
                sorted[k] = arr[i];
                k++;
                i++;
            } else {
                sorted[k] = arr[j];
                j++;
                k++;
            }
        }
        while (i <= mid) {
            sorted[k] = arr[i];
            k++;
            i++;
        }
        while (j <= mid) {
            sorted[k] = arr[j];
            k++;
            j++;
        }
        for (int p = 0; p < sorted.length; p++) {
            arr[start + p] = sorted[p];
        }
    }

    public static void mergeSort(int start, int end, int arr[]) {
        if (start >= end) {
            return;
        }
        int mid = start + (end - start) / 2;
        mergeSort(start, mid, arr);
        mergeSort(mid + 1, end, arr);
        merge(start, mid, end, arr);

    }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        // input array size
        int size = sc.nextInt();
        int arr[] = new int[size];
        for (int i = 0; i < size; i++) {
            arr[i] = sc.nextInt();
        }
        mergeSort(0, size - 1, arr);

        // 1 5 2 4 3
        for (int i = 0; i < size; i++) {
            System.out.print(arr[i] + " ");
        }
    }
}
// Algorithm
// use recursion to divide and conquor the array
// 1.d

// ivide the
// array in
// tow halves-->2.
// Sort the
// first and
// second halve-->3.
// merge the
// tow sorted halves

// pseudo code

// merge(start,mid,end,array){
// int sorted[]=new int[end-start+1];
// int i=start;
// int j=end;
// int k=0;
// while(i<=mid && j<=end){
// if(arr[i]<arr[j]){
// sorted[k]=arr[i];
// k++;i++;
// }else{
// sorted[k]=arr[j];
// j++;k++;
// }
// }
// while(i<=mid){
// sorted[k]=arr[i];
// k++;i++;
// } while(j <=mid){
// sorted[k]=arr[j];
// k++;j++;
// }
// for(int p=0;p<arr.length;p++){
// arr[start+p]=sorted[p];
// }
// }

// mergeSort(start,end,array){
// if(start==end){
// return;
// }
// mid=start+(end-start)/2;
// mergeSort(start,mid,array);
// mergeSort(mid+1,end,array);
// merge(start,mid,end,array);

// }
