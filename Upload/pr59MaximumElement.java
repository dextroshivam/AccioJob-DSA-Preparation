import java.util.*;
import java.math.*;

public class pr59MaximumElement {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String str = sc.nextLine();
        String arr[] = str.split(" ");

        int max = Integer.parseInt(arr[0]);
        // System.out.println(max);
        for (String i : arr) {
            int ele = Integer.parseInt(i);
            if (ele > max) {
                max = ele;
            }
        }
        System.out.println(max);

        // int arr[];
        // int max = arr[0];
        // for (int i : arr) {
        // if (i > max) {
        // max = i;
        // }
        // }
        // System.out.println(max);

    }
}
