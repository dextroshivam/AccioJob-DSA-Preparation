import java.util.*;

public class pr105ValidPassword {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String str = sc.next();
        boolean flag = false;

        if (str.length() >= 8 && str.length() <= 15) {
            flag = true;
        } else {
            System.out.println("false");
            return;
        }
        for (int i = 0; i < str.length(); i++) {
            if ((str.charAt(i) >= '0' && str.charAt(i) <= '9')) {
                flag = true;
                break;
            }
        }
        for (int i = 0; i < str.length(); i++) {
            if ((str.charAt(i) >= 'a' && str.charAt(i) <= 'z')) {
                flag = true;
                break;
            }
        }
        for (int i = 0; i < str.length(); i++) {
            if ((str.charAt(i) >= 'A' && str.charAt(i) <= 'Z')) {
                flag = true;
                break;
            }
        }
        for (int i = 0; i < str.length(); i++) {
            if ((str.charAt(i) == '@') || (str.charAt(i) == '#') || (str.charAt(i) == '%') || (str.charAt(i) == '&')
                    || (str.charAt(i) == '!') || (str.charAt(i) == '$') || (str.charAt(i) == '*')) {
                flag = true;
                break;
            }
        }
        if (flag) {
            System.out.println("true");
        } else {
            System.out.println("false");
        }
    }
}
// @, #, %, &, !, $, *