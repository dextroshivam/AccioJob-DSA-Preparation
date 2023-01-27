import java.util.*;

public class pr37ReverseDigitsOfANumber {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        // int temp = n;
        // String res = "";
        // int size = String.valueOf(n).length();
        // for (int i = size - 1; i >= 0; i--) {
        // res += String.valueOf(n).toCharArray()[i];
        // }
        // int index = size - 1;
        // for (int i = 0; i < size; i++) {

        // if (res.toCharArray()[i] != '0') {
        // index = i;
        // break;
        // }
        // }
        // if (index == size - 1) {
        // System.out.println(0);

        // } else {

        // System.out.println(res.substring(index, size));
        // }
        int r = 0;
        while (n != 0) {
            int unit = n % 10;
            n = n / 10;
            r = r * 10 + unit;

        }
        System.out.println(r);
    }
    // System.out.println(res);
}
