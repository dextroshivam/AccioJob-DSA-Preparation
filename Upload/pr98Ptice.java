import java.util.*;
import java.math.*;

public class pr98Ptice {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int size = sc.nextInt();
        String str = sc.next();

        String p1 = "ABC";
        String p2 = "BABC";
        String p3 = "CCAABB";

        int s1 = 0;
        int s2 = 0;
        int s3 = 0;

        for (int i = 0; i < size; i++) {
            if (str.charAt(i) == p1.charAt(i % 3)) {
                s1 += 1;
            }
            if (str.charAt(i) == p2.charAt(i % 4)) {
                s2 += 1;
            }
            if (str.charAt(i) == p3.charAt(i % 6)) {
                s3 += 1;
            }
        }
        int max = Math.max(s1, Math.max(s2, s3));
        System.out.println(max);
        if (max == s1) {
            System.out.println("Adrian");
        }
        if (max == s2) {
            System.out.println("Bruno");
        }
        if (max == s3) {
            System.out.println("Goran");
        }
    }
}
// 9
// AAAABBBBB

// Adrian

// Bruno

// Goran
