import java.util.*;

public class pr91Autori {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String str = sc.next();
        String strArr[] = str.split("-");
        String res = "";
        for (String i : strArr) {
            res += i.toCharArray()[0];
        }
        System.out.println(res);
    }
}
