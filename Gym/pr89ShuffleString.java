
/**
 * pr89ShuffleString
 */
import java.util.*;

public class pr89ShuffleString {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int arrSize = sc.nextInt();
        String str = sc.next();
        // System.out.println(arrSize);
        // System.out.println(str);
        int arr[] = new int[arrSize];
        for (int i = 0; i < arrSize; i++) {
            arr[i] = sc.nextInt();
        }
        char resArr[] = new char[arrSize];
        char charArr[] = str.toCharArray();
        for (int i = 0; i < arrSize; i++) {
            resArr[arr[i]] = charArr[i];
        }
        // System.out.println(Arrays.toString(resArr));
        for (char i : resArr) {
            System.out.print(i);
        }
        sc.close();
    }

}

// 8
// codeleet
// 4 5 6 7 0 2 1 3
