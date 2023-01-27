import java.util.*;

public class pr71PowerFinder {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        for (int j = 0; j < t; j++) {

            int a = sc.nextInt(), b = sc.nextInt();
            Long pow = (long) 1;
            for (int i = 0; i < b; i++) {
                pow = pow * a;
            }
            System.out.println(pow);
        }
    }
}
