import java.util.*;

public class pr92Hey {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s = sc.next();
        String middle = s.substring(1, s.length() - 1);
        String res = s.substring(0, 1) + middle + middle + s.substring(s.length() - 1, s.length());
        // System.out.println(middle);
        // System.out.println();
        System.out.println(res);
    }
}
