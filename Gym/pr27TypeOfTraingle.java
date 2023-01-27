
/**
 * pr27TypeOfTraingle
 */
import java.util.*;

public class pr27TypeOfTraingle {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt(), b = sc.nextInt(), c = sc.nextInt();
        int sqa = a * a;
        int sqb = b * b;
        int sqc = c * c;
        int max = 0;
        if (a == b && a == c) {
            max = a;
        } else if (a > b && a > c) {
            max = a;
        } else if (b > a && b > c) {
            max = b;
        } else {
            max = c;
        }
        // int maxsq = max * max;
        if (max == a) {
            if (sqa == sqb + sqc) {
                System.out.println(2);
            } else if (sqa < sqb + sqc) {
                System.out.println(1);
            } else {
                System.out.println(3);
            }
        } else if (max == b) {
            if (sqb == sqa + sqc) {
                System.out.println(2);
            } else if (sqb < sqa + sqc) {
                System.out.println(1);
            } else {
                System.out.println(3);
            }
        } else if (max == c) {
            if (sqc == sqb + sqa) {
                System.out.println(2);
            } else if (sqc < sqb + sqa) {
                System.out.println(1);
            } else {
                System.out.println(3);
            }
        }
    }

}