import java.util.*;

public class pr4CelsiusToFehrenheit {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int res = ((n * 9) / 5) + 32;
        System.out.println(res);
    }
}