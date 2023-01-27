import java.util.*;

public class pr95FindFirstandLastPositionofElementinSortedArray {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int arrSize = sc.nextInt(), target = sc.nextInt();
        int first = -1;
        int last = -1;
        int arr[] = new int[arrSize];
        for (int i = 0; i < arrSize; i++) {
            arr[i] = sc.nextInt();
        }

        for (int i = 0; i < arrSize; i++) {
            if (arr[i] == target) {
                first = i;
                break;
            }
        }
        for (int i = arrSize - 1; i >= 0; i--) {
            if (arr[i] == target) {
                last = i;
                break;
            }
        }
        System.out.println(first);
        System.out.println(last);

    }
}
