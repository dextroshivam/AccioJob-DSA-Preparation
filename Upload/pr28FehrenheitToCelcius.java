import java.util.*;

public class pr28FehrenheitToCelcius {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        int a = (n - 32) * (5);
        int res = a / 9;
        System.out.println(res);
    }
}
