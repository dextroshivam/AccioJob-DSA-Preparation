
/**
 * pr26ASimpleFraction
 */
import java.util.*;

public class pr26ASimpleFraction {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int k = sc.nextInt();
        double res = (double) n / k;
        int int_part = (int) res;
        double deci_part = (double) res - int_part;
        String str_res = String.valueOf(res);
        String str_deci_res = String.valueOf(deci_part);
        char char_list[] = new char[str_deci_res.length()];
        char_list = str_deci_res.toCharArray();
        boolean flag = false;
        char ele = char_list[2];
        for (int i = 3; i < char_list.length; i++) {
            if (char_list[i] != ele) {
                flag = false;
                break;
            } else {
                flag = true;
            }
        }
        if (n % k == 0) {
            System.out.println((int) res);
        } else {
            if (flag) {
                str_res = String.valueOf(int_part) + ".(" + ele + ")";
                System.out.println(str_res);
            } else {
                System.out.println(str_res);

            }
        }

    }
}
