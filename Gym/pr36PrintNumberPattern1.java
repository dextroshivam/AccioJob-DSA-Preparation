import java.util.*;

public class pr36PrintNumberPattern1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        // int n = 7;
        int n = sc.nextInt();

        int ele = 1;
        // System.out.println(1);
        for (int i = 0; i < n; i++) {
            String s = "";
            ele = i + 1;
            for (int j = 0; j <= i; j++) {
                s += String.valueOf(ele);
                System.out.print(ele++ + " ");
            }
            // if (i != 0) {
            // // System.out.println(s);
            // ele = Integer.parseInt(String.valueOf(s.toCharArray()[1]));
            // // System.out.println("-----" + ele);
            // }
            // s = "";
            System.out.println();
        }
    }
}

// 1
// 23
// 345
// 4567
// 56789
// 67891011
// 78910111213