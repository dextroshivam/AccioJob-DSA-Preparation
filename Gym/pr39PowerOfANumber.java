import java.util.*;

public class pr39PowerOfANumber {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt(), b = sc.nextInt();
        int pow = 1;
        for (int i = 0; i < b; i++) {
            pow = pow * a;
        }
        System.out.println(pow);
    }
}
