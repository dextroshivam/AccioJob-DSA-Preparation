import java.util.*;

public class pr93SumOfNaturalNumbers {
    public static int printNaturalNumbers(int n) {
        int sum = 0;
        for (int i = 1; i <= n; i++) {
            sum += i;
        }
        return sum;

    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        System.out.println(printNaturalNumbers(n));
    }
}